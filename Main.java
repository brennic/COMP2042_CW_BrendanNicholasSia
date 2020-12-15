package p4_group_8_repo;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	AnimationTimer timer;
	MyStage background;
	Animal animal;
	
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.getIcons().add(new Image("file:src/p4_group_8_repo/frogicon.png"));
		
		MainMenu menu = new MainMenu();
		menu.mm(primaryStage);
    }
    
    public static void main(String[] args) {
		launch(args);
	}
    
}
