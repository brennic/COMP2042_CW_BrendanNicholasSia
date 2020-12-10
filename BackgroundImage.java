package p4_group_8_repo;

import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

public class BackgroundImage extends Actor{

	@Override
	public void act(long now) {
		
		
	}
	
	public BackgroundImage(String imageLink) {
		setImage(new Image(imageLink, 600, 800, true, true));
		
	}

	public BackgroundImage(Image image, BackgroundRepeat noRepeat, BackgroundRepeat noRepeat2,
			BackgroundPosition default1, BackgroundSize default2) {
		// TODO Auto-generated constructor stub
	}

}
