
public interface IAlarmQueue {

	void putRequest(AlarmCommand alarmCmd);

	void setAlarm(Alarm alarm);
	
}
