# # COMP2042_CW_hfybs1BrendanNicholasSia

# Introduction

This is the README file for the coursework for COMP2042. The coursework involves performing maintenance on the provided JavaFx project for the game, Frogger, as well as adding extensions to improve the game.

## Maintenance

1.  Refactoring scene handlers (e.g. adding turtle in background) to a new class of its own from Main.java. Example of this can be shown through the creation of Level1.java & Level2.java. This is done for the purpose of making the Main.java more readable and to ensure the flexibility for altering the program in the future, whether its making certain variables/methods private or adding additional features, without needlessly increasing the size of the Main.java file.
    
2.  The main menu code is refactored into a new class from Main.java. The new class is called MainMenu.java. The purpose of doing so is to avoid "cluttering" the Main.java file and to ensure it is readable.
    
3.  An image has been inserted to the background of the original code. The png file, known as "arcade1", has been edited to fit the scene, such as obstacles, high score counter and other elements of the level.
    
4.  The stop() method in the original code have been refactored into a new class called Stop.java from Main.java. In order to use the method, Level1.java & Level2.java will call the method, stopgame(), from Stop.java to end the game.
## Extensions
1. A Main Menu page has been included. The page will be displayed first while running the program to allow the user to select one of four options: "River Level", "Mountain Level", "How to Play?" and "Exit!". Select the first 2 options listed will load each scene respectively to allow the user to begin playing. Selecting "How to Play?" brings the user to a new scene where the rules of the game is displayed. Selecting "Exit!" closes the window and ends the program.  

2. A new level has been added alongside the original level included. The new level is called "Mountain Level". It's similar to the original level, with the difference being in the level design. In the new level, the turtle and logs have been replaced with clouds, birds and superman. The background colour has also been altered to simulate the sky to match the theme of the level, which is a mountain side. In order to achieve this, a number of files have been duplicated, namely Animal.java and End.java. The new duplicate classes are named Animal2.java and End2.java respectively. 

3. A new scoring system. The program will write the latest score to the prepared .txt file at the end of the level. After doing so, the scores will be read and sorted according to highest score first and be written to another prepared .txt file. Finally, the latter file is read and the sorted score is displayed at the end of the level.

4. A new background song has been added.

## Screenshot River Level
![alt text](https://github.com/brennic/COMP2042_CW_hfybs1BrendanNicholasSia/blob/main/game1.PNG?raw=true)

## Screenshot Mountain Level
![alt text](https://github.com/brennic/COMP2042_CW_hfybs1BrendanNicholasSia/blob/main/game2.PNG?raw=true)
