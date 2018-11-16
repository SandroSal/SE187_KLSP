import javax.swing.JPanel;


public interface IAlarm {

	JPanel createAlarmUI(String type, int carID);
	
	boolean isAlarmRaised();

}