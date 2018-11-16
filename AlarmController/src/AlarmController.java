import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AlarmController implements IAlarmController {

	ICar car = null;

	LinkedList alarmQueue = new LinkedList();

	IFloorPanel floorPanel = null;

	@Override
	public void processRequest(AlarmCommand alarmCmd, Integer ID) {
	
		car.getCarController().getFloorPanel().processAlarm(alarmCmd, ID);
		car.getUserPanelQueue().setAlarmCmd(alarmCmd);
		car.getCarController().stopCar();
	}

	@Override
	public void setCar(ICar car) {
		this.car = car;

	}

	@Override
	public void setFloorPanel(IFloorPanel floorPanel) {
		this.floorPanel =  floorPanel;
		
	}

}
