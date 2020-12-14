package p4_group_8_repo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Level1{

	AnimationTimer timer;
	MyStage background;
	Animal animal;
	
	public void lvl1(Stage primaryStage) {
		
		background = new MyStage();
		Scene scene  = new Scene(background,600,800);//Frogger Game
		
		primaryStage.setScene(scene);
		background.start();
		start();
		
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
            		File myObj = new File("D:\\Eclipse\\TryFrog1\\src\\p4_group_8_repo\\highscore.txt");
            	      if (myObj.createNewFile()) {
            	        System.out.println("File created: " + myObj.getName());
            	      } else {
            	        System.out.println("File already exists.");
            	     }
            	    FileWriter myWriter = new FileWriter("D:\\Eclipse\\TryFrog1\\src\\p4_group_8_repo\\highscore.txt", true);
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
            		FileWriter myWriter1 = new FileWriter("D:\\Eclipse\\TryFrog1\\src\\p4_group_8_repo\\highscore.txt", true);
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
	                 
	                reader = new BufferedReader(new FileReader("D:\\Eclipse\\TryFrog1\\src\\p4_group_8_repo\\highscore.txt"));
	                 
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
	                 
	                writer = new BufferedWriter(new FileWriter("D:\\Eclipse\\TryFrog1\\src\\p4_group_8_repo\\highscoresorted.txt"));
	                 
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
	        	if (animal.getStop()) {
	        		System.out.print("STOPP:");
	        		/*
	        		background.stopMusic();
	        		stop();
	        		background.stop();
	        		*/
	        		reader1 = new BufferedReader(new FileReader("D:\\Eclipse\\TryFrog1\\src\\p4_group_8_repo\\highscoresorted.txt"));
	                
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
		
}

