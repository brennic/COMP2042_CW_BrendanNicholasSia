package p4_group_8_repo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

//MainMenu
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
	AnimationTimer timer;
	MyStage background;
	Animal animal;
	Number num;
	
	public void start(Stage primaryStage) throws Exception {
		
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
    
    public static void main(String[] args) {
		launch(args);
	}
    
}
