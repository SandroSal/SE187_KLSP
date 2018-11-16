import java.awt.Color;

import javax.swing.JPanel;

public interface IFloorPanel 
{
	
	JPanel createFloorPanel(int i);
	
	String getUserRequest();
     
	int getCurrentFloor();
	
	void setFloorPanelQueueType(IFloorPanelQueue floorPanelQueue);
	
	IFloorPanelQueue getFloorPanelQueueType();
	
    void setActiveButtonColor(FloorPanelColor floorPanelColor);
    
    void setButtonColor(FloorPanelColor floorPanelColor);
	
	String getFloorPanelStatus();
	
	void setFloorPanelStatus(String FloorPanelStatus);
	
	void disableUpButton();
	
	void disableDownButton();

	public Alarm getAlarm();

	void setUpText(String text);
	
	void seDownText(String text);

	void processAlarm(AlarmCommand alarmCommand);

    void processedRequest(int floorNumber);
    
    //new 
    int getCarID();
    void setCarID(int carID);
    int getCarType();
    void setCarType(int carType);
   // void setCarDefault();
    
    ///
}
