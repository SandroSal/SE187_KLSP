import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CarUI extends JPanel {
	
	JTextField textCurrentFloorNumber = null;
	JTextField textStatus = null;
	
	//New add
	JTextField textCarID = null;
	JTextField textCarType = null;
	//
	
	
	
//Modify ===>	public CarUI(int currentFloorNumber, String carName, IDoor door, IUserPanel  userPanel, IDoorPanel doorPanel){
	public CarUI(int currentFloorNumber, String carName, IDoor door, IUserPanel  userPanel, IDoorPanel doorPanel, IAlarm alarm, int carID, int carType){
				
		setBorder( BorderFactory.createLineBorder(Color.black));
		JPanel floor = new JPanel();
		JPanel statusPanel = new JPanel();
		
		floor.setLayout(new FlowLayout());
		statusPanel.setLayout(new FlowLayout());
		
		JLabel label = new JLabel(carName);
		
		//*********** New add **********//
		JLabel carIDLabel = new JLabel("ID:");
		JLabel carTypeLabel = new JLabel("Type:");
		//*****************************//
		
		JLabel floorNumber = new JLabel("FloorNumber");
		JLabel status = new JLabel("Car Status");
		
		//new add
		textCarID = new JTextField(2);
		textCarID.setText(new Integer(carID).toString());
		textCarType = new JTextField(6);
		if(carType == 0)
		textCarType.setText("Normal");
		else if(carType == 1)
			textCarType.setText("Odd");
		else
			textCarType.setText("Even");
		//
		
		textCurrentFloorNumber = new JTextField(4);
		textCurrentFloorNumber.setText(new Integer(currentFloorNumber).toString());
		
		textStatus = new JTextField(11);
		textStatus.setText("IDLE");
		
		//New add
		floor.add(carIDLabel);
		floor.add(textCarID);
		floor.add(carTypeLabel);
		floor.add(textCarType);
		//
		
		floor.add(floorNumber);
		floor.add(textCurrentFloorNumber);
			
		statusPanel.add(status);
		statusPanel.add(textStatus);
		
		//statusPanel.add(alarm);
		
		textCurrentFloorNumber.setEditable(false);
		textStatus.setEditable(false);
		
		int centerRow = 0;
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
	    gbc.gridy = centerRow++;
		
	    add(label,gbc);
	    
	    
	    gbc.gridy = centerRow++;
	    gbc.gridx = 0;
	    add(floor,gbc);
	    
	    gbc.gridy = centerRow++;
	    gbc.gridx = 0;
	    add(statusPanel,gbc);
	    
	    gbc.gridy = centerRow++;
	    gbc.gridx = 0;
	    if(door!=null)
	    	add(door.createDoorUI(),gbc);
	    
	    gbc.gridy = centerRow++;
	    gbc.gridx = 0;
	    if(userPanel!=null)
	    	add(userPanel.createUserPanel(), gbc);
	    
	    gbc.gridy = centerRow++;
	    gbc.gridx = 0;
	    if(doorPanel!=null)
	    	add(doorPanel.createDoorPanelUI(), gbc);

	    gbc.gridy = centerRow++;
	    gbc.gridx = 0;
	    if(alarm != null) {
			add(alarm.createAlarmUI(), gbc);
	    }


		
	}
	
	public void setCurrentFloorNumber(int currentFloorNumber){
		textCurrentFloorNumber.setBackground(Color.yellow);
		textCurrentFloorNumber.setText(new Integer(currentFloorNumber).toString());
		
	}
	
	public void setCarStatus(CarStatus carStatus){
		textStatus.setBackground(Color.yellow);
		textStatus.setText(carStatus.toString());
		
		if(carStatus.equals(CarStatus.IDLE)){
			textStatus.setBackground(null);
			textCurrentFloorNumber.setBackground(null);
		}
		
	}
	
	// *********** New add ====> Not neccessry
	/*
	public void setCarID(int carID){
		textCurrentFloorNumber.setBackground(Color.yellow);
		textCurrentFloorNumber.setText(new Integer(carID).toString());
		
	}
	public void setCarType(int carType){
		textCurrentFloorNumber.setBackground(Color.yellow);
		textCurrentFloorNumber.setText(new Integer(carType).toString());
		
	}
	*/
	//
	/*public static void main(String args[]) throws InterruptedException{
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setPreferredSize(new Dimension(300, 300));
		SingleDoor door = new SingleDoor();
		
		UserPanelInterface panel = new UserPanel();
		panel.setNumberFloors(10);
		frame.add(new Car("Hello", new SingleDoor(), panel));
		frame.setVisible(true);
		
		
	}*/
}
