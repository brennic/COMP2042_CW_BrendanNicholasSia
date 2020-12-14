package p4_group_8_repo;

import javafx.scene.image.Image;

public class End2 extends Actor{
	boolean activated = false;
	@Override
	public void act(long now) {
		// TODO Auto-generated method st
	}
	
	public End2(int x, int y) {
		setX(x);
		setY(y);
		setImage(new Image("file:src/p4_group_8_repo/End2.png", 60, 60, true, true));
	}
	
	public void setEnd2() {
		setImage(new Image("file:src/p4_group_8_repo/FrogeEnd2.png", 70, 70, true, true));
		activated = true;
	}
	
	public boolean isActivated() {
		return activated;
	}
	

}