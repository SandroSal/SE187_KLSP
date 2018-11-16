import java.util.ArrayList;
import java.util.List;


public class MetaController implements IMetaController {
	
	private List<ICar> lstCars = new ArrayList<ICar>();
	
	//******************* Newly add ********************//
	private List<ICar> oddListCars = new ArrayList<ICar>();
	private List<ICar> evenListCars = new ArrayList<ICar>();
	private int carID = 0;

	//**************************************************//
	
	private IAlgorithm algorithm = null;

	public void setAlgorithm(IAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	@Override
	public void processRequest(int destinationFloorNumber, Direction direction) {
		
		//Del this part ===> ICar car = algorithm.findBestCar(lstCars,direction,destinationFloorNumber);
		//***************** Newly add this part **************//
		ICar car = null;
		
		if(destinationFloorNumber%2 == 0)
			car = algorithm.findBestCar(evenListCars,direction,destinationFloorNumber);
		else
			car = algorithm.findBestCar(oddListCars,direction,destinationFloorNumber);
		
		//setCarID(carID);
		//System.out.println("2222222" +getCarID()+"222222222222");
		//*****************************************************//
		
		car.getUserPanelQueue().putMessage(destinationFloorNumber);
		//this.floorindicator.setCarID(car.getCarID());
		//System.out.println("== Car ID in Meta= " +car.getCarID()+"==");
		//setCarID(car.getCarID());
		
	}

	@Override

	// Modify ====> public void registerCar(ICar car) {
	
	public void registerCar(ICar car, int i) {
		if(car != null){
			//Del this part ====> lstCars.add(car);
			//**************** Newly add *****************//
			if(car.getCarType()== 0){
				evenListCars.add(car);
				oddListCars.add(car);
			}
			else if(car.getCarType()% 2 == 1)
				oddListCars.add(car);
			else 
				evenListCars.add(car);
			//*******************************************//
			
		}
		
	}
	
	public int getCarID() {
		return carID;
	}
	public void setCarID(int carID) {
		this.carID = carID;
	}
	
	
}
