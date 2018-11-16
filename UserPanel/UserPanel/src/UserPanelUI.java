import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public class UserPanelUI extends JPanel {

	private ICar car = null;

	private UserPanelColor activeButtonColor = null;

	private UserPanelColor buttonColor = null;

	private List<JButton> lstUserPanelButtons = new ArrayList<JButton>();

	public UserPanelUI(int numFloors, UserPanelColor buttonColor,
			UserPanelColor activeButtonColor, ICar car) {
		
		System.out.println("Inside UsserPanel UI "+ car);

		this.car = car;

		this.activeButtonColor = activeButtonColor;

		this.buttonColor = buttonColor;

		int newNumFloors = 0;

		setPreferredSize(new Dimension(200, 200));
		if (numFloors % 3 != 0) {
			newNumFloors = numFloors + (3 - (numFloors % 3));
		} else {
			newNumFloors = numFloors;
		}

		setLayout(new GridLayout(newNumFloors / 3, 3));
		//***************** Newly add *****************//
		int start =0;
		int inc = 0; 
		if(car.getCarType()== 0){//normal
			start = 1;
			inc = 1;
		}else if(car.getCarType()== 1){//odd
			start = 1;
			inc = 2;
		}else{//even
			start = 2;
			inc =2;
		}
		//*********************************************//
		//Modify ====> for (int i = 1; i <= numFloors; i++) {
		for (int i = start; i <= numFloors; i=i+inc) {
			JButton button = new JButton("" + i);
			
			System.out.println("Button Text" + button.getText());
			System.out.println("Button Color" + buttonColor);
			button.setBackground(buttonColor.getJColor());
			button.addActionListener(
					new UserPanelButtonListener(button.getText(), car, activeButtonColor));
			add(button);
			lstUserPanelButtons.add(button);

		}

	}
	
	public void deactivateFloorButton(int floorNumber){
		
		for(JButton button : lstUserPanelButtons){
			if(Integer.parseInt(button.getText()) == floorNumber){
				button.setBackground(buttonColor.getJColor());
				break;
			}
		}
		
	}

}
