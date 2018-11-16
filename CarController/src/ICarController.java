import java.util.List;


public interface ICarController {

	public void stopCar();
	
	void processRequest(int floorNumber, Direction direction);
		
	void setCar(ICar icar);
	
	void processDoorRequest(DoorCommand doorCommand);
	
	void setFloorPanel(IFloorPanel floorPanel);
		
	public IFloorPanel getFloorPanel();

}
