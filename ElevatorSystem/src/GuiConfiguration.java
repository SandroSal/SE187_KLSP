
public class GuiConfiguration {
	
	private static int numOfFloors = 10;
	private static int numOfCars = 5;
	private static String doorConfiguration = "Alternate Single/Double Door";
	private static String userPanelColor = "Green";
	private static String userPanelPressedButtonColor = "Red";
	private static String floorPanelColor = "Yellow";
	private static String floorPanelPressedButtonColor = "Blue";
	private static String floorPanelDisplay = "Symbol";
	private static String doorPanelDisplay = "text";
	private static String algorithmType = "Shortest Path";
	private static String alarmLight = "Red non Flashing";
	
	//******************* Newly add string *******************//
	private static String car1Type = "Normal";
	private static String car2Type = "Normal";
	private static String car3Type = "Normal";
	private static String car4Type = "Normal";
	private static String car5Type = "Normal";
	//********************************************************//
	
	public static int getNumOfFloors() {
		return numOfFloors;
	}
	public static void setNumOfFloors(int numOfFloors) {
		GuiConfiguration.numOfFloors = numOfFloors;
	}
	public static int getNumOfCars() {
		return numOfCars;
	}
	public static void setNumOfCars(int numOfCars) {
		GuiConfiguration.numOfCars = numOfCars;
	}
	public static String getDoorConfiguration() {
		return doorConfiguration;
	}
	public static void setDoorConfiguration(String doorConfiguration) {
		GuiConfiguration.doorConfiguration = doorConfiguration;
	}
	public static String getUserPanelColor() {
		return userPanelColor;
	}
	public static void setUserPanelColor(String userPanelColor) {
		GuiConfiguration.userPanelColor = userPanelColor;
	}
	public static String getUserPanelPressedButtonColor() {
		return userPanelPressedButtonColor;
	}
	public static void setUserPanelPressedButtonColor(
			String userPanelPressedButtonColor) {
		GuiConfiguration.userPanelPressedButtonColor = userPanelPressedButtonColor;
	}
	
	public static String getFloorPanelPressedButtonColor() {
		return floorPanelPressedButtonColor;
	}
	public static void setFloorPanelPressedButtonColor(
			String floorPanelPressedButtonColor) {
		GuiConfiguration.floorPanelPressedButtonColor = floorPanelPressedButtonColor;
	}
	public static String getFloorPanelDisplay() {
		return floorPanelDisplay;
	}
	public static void setFloorPanelDisplay(String floorPanelDisplay) {
		GuiConfiguration.floorPanelDisplay = floorPanelDisplay;
	}
	public static String getDoorPanelDisplay() {
		return doorPanelDisplay;
	}
	public static void setDoorPanelDisplay(String doorPanelDisplay) {
		GuiConfiguration.doorPanelDisplay = doorPanelDisplay;
	}
	public static String getAlgorithmType() {
		return algorithmType;
	}
	public static void setAlgorithmType(String algorithmType) {
		GuiConfiguration.algorithmType = algorithmType;
	}
	public static String getAlarmLight() {
		return alarmLight;
	}
	public static void setAlarmLight(String alarmLight) {
		GuiConfiguration.alarmLight = alarmLight;
	}
	public static void setFloorPanelColor(String floorPanelColor) {
		GuiConfiguration.floorPanelColor = floorPanelColor;
	}
	public static String getFloorPanelColor() {
		return floorPanelColor;
	}
	
	//*******************Newly add function**********************//
	
	//Car 1 Type
	public static String getCar1Type() {
		return car1Type;
	}
	public static void setCar1Type(String car1Type) {
		GuiConfiguration.car1Type = car1Type;
	}
	
	//Car 2 Type
	public static String getCar2Type() {
		return car2Type;
	}
	public static void setCar2Type(String car2Type) {
		GuiConfiguration.car2Type = car2Type;
	}
	
	//Car 3 Type
	public static String getCar3Type() {
		return car3Type;
	}
	public static void setCar3Type(String car3Type) {
		GuiConfiguration.car3Type = car3Type;
	}
	
	//Car 4 Type
	public static String getCar4Type() {
		return car4Type;
	}
	public static void setCar4Type(String car4Type) {
		GuiConfiguration.car4Type = car4Type;
	}
	
	//Car 5 Type
	public static String getCar5Type() {
		return car5Type;
	}
	public static void setCar5Type(String car5Type) {
		GuiConfiguration.car5Type = car5Type;
	}
	
	
	//*********************************************************//
	

}
