import javax.swing.JPanel;


public class TestCar implements ICar {

	
	IUserPanelQueue usePanelQueue = null;
	@Override
	public JPanel createCar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICarController getCarController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCurrentFloorNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IUserPanelQueue getUserPanelQueue() {
		// TODO Auto-generated method stub
		return usePanelQueue;
	}

	@Override
	public void setCarController(ICarController arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCurrentFloorNumber(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDoor(IDoor arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setUserPanel(IUserPanel arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public IAlarm getAlarm() {
		return null;
	}

	@Override
	public void setAlarm(Alarm alarm) {
	}

	@Override
	public void setUserPanelQueue(IUserPanelQueue arg0) {
		this.usePanelQueue = arg0;

	}

	@Override
	public IDoor getDoor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarStatus getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IUserPanel getUserPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void moveDown(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveUp(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatus(CarStatus arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IDoorPanel getDoorPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDoorPanel(IDoorPanel arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCarType(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCarType() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCarID(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCarID() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void raiseAlarm() {

	}
	
	public void resetAlarm() {
	}
	
	public boolean isAlarmRaised() {
		return false;
	}
}
