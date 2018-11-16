import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomAlgorithm implements IAlgorithm {

	@Override
	public ICar findBestCar(List<ICar> lstCars, Direction direction,
			int destinationFloorNumber) {
		
		ICar bestCar = null;
		
		if(lstCars.size() ==1){
			bestCar = lstCars.get(0);
			return bestCar;
		}

		// Copy the car list
		List<ICar> remainingCars = new ArrayList<ICar>();
		for(int carIdx=1; carIdx<lstCars.size(); carIdx++) {
			remainingCars.add(lstCars.get(carIdx));
		}

		Random generator = new Random();
		for(int carIdx=1; carIdx<lstCars.size(); carIdx++) {
			int randomInt = generator.nextInt(remainingCars.size());
			if( !remainingCars.get(randomInt).getAlarm().isAlarmRaised() ) {
				bestCar = remainingCars.get(randomInt);
				break;
			} else {
				remainingCars.remove(randomInt);
			}
		}
		
		
		return bestCar;
	}

}
