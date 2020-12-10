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
		
		background = new MyStage();
		Scene scene  = new Scene(background,600,800);//Frogger Game
		
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
			
			//start button
	  		Button btnstart = new Button("Start!");
	  		btnstart.setTranslateX(150);
	  	    btnstart.setTranslateY(-75);
	  	    btnstart.setOnMouseClicked(event -> { 
	  			primaryStage.setScene(scene);
	  			background.start();
	  			start();
	  	    });
	  	    
	  //Manual Button
	  	    Button btnmanual = new Button("How to Play?");
	  	    btnmanual.setTranslateX(255);
	  	    btnmanual.setTranslateY(-121);
	  	    btnmanual.setOnMouseClicked(event ->{
	  	    	
	  	    	primaryStage.setScene(manualscene);
	  	    	primaryStage.show();
	  	    });
	  	    
	  	    
	  //Exit Button
	  	  Button btnexit = new Button("Exit!");
	  	  btnexit.setTranslateX(400);
	  	  btnexit.setTranslateY(-166);
	  	  btnexit.setOnAction(event -> System.exit(0));
	  	  
	  	  VBox layout1 = new VBox(20); 
	  	  layout1.getChildren().addAll(root1, btnstart , btnmanual, btnexit);
	  	  Scene menuscene = new Scene(layout1,600,330); // Game Menu
	  	
	  	  /*
	  	//Back Button
	  	  Button btnback = new Button("Back to Main Menu");
	  	  btnback.setTranslateX(150);
	  	  btnback.setTranslateY(-75);
	  	  btnback.setOnMouseClicked(event -> {
	  		  primaryStage.setScene(menuscene);
	  		  primaryStage.show();
	  	  });
	  	  
	  	  VBox layout2 = new VBox(20);
	  	  layout2.getChildren().addAll(root, btnback);
	  	  Scene manscene = new Scene(layout2, 600, 500);
	  	  */
	  	  
		//Obstacle obstacle = new Obstacle("file:src/p4_group_8_repo/truck1Right.png", 25, 25, 3);
		//Obstacle obstacle1 = new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 100, 100,2 );
		//Obstacle obstacle2 = new Obstacle("file:src/p4_group_8_repo/truck1Right.png",0,  150, 1);
	  	  
		BackgroundImage froggerback = new BackgroundImage("file:src/p4_group_8_repo/arcade1.png");
	    
		
		background.add(froggerback);
		
		
		
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 0, 166, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 220, 166, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 440, 166, 0.75));
		//background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 0, 166, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/logs.png", 300, 0, 276, -2));
		background.add(new Log("file:src/p4_group_8_repo/logs.png", 300, 400, 276, -2));
		//background.add(new Log("file:src/p4_group_8_repo/logs.png", 300, 800, 276, -2));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 50, 329, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 270, 329, 0.75));
		background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 490, 329, 0.75));
		//background.add(new Log("file:src/p4_group_8_repo/log3.png", 150, 570, 329, 0.75));
		
		background.add(new Turtle(500, 376, -1, 130, 130));
		background.add(new Turtle(300, 376, -1, 130, 130));
		background.add(new WetTurtle(700, 376, -1, 130, 130));
		background.add(new WetTurtle(600, 217, -1, 130, 130));
		background.add(new WetTurtle(400, 217, -1, 130, 130));
		background.add(new WetTurtle(200, 217, -1, 130, 130));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 200, 100, 1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 0, 100, 1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 100, 120, -1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 200, 120, -1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 100, 140, 1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 200, 140, 1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 100, 160, -1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 300, 160, -1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 100, 180, 1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 200, 180, 1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 100, 200, -1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 200, 200, -1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 100, 220, 1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 200, 220, 1));
		//background.add(new Log("file:src/p4_group_8_repo/log2.png", 400, 220, 1));
		//End end2 = new End();
		//End end3 = new End();
		//End end4 = new End();
		//End end5 = new End();
		background.add(new End(13,96));
		background.add(new End(141,96));
		background.add(new End(141 + 141-13,96));
		background.add(new End(141 + 141-13+141-13+1,96));
		background.add(new End(141 + 141-13+141-13+141-13+3,96));
		animal = new Animal("file:src/p4_group_8_repo/froggerUp.png");
		background.add(animal);
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 0, 649, 1, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 300, 649, 1, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 600, 649, 1, 120, 120));
		//background.add(new Obstacle("file:src/p4_group_8_repo/truck1"+"Right.png", 720, 649, 1, 120, 120));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 100, 597, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 250, 597, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 400, 597, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 550, 597, -1, 50, 50));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 0, 540, 1, 200, 200));
		background.add(new Obstacle("file:src/p4_group_8_repo/truck2Right.png", 500, 540, 1, 200, 200));
		background.add(new Obstacle("file:src/p4_group_8_repo/car1Left.png", 500, 490, -5, 50, 50));
		background.add(new Digit(0, 30, 360, 25));
		
		
		//background.add(obstacle);
		//background.add(obstacle1);
		//background.add(obstacle2);
		
		primaryStage.setScene(menuscene);
		primaryStage.show();
		//start();
	}
	
	/*catch (Exception e) { 
		  
        System.out.println(e.getMessage()); 
    } */
	
	public void createTimer() {
		timer = new AnimationTimer() {
	        @Override
	        public void handle(long now) {
	        	BufferedReader reader = null; 
	            BufferedReader reader1 = null;
	            BufferedWriter writer = null;
	                     
	            //Create an ArrayList object to hold the lines of input file
	             
	            ArrayList<String> lines = new ArrayList<String>();
	            ArrayList<String> lines1 = new ArrayList<String>();
	        	
	        	if (animal.changeScore()) {
	        		setNumber(animal.getPoints());
	        	}
	        	
	        	if (animal.getStop()) {
	        		System.out.print("STOPP:");
	        		background.stopMusic();
	        		stop();
	        		background.stop();
	        		}
	        		/*
	        		Alert alert = new Alert(AlertType.INFORMATION);
	        		alert.setTitle("You Have Won The Game!");
	        		alert.setHeaderText("Your High Score: "+animal.getPoints()+"!");
	        		alert.setContentText("Highest Possible Score: 800\n");
	        		alert.show();
	        	}
	        	*/
	        	//Create and write "Score History" to text file
            	try {
            	    if (animal.getStop()) {
            		File myObj = new File("D:\\Java Eclipse\\TryFrog1\\src\\p4_group_8_repo\\highscore.txt");
            	      if (myObj.createNewFile()) {
            	        System.out.println("File created: " + myObj.getName());
            	      } else {
            	        System.out.println("File already exists.");
            	     }
            	    FileWriter myWriter = new FileWriter("D:\\Java Eclipse\\TryFrog1\\src\\p4_group_8_repo\\highscore.txt", true);
            	    myWriter.write("Score History: ");
          	        /*myWriter.write("\n");
            	    myWriter.write(""+ animal.getPoints());
          	        myWriter.close();*/
            	    }
            	   } catch (IOException e) {
            	      System.out.println("An error occurred.");
            	      e.printStackTrace();
            	  }
            	
            	//Write high score to text file
            	try {
            		if (animal.getStop()) {
            		FileWriter myWriter1 = new FileWriter("D:\\Java Eclipse\\TryFrog1\\src\\p4_group_8_repo\\highscore.txt", true);
            		myWriter1.write("\n");
            	    myWriter1.write(""+ animal.getPoints());
          	        myWriter1.close();
            		}
            	} catch (IOException e) {
          	      System.out.println("An error occurred.");
          	      e.printStackTrace();
          	  }
	        	
	        	//Read text file and display high score
	        	/*try {
	        		if (animal.getStop()) {
	        		  Alert alert = new Alert(AlertType.INFORMATION);
	        	      File myObj = new File("D:\\Java Eclipse\\TryFrog1\\src\\p4_group_8_repo\\highscore.txt");
	        	      Scanner myReader = new Scanner(myObj);  
	        	      while (myReader.hasNextLine()) {
	        	        String data = myReader.nextLine();
	        	        alert.setContentText(data);
	        	      }
	        	      myReader.close();
	        		}
	        	    } catch (FileNotFoundException e) {
	        	      System.out.println("An error occurred.");
	        	      e.printStackTrace();
	        	    } */
	        	
	        	//Create, write and sort high score in text file
	        	try
	            {
	                //Creating BufferedReader object to read the input file
	                 
	                reader = new BufferedReader(new FileReader("D:\\Java Eclipse\\TryFrog1\\src\\p4_group_8_repo\\highscore.txt"));
	                 
	                //Reading all the lines of input file one by one and adding them into ArrayList
	                 
	                String currentLine = reader.readLine();          
	                while (currentLine != null) 
	                {
	                    lines.add(currentLine);
	                    currentLine = reader.readLine();
	                }
	                 
	                //Sorting the ArrayList
	                 
	                Collections.sort(lines, Collections.reverseOrder());
	                 
	                //Creating BufferedWriter object to write into output file
	                 
	                writer = new BufferedWriter(new FileWriter("D:\\Java Eclipse\\TryFrog1\\src\\p4_group_8_repo\\highscoresorted.txt"));
	                 
	                //Writing sorted lines into output file
	                writer.write("Highgest Score First");
	                writer.newLine();
	                for (String line : lines)
	                {
	                    writer.write(line);
	                    writer.newLine();
	                }
	            } 
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        	finally
	            {
	                //Closing the resources   
	                try
	                {
	                    if (reader != null)
	                    {
	                        reader.close();
	                    }  
	                    if(writer != null)
	                    {
	                        writer.close();
	                    }
	                } 
	                catch (IOException e) 
	                {
	                    e.printStackTrace();
	                }
	            }
	        
	        
	        //Read from sorted high score and display	
	        try {
	        	int i;
	        	if (animal.getStop()) {
	        		System.out.print("STOPP:");
	        		/*
	        		background.stopMusic();
	        		stop();
	        		background.stop();
	        		*/
	        		reader1 = new BufferedReader(new FileReader("D:\\Java Eclipse\\TryFrog1\\src\\p4_group_8_repo\\highscoresorted.txt"));
	                
	                //Reading all the lines of input file one by one and adding them into ArrayList
	                 
	                String currentLine = reader1.readLine();          
	                while (currentLine != null)
	                {
	                    lines1.add(currentLine);
	                    currentLine = reader1.readLine();
	                }
	        	Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setTitle("You Have Won The Game!");
	    		alert.setHeaderText("Your High Score: "+animal.getPoints()+"!");
	    		alert.setContentText("Highest Possible Score: 800\n"+"Previous High Scores:\n" + lines);
	    		alert.show();
	        	}
	        }
	        	catch (IOException e) 
                {
                    e.printStackTrace();
                }
	        
	        }
	    };
		
    }
	
	//public void start:
	public void start() {
		background.playMusic();
    	createTimer();
        timer.start();
    }

	
	
    public void stop(Stop gameover) {
        //timer.stop();
    	gameover.stopgame();
    }
    
	
    public void setNumber(int i) {
    	int shift = 0;
    	while (i > 0) {
    		  int d = i / 10;
    		  int k = i - d * 10;
    		  i = d;
    		  background.add(new Digit(k, 30, 360 - shift, 25));
    		  shift+=30;
    		}
    }
    
    public static void main(String[] args) {
		launch(args);
	}
    
}
