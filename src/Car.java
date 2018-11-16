import javax.swing.JPanel;

public class Car implements ICar {

	int currentFloorNumber = 1;

	IDoor door = null;

	String carName = "Car";

	IUserPanel userPanel = null;
	
	IDoorPanel doorPanel = null;

	CarUI carUI = null;
	
	ICarController carController = null;
	
	IUserPanelQueue queue = null;

	CarStatus status = CarStatus.IDLE;
	
	CarRunnable carRunnable = null;
	
	Thread carThread = null;

	Alarm alarm = null;

	//************** Newly add *****************//
	public int carType= 0;
	
	
	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public int carID= 0;
	
	
	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}
	//********************************************//
	public Car() {

		carRunnable = new CarRunnable();
		carThread = new Thread(carRunnable);
	}

	public ICarController getCarController() {
		return carController;
	}

	public void setCarController(ICarController carController) {
		this.carController = carController;
	}

	public JPanel createCar() {
		
		carUI = new CarUI(currentFloorNumber, carName, door, userPanel, doorPanel, alarm, carID, carType);
		return carUI;
	}

	public int getCurrentFloorNumber() {
		return currentFloorNumber;
	}

	public void setCurrentFloorNumber(int currentFloorNumber) {
		this.currentFloorNumber = currentFloorNumber;
		if(carUI!=null)
			carUI.setCurrentFloorNumber(currentFloorNumber);
	}

	public IDoor getDoor() {
		return door;
	}

	public void setDoor(IDoor door) {
		this.door = door;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public IUserPanel getUserPanel() {
		return userPanel;
	}

	public void setUserPanel(IUserPanel userPanel) {
		this.userPanel = userPanel;
	}

	@Override
	public IAlarm getAlarm() {
		return alarm;
	}

	@Override
	public void setAlarm(Alarm alarm) {
		this.alarm = alarm;
	}

	@Override
	public IUserPanelQueue getUserPanelQueue() {
		return queue;
	}

	@Override
	public void setUserPanelQueue(IUserPanelQueue userPanelQueue) {
		this.queue = userPanelQueue;
		
	}

	@Override
	public void moveDown(int destinationFloorNo) {
		setStatus(CarStatus.MOVING_DOWN);
		carRunnable = new CarRunnable();
		carThread = new Thread(carRunnable);
		carRunnable.setCar(this);
		carRunnable.setDestinationFloorNumber(destinationFloorNo);
		carRunnable.setDirection("DOWN");
		carThread.start();
		
		
	}

	@Override
	public synchronized void  moveUp(int destinationFloorNo) {
		
		setStatus(CarStatus.MOVING_UP);		
		carRunnable = new CarRunnable();
		carThread = new Thread(carRunnable);
		carRunnable.setCar(this);
		carRunnable.setDestinationFloorNumber(destinationFloorNo);
		carRunnable.setDirection("UP");
		carThread.start();
		
		
		
		
		
	}

	@Override
	public CarStatus getStatus() {
		return status;
	}

	@Override
	public void setStatus(CarStatus status) {
		this.status = status;
		carUI.setCarStatus(status);
		
	}

	@Override
	public IDoorPanel getDoorPanel() {
		return doorPanel;
	}

	@Override
	public void setDoorPanel(IDoorPanel doorPanel) {
		this.doorPanel = doorPanel;
		
	}


}


class CarRunnable implements Runnable {
	
	ICar car = null;

	int destinationFloorNumber = 0;
	
	String direction = null;
	
	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public void setCar(ICar car) {
		this.car = car;
	}

	public void setDestinationFloorNumber(int destinationFloorNumber) {
		this.destinationFloorNumber = destinationFloorNumber;
	}
	
	public CarRunnable(){
		
	}
	
	public CarRunnable(ICar car, int destinationFloorNumber){
		
		this.car = car;
		
		this.destinationFloorNumber = destinationFloorNumber;
	}

	@Override
	public void run() {
		
		if(direction.equalsIgnoreCase("UP")){
			synchronized(car){
				while(car.getCurrentFloorNumber() != destinationFloorNumber &&
					  !car.getAlarm().isAlarmRaised() ){
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					car.setCurrentFloorNumber(car.getCurrentFloorNumber() + 1 );
				}
				car.setStatus(CarStatus.STOPPED);
				
				try {
					Thread.currentThread().sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Reached destination "+ destinationFloorNumber);
				car.notifyAll();
			}
		}else{
			synchronized(car){
				while(car.getCurrentFloorNumber() != destinationFloorNumber &&
						!car.getAlarm().isAlarmRaised() ){
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					car.setCurrentFloorNumber(car.getCurrentFloorNumber() -1 );
				}
				car.setStatus(CarStatus.STOPPED);
				
				try {
					Thread.currentThread().sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Reached destination "+ destinationFloorNumber);
				car.notifyAll();
			}
		}
		
	}
	
	
}
