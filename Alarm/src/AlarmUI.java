import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AlarmUI extends JPanel {

	static String alarmLight = "Red non Flashing";
    final Color[] blinkColors = {Color.RED, null};
    Timer alarmBtnTimer = null;
    
	JButton alarmButton = null;

	String alarmText = "ALARM";
	String resetAlarmText = "RESET ALARM";
	boolean alarmRaised = false;

	IAlarmController alarmController;
	IAlarmQueue alarmQueue;

	public AlarmUI (IAlarmQueue alarmQ, IAlarmController alarmCtrl) {
		alarmQueue = alarmQ;
		alarmController = alarmCtrl;
		
		alarmButton = new JButton(alarmText);
		
		alarmBtnTimer = new Timer(750, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if( blinkColors[0] == alarmButton.getBackground() ) {
                    alarmButton.setBackground(blinkColors[1]);            		            		
            	} else {
                    alarmButton.setBackground(blinkColors[0]);
                }
            }
        });

        
		AlarmListener alarmListener = new AlarmListener();
		alarmButton.addActionListener(alarmListener);
		add(alarmButton);
	}

	public static void setAlarmLight(String alarmLight) {
		AlarmUI.alarmLight = alarmLight;
	}

	void disableAlarmButton(){
		alarmButton.setEnabled(false);
	}
	
    void raiseAlarm( ){
		if( alarmLight == "Red non Flashing" ) {
			alarmButton.setBackground(Color.RED);
		} else {
			alarmBtnTimer.start();
		}
		alarmRaised = true;
	}		

	void resetAlarm( ){
		alarmBtnTimer.stop();
		alarmButton.setBackground(null);
		alarmRaised = false;
	}
	
	boolean isAlarmRaised(){
		return alarmRaised;
	}

	void toggleAlarm() {
		if( alarmButton.getText() == alarmText ) {
			alarmButton.setText(resetAlarmText);
			raiseAlarm();
			alarmQueue.putRequest(AlarmCommand.RAISE);
		} else {
			alarmButton.setText(alarmText);
			resetAlarm();
			alarmQueue.putRequest(AlarmCommand.STOP);
		}
	}

	private class AlarmListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			toggleAlarm();
		}
	}
}