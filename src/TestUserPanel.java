import javax.swing.JLabel;
import javax.swing.JPanel;


public class TestUserPanel implements IUserPanel{

	@Override
	public JPanel createUserPanel() {
		JPanel j = new JPanel();
		j.add(new JLabel("This is test user panel"));
		return j ;
	}

	@Override
	public void deactivateFloorButton(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setActiveButtonColor(UserPanelColor arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setButtonColor(UserPanelColor arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCar(ICar arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNumberFloors(int arg0) {
		// TODO Auto-generated method stub
		
	}

}
