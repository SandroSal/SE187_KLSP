import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import javax.swing.JPanel;

public class FloorPanel implements IFloorPanel
{

	static List<FloorPanel> lstFloorPanel = new ArrayList<FloorPanel>();
	static int alarmCount = 0;
	
	private int CurrentFloorNumber;
	private FloorPanelColor color = null;
	private FloorPanelColor activeButtonColor = null;
	private IFloorPanelQueue floorPanelQueue = null;
	private String FloorPanelStatus = "idle";
	private FloorPanelUI floorPanelUI = null;
	private Alarm alarm = null;
	
	private String upText = null;
	private String downText = null;
	// newly add
	private int carID =0;
    public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	private int carType=0;

	public FloorPanel(){
		alarm = new Alarm();
		lstFloorPanel.add(this);
	}
	
	@Override
	public JPanel createFloorPanel(int CurrentFloorNumber) 
	{
		this.CurrentFloorNumber = CurrentFloorNumber;
		System.out.println("creating new floor panel for floor "+ CurrentFloorNumber);
		floorPanelUI = new FloorPanelUI(this,color,activeButtonColor, CurrentFloorNumber, upText, downText , carID, carType, alarm);
		return floorPanelUI;
	}
	
	public void setFloorPanelQueueType(IFloorPanelQueue floorPanelQueue)
	{
		this.floorPanelQueue = floorPanelQueue;
	}
	
	public IFloorPanelQueue getFloorPanelQueueType()
	{
		return  floorPanelQueue;
	}
	
	@Override
	public String getUserRequest() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int getCurrentFloor() 
	{
	return CurrentFloorNumber;
	}
	
	@Override
	public void setActiveButtonColor(FloorPanelColor floorPanelColor) 
	{
		this.activeButtonColor = floorPanelColor;
		
	}

	@Override
	public void setButtonColor(FloorPanelColor floorPanelColor) 
	{
		this.color = floorPanelColor;
		
	}
	
    @Override
	public String getFloorPanelStatus() 
    {
			return FloorPanelStatus;
	}
    
    public void setFloorPanelStatus(String FloorPanelStatus)
    {
    	this.FloorPanelStatus = FloorPanelStatus;
    	System.out.println("Status set to "+FloorPanelStatus);
    }

	@Override
	public void disableDownButton() {
		floorPanelUI.disableDownButton();
		
	}

	@Override
	public void disableUpButton() {
		floorPanelUI.disableUpButton();
		
	}

	@Override
	public Alarm getAlarm() {
		return alarm;
		
	}

	@Override
	public void seDownText(String text) {
		this.downText = text;
		
	}

	@Override
	public void setUpText(String text) {
		this.upText = text;
		
	}

	@Override
	public void processAlarm(AlarmCommand alarmCommand) {

		if( alarmCommand == AlarmCommand.RAISE ) {
			alarmCount++;
		} else if ( --alarmCount > 0) {
			// Another car's alarm is still active
			return;
		}
		Iterator iter = lstFloorPanel.iterator();
		while( iter.hasNext()) {
			if( alarmCommand == AlarmCommand.RAISE ) {
				FloorPanel panel = (FloorPanel)iter.next();
				panel.getAlarm().getAlarmUI().raiseAlarm();
			} else {
				FloorPanel panel = (FloorPanel)iter.next();
				panel.getAlarm().getAlarmUI().resetAlarm();
			}
		}
	}
	
	@Override
	public void processedRequest(int floorNumber) {
		
		FloorPanel floorPanel = lstFloorPanel.get(lstFloorPanel.size() - floorNumber);
		//new
		FloorPanel oldFloorPanel = lstFloorPanel.get(lstFloorPanel.size()- (floorNumber-CurrentFloorNumber+1));
		
		//
		floorPanel.floorPanelUI.processedRequest();
		//new test ==> this function run when the car arrive dest floor 
		System.out.println("==CarID in FloorProcessReq= " +this.carID + "==");
		floorPanel.floorPanelUI.setCurrentCarID(this.getCarID());
		floorPanel.floorPanelUI.setCurrentCarType(this.getCarType());
		//floorPanel.floorPanelUI.setCurrentCarID(floorPanelQueue.getCarID());
		//System.out.println("processedReq" + floorPanelQueue.getCarID());
		//floorPanel.floorPanelUI.setCurrentCarID(floorPanelQueue.getCarID());
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		floorPanel.floorPanelUI.setCarDefault();
		//oldFloorPanel.floorPanelUI.setCarDefault();
	}
	
	//new function
	//public void setCarDefault(){
	//	FloorPanel floorPanel = lstFloorPanel.get(lstFloorPanel.size());
	//	floorPanel.floorPanelUI.setCarDefault();
	//}
	//////

}
