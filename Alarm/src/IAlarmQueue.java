
public interface IAlarmQueue {

	void putRequest(AlarmCommand alarmCmd, int ID);

	void setAlarm(Alarm alarm);
	
}
