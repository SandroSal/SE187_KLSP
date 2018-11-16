//import java.awt.GridLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout; //import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FloorPanelUI extends JPanel {
	
	
	FloorPanel floorPanel;
	JButton UpButton = null;
	JButton DownButton = null;
	int currentFloorNumber = 1;
	FloorPanelColor activeButtonColor = null;
	FloorPanelColor buttonColor = null;
	//New add
	JTextField textCarID = null;
	JTextField textCarType = null;
	//
	
	public FloorPanelUI(FloorPanel floorPanel, FloorPanelColor buttonColor,
						FloorPanelColor activeButtonColor, int CurrentFloorNumber, String upText,
						String downText, int carID,int carType, Alarm alarm) {
		
		this.currentFloorNumber = CurrentFloorNumber;
		this.floorPanel = floorPanel;
		this.activeButtonColor = activeButtonColor;
		this.buttonColor = buttonColor;
		
		
		
		setLayout(new GridBagLayout());
		JLabel label = new JLabel("FloorNumber "+CurrentFloorNumber);
		// ******* new add
		JLabel carIDLabel = new JLabel("ID:");
		JLabel carTypeLabel= new JLabel("Type:");
		//
		//new add
		textCarID = new JTextField(2);
		textCarID.setText("-");
		textCarType = new JTextField(7);
		textCarType.setText("-");
		add(carIDLabel);
		add(textCarID);
		add(carTypeLabel);
	    add(textCarType);
		//
		add(label);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridy = 1;
		
		UpButton = new JButton(upText);
		UpButton.setBackground(buttonColor.getJColor());
		UpListener upListener = new UpListener();
		UpButton.addActionListener(upListener);
		add(UpButton, gbc);
		gbc.gridy = 2;
		gbc.gridx = 0;
		
		DownButton = new JButton(downText);
		DownButton.setBackground(buttonColor.getJColor());
		DownListener downListener = new DownListener();
		DownButton.addActionListener(downListener);
		add(DownButton, gbc);
		gbc.gridy = 3;
		gbc.gridx = 0;
		String type = "FloorPanelAlarm";
		add(alarm.createAlarmUI(type, 0), gbc);
		alarm.getAlarmUI().disableAlarmButton();
	}
	
	
	void disableUpButton(){
		System.out.println("Inside DIsable");
		UpButton.setEnabled(false);
			
	}

	
	void disableDownButton(){
		DownButton.setEnabled(false);
	}
	
	void processedRequest(){
		setCarDefault();
		UpButton.setBackground(buttonColor.getJColor());
		DownButton.setBackground(buttonColor.getJColor());
		//setCurrentCarID(floorPanel.getCarID());
		//setCarDefault();
	}
	
	private class UpListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			UpButton.setBackground(activeButtonColor.getJColor());
			System.out.println("inside up button");
			floorPanel.setFloorPanelStatus("Active");
			floorPanel.getFloorPanelQueueType().putFloorRequest(currentFloorNumber, Direction.UP);
			//setCarDefault();
			
			
			//setCurrentCarID(floorPanel.getCarID());
			//setCurrentCarType(floorPanel.getCarType());
			//new add ==> change a number when this moving
			
			//setCurrentCarID(floorPanel.getCarID());
			//System.out.println("UpListener"+floorPanel.getCarID());
		}
	}

	private class DownListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			DownButton.setBackground(activeButtonColor.getJColor());
			System.out.println("inside down button");
			floorPanel.setFloorPanelStatus("Active");
			floorPanel.getFloorPanelQueueType().putFloorRequest(currentFloorNumber, Direction.DOWN);
			//setCarDefault();
			
			//setCurrentCarID(floorPanel.getCarID());
			//setCurrentCarType(floorPanel.getCarType());
			//System.out.println("DownListener"+floorPanel.getCarID());
		}
	}
	
	// ************** Newly add ***********//
	
	public void setCurrentCarID(int carID){
	//	if (textCarID.toString() == "0"){
			textCarID.setBackground(Color.yellow);
			textCarID.setText(new Integer(carID).toString());
	/*	}else{
			textCarID.setBackground(Color.white);
			textCarID.setText("0");
		}
		*/
	}
	public void setCurrentCarType(int carType){
		textCarType.setBackground(Color.yellow);
		if(carType == 0)
			textCarType.setText("Normal");
		else if(carType == 1)
			textCarType.setText("Odd");
		else
			textCarType.setText("Even");
		
	}
	
	public void setCarDefault(){
		textCarID.setBackground(Color.white);
		textCarID.setText("-");
		textCarType.setBackground(Color.white);
		textCarType.setText("-");
	}
	//************************************//
}
