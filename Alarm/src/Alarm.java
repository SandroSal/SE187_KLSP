import javax.swing.JPanel;

public class Alarm implements IAlarm {

	AlarmUI alarmUI;
	IAlarmController alarmController;
	IAlarmQueue alarmQueue;

	public Alarm() {
		alarmQueue = new AlarmQueue();
		alarmController = new AlarmController();
	}
	
	public JPanel createAlarmUI() {
		alarmUI = new AlarmUI(alarmQueue, alarmController);
		alarmQueue.setAlarm (this);
		
		return alarmUI;
	}

	public IAlarmQueue getAlarmQueue() {
		return alarmQueue;
	}

	public void setAlarmQueue(IAlarmQueue alarmQ) {
		this.alarmQueue = alarmQ;
	}
	
	public IAlarmController getAlarmController() {
		return alarmController;
	}

	public void setAlarmController(AlarmController alarmController) {
		this.alarmController = alarmController;
	}

	public AlarmUI getAlarmUI() {
		return alarmUI;
	}

	public boolean isAlarmRaised() {
		return alarmUI.isAlarmRaised();
	}
}
