import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class ElevatorConfigurationReader {

	/**
	 * @param args
	 */
	public static void showElevator() {
		
		//Setting layout 
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		JPanel completeFloorPanel = new JPanel();
		completeFloorPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		int centerrow = 0;
		gbc.gridx = 0;
		gbc.gridy = centerrow;
		
		//Setting number of floors and cars
		int numberOfFloors = GuiConfiguration.getNumOfFloors();
		int numberOfCars = GuiConfiguration.getNumOfCars();
		UserPanelConfiguration.setNumberFloors(numberOfFloors);
		
		//Setting floorpanel configuration
		FloorPanelConfiguration.setButtonColor(resolveFloorPanelColor(GuiConfiguration.getFloorPanelColor()));
		FloorPanelConfiguration.setActiveButtonColor(resolveFloorPanelColor(GuiConfiguration.getFloorPanelPressedButtonColor()));
		FloorPanelConfiguration.setTextType(GuiConfiguration.getFloorPanelDisplay());
		
		//Setting userpanel configuration
		UserPanelConfiguration.setButtonColor(resolveUserPanelColor(GuiConfiguration.getUserPanelColor()));
		UserPanelConfiguration.setActiveButtonColor(resolveUserPanelColor(GuiConfiguration.getUserPanelPressedButtonColor()));
		
		//String doorpanel configuration
		DoorPanelConfiguration.setTextType(GuiConfiguration.getDoorPanelDisplay());
		
		//Setting algorithm configuration
		AlgorithmConfiguration.setAlgorithm(GuiConfiguration.getAlgorithmType());
		
		//Setting alarmLight configuration
		AlarmUI.setAlarmLight(GuiConfiguration.getAlarmLight());

		//Setting door configuration
		List<IDoor> lstDoors = new ArrayList<IDoor>();
		String doorConfiguration = GuiConfiguration.getDoorConfiguration();
		if(doorConfiguration.trim().equalsIgnoreCase("Alternate Single/Double Door")){
			for(int index = 0; index < numberOfCars; index++){
				if(index%2==0){
					DoorConfiguration.setDoorType("singledoor");
					
				}else{
					DoorConfiguration.setDoorType("doubledoor");
					
				}
				lstDoors.add(DoorFactory.createDoor());;
			}
		}else if(doorConfiguration.trim().equalsIgnoreCase("Single Door")){
			for(int index = 0; index < numberOfCars; index++){
				DoorConfiguration.setDoorType("singledoor");
				lstDoors.add(DoorFactory.createDoor());;
			}
		}else if(doorConfiguration.trim().equalsIgnoreCase("Double Door")){
			for(int index = 0; index < numberOfCars; index++){
				DoorConfiguration.setDoorType("doubledoor");
				lstDoors.add(DoorFactory.createDoor());;
			}
		}
		
		
		IMetaController metaController = MetaControllerFactory.getMetaControllerInstance();
		
		IFloorPanelQueue floorPanelQueue = new FloorPanelQueue();
		
		floorPanelQueue.setMetaContoller(metaController);
		
		IFloorPanel ifloorPanel = null;
		
		gbc.gridy = centerrow++;
		
				
		for(int j=numberOfFloors;j>=1;j--)
		{				
			 ifloorPanel = FloorPanelFactory.createFloorPanel();
			JPanel panel = ifloorPanel.createFloorPanel(j);
			if(j==numberOfFloors)
				ifloorPanel.disableUpButton();
			if(j==1){
				ifloorPanel.disableDownButton();
			}
			
			ifloorPanel.setFloorPanelQueueType(floorPanelQueue);
			completeFloorPanel.add(panel, gbc);
			gbc.gridy = centerrow++;
		}
		frame.add(completeFloorPanel);
		// Car list
		for(int i=0;i<numberOfCars;i++){
			 ICar car = CarFactory.getCarInstance();
			 
			 IUserPanel userPanel = UserPanelFactory.getUserPanelInstance();
			 
			 
			 IUserPanelQueue userPanelQueue = new UserPanelQueue();
			 ICarController carController = new CarController();
			 IDoorPanel doorPanel = DoorPanelFactory.createDoorPanel();
			 IDoor door = lstDoors.get(i);
			 
			 //Set car properties
			 car.setUserPanel(userPanel);
			 car.setUserPanelQueue(userPanelQueue);
			 car.setCarController(carController);
			 car.setDoor(door);
			 car.setDoorPanel(doorPanel);
			 //Setting Odd Even
			//********************* Newly add ******************//
			car.setCarID(i+1); 
			 
			if (i == 0){
				if(GuiConfiguration.getCar1Type()== "Normal")
					car.setCarType(0);
				if(GuiConfiguration.getCar1Type()== "Odd")
					car.setCarType(1);
				if(GuiConfiguration.getCar1Type()== "Even")
					car.setCarType(2);
			}
			if (i == 1){
				if(GuiConfiguration.getCar2Type()== "Normal")
					car.setCarType(0);
				if(GuiConfiguration.getCar2Type()== "Odd")
					car.setCarType(1);
				if(GuiConfiguration.getCar2Type()== "Even")
					car.setCarType(2);
			}
			if (i == 2){
				if(GuiConfiguration.getCar3Type()== "Normal")
					car.setCarType(0);
				if(GuiConfiguration.getCar3Type()== "Odd")
					car.setCarType(1);
				if(GuiConfiguration.getCar3Type()== "Even")
					car.setCarType(2);
			}
			if (i == 3){
				if(GuiConfiguration.getCar4Type()== "Normal")
					car.setCarType(0);
				if(GuiConfiguration.getCar4Type()== "Odd")
					car.setCarType(1);
				if(GuiConfiguration.getCar4Type()== "Even")
					car.setCarType(2);
			}
			if (i == 4){
				if(GuiConfiguration.getCar5Type()== "Normal")
					car.setCarType(0);
				if(GuiConfiguration.getCar5Type()== "Odd")
					car.setCarType(1);
				if(GuiConfiguration.getCar5Type()== "Even")
					car.setCarType(2);
			}
			
			//**********************************************//
			 userPanel.setCar(car);
			 userPanel.setNumberFloors(numberOfFloors);
			 
			 
			 userPanelQueue.setCar(car);
			 carController.setCar(car);
			 carController.setFloorPanel(ifloorPanel);
			 
			 doorPanel.setCar(car);
			 
			 //this function will add cars to the list 
			 //metaController.registerCar(car);
			 metaController.registerCar(car, i);
			 
			frame.add(car.createCar());
		}
		frame.setSize(300*numberOfCars, numberOfFloors * 80);
		frame.setVisible(true);
		
			
		
	
	//	car[0].moveUp(9);

	}

	public static void main(String[] args){
		showElevator();
	}
	static FloorPanelColor resolveFloorPanelColor(String color){
		if(color.equalsIgnoreCase("Red")){
			return FloorPanelColor.RED;
		}else if(color.equalsIgnoreCase("Blue")){
			return FloorPanelColor.BLUE;
		}else if(color.equalsIgnoreCase("Green")){
			return FloorPanelColor.GREEN;
		}else if(color.equalsIgnoreCase("Yellow")){
			return FloorPanelColor.YELLOW;
		}
		
		return null;
	}
	
	static UserPanelColor resolveUserPanelColor(String color){
		if(color.equalsIgnoreCase("Red")){
			return UserPanelColor.RED;
		}else if(color.equalsIgnoreCase("Blue")){
			return UserPanelColor.BLUE;
		}else if(color.equalsIgnoreCase("Green")){
			return UserPanelColor.GREEN;
		}else if(color.equalsIgnoreCase("Yellow")){
			return UserPanelColor.YELLOW;
		}
		
		return null;
	}
	
}
