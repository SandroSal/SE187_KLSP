import java.util.LinkedList;

public class AlarmQueue implements IAlarmQueue {

	protected LinkedList<AlarmCommand> alarmRequest = new LinkedList<AlarmCommand>();

	public AlarmQueue() {
	}

	@Override
	public void setAlarm(Alarm alarm) {
		Thread alarmMonitorThread = new Thread(
				new AlarmMonitorThread(alarm));
		alarmMonitorThread.start();
	}
	
	@Override
	public void putRequest(AlarmCommand alarmCmd) {
		alarmRequest.offer(alarmCmd);
	}

	class AlarmMonitorThread implements Runnable {

		Alarm alarm = null;

		public AlarmMonitorThread(Alarm alarm){
			this.alarm = alarm;
		}

		@Override
		public void run() {
			while(true) {
				try {
					if( alarmRequest.size() != 0) {
						alarm.getAlarmController().processRequest(alarmRequest.pop());
					}

					Thread.sleep(1000);
					

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

}
