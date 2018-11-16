
public interface IMetaController {
	
//	IFloorIndicator floorIndicator = null;
	void processRequest(int destinationFloorNumber, Direction direction);
	
	//Modify ===> void registerCar(ICar car);
	
	void registerCar(ICar car, int i);
	
	void setAlgorithm(IAlgorithm algorithm);
	void setCarID(int carID);
	int getCarID();

}
