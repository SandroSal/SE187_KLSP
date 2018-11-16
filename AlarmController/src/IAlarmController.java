import java.util.List;


public interface IAlarmController {

	void setCar(ICar icar);
		
	void setFloorPanel(IFloorPanel floorPanel);
		
	public void processRequest(AlarmCommand alarmCmd);
	
}
