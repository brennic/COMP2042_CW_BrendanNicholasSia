package p4_group_8_repo;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainMenu {

public void mm(Stage primaryStage) throws Exception {
		
		//Menu background image
		  Image image1 = new Image("file:src/p4_group_8_repo/mainmenubg.png", 600, 800, true, true);
		  //Creating the image view
	      ImageView imageView1 = new ImageView();
	    //Setting image to the image view
	      imageView1.setImage(image1);
	    //Setting the image view parameters
	      imageView1.setX(10);
	      imageView1.setY(10);
	      imageView1.setFitWidth(600);
	      imageView1.setFitHeight(800);
	      imageView1.setPreserveRatio(true);
	      //Setting the Scene object
	      Group root1 = new Group(imageView1);
		  
		  //Manual Image
	      Image image = new Image("file:src/p4_group_8_repo/manual.png", 600, 800, true, true);
	      //Creating the image view
	      ImageView imageView = new ImageView();
	      //Setting image to the image view
	      imageView.setImage(image);
	      //Setting the image view parameters
	      imageView.setX(10);
	      imageView.setY(10);
	      imageView.setFitWidth(575);
	      imageView.setPreserveRatio(true);
	      //Setting the Scene object
	      Group root = new Group(imageView);
	      
	      Scene manualscene = new Scene(root);
	   	  
	      
	  //Main Menu 
			Pane mainMenuRoot = new Pane();			
			
			//River level button
			Level1 start1 = new Level1();
	  		Button btnstart = new Button("River Level");
	  		btnstart.setTranslateX(200);
	  	    btnstart.setTranslateY(-77);
	  	    btnstart.setOnMouseClicked(event -> { 
	  			/*
	  	    	primaryStage.setScene(scene);
	  			background.start();
	  			start();
	  			*/
	  	    	start1.lvl1(primaryStage);
	  	    });
	  	    
	  	//Sky level button
	  	    Level2 start2 = new Level2();
	  		Button btnstart2 = new Button("Sky Level");
	  		btnstart2.setTranslateX(340);
	  	    btnstart2.setTranslateY(-123);
	  	    btnstart2.setOnMouseClicked(event -> { 
	  			/*
	  	    	primaryStage.setScene(scene);
	  			background.start();
	  			start();
	  			*/
	  	    	start2.lvl2(primaryStage);
	  	    });
	  	    
	  //Manual Button
	  	    Button btnmanual = new Button("How to Play?");
	  	    btnmanual.setTranslateX(5);
	  	    btnmanual.setTranslateY(-147);
	  	    btnmanual.setOnMouseClicked(event ->{
	  	    	
	  	    	primaryStage.setScene(manualscene);
	  	    	primaryStage.show();
	  	    });
	  	    
	  	    
	  //Exit Button
	  	  Button btnexit = new Button("Exit!");
	  	  btnexit.setTranslateX(555);
	  	  btnexit.setTranslateY(-193);
	  	  btnexit.setOnAction(event -> System.exit(0));
	  	  
	  	  VBox layout1 = new VBox(20); 
	  	  layout1.getChildren().addAll(root1, btnstart, btnstart2,  btnmanual, btnexit);
	  	  Scene menuscene = new Scene(layout1,600,330); // Game Menu
	  	  
	  	primaryStage.setScene(menuscene);
		primaryStage.show();
	  	 
	  	
    }
}
