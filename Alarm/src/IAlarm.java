import javax.swing.JPanel;


public interface IAlarm {

	JPanel createAlarmUI();
	
	boolean isAlarmRaised();

}