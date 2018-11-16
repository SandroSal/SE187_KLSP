import java.util.ArrayList;
import java.util.List;


public class ShortestPathAlgorithm implements IAlgorithm {

	@Override
	public ICar findBestCar(List<ICar> lstCars, Direction direction, int destinationFloorNumber) {
		
		
				
		ICar bestCar = null;
		int pathLength = 0;
		
		if(lstCars.size() ==1){
			bestCar = lstCars.get(0);
			return bestCar;
		}
		
		System.out.println(lstCars.get(0).getUserPanelQueue());
		pathLength = lstCars.get(0).getUserPanelQueue().pathLength(direction, destinationFloorNumber);
		bestCar = lstCars.get(0);
		
		for(int i=1; i< lstCars.size(); i++){			
			
			ICar car = lstCars.get(i);
			
			System.out.println("Inside loop ..."+ car + " "+i );
			if( !bestCar.getAlarm().isAlarmRaised() &&
				pathLength < car.getUserPanelQueue().pathLength(direction, destinationFloorNumber)){
				 
				
			}else if( !car.getAlarm().isAlarmRaised() ){
				pathLength = car.getUserPanelQueue().pathLength(direction, destinationFloorNumber);
				bestCar = lstCars.get(i); 
			}
		}
		
		System.out.println("-------------"+ pathLength + "" +bestCar);
		// TODO Auto-generated method stub
		return bestCar;
	}
	
	
	public static void main(String args[]){
		ICar car1 = new Car();
		ICar car2 = new Car();
		ICar car3 = new Car();
		
		ICarController carController1 = new CarController();
		ICarController carController2 = new CarController();
		ICarController carController3 = new CarController();
		
		IUserPanelQueue q1 = new UserPanelQueue();
		IUserPanelQueue q2 = new UserPanelQueue();
		IUserPanelQueue q3 = new UserPanelQueue();
		
		car1.setCurrentFloorNumber(3);
		car2.setCurrentFloorNumber(4);
		car3.setCurrentFloorNumber(5);
		q1.setCar(car1);
		q2.setCar(car2);
		q3.setCar(car3);
		
		q1.putMessage(3);
		q1.putMessage(2);
		q1.putMessage(4);
		q1.putMessage(5);
		
		
		car1.setCarController(carController1);
		car2.setCarController(carController2);
		car3.setCarController(carController3);
		
		car1.setUserPanelQueue(q1);
		car2.setUserPanelQueue(q2);
		car3.setUserPanelQueue(q3);
		
		List<ICar> a =  new ArrayList<ICar>();
		
		a.add(car1);
		a.add(car2);
		a.add(car3);
		
		IAlgorithm al = new ShortestPathAlgorithm();
		
		al.findBestCar(a, Direction.UP, 1);
		
		
	}
	
	
}
