## **Tic-Tac-Toe**
**Introduction**

Tic-Tac-Toe is a simple and classic two-player game that has been recreated using Java. This console-based implementation allows two players to play alternately until one wins or the game ends in a draw.


**Objectives**

•	To create an interactive Tic-Tac-Toe game using Java.

•	To implement game logic that detects wins, losses, and draws.

•	To provide a smooth and error-free user experience using exception handling.


**Game Description**

•	The game consists of a 3x3 grid (9 blocks in total).

•	Two players participate, each taking turns to mark a cell.

•	Each player is assigned a unique symbol (their name's first letter).

•	The objective is to align three identical symbols in a row, column, or diagonal.

•	If all 9 cells are filled and no player has won, the game results in a draw.


**How It Works**

1. Setup
   
  •	The program starts by asking for player names.
  
  •	The game board is initialized with numbers (1-9) representing available slots.
  
2. Playing the Game
   
  •	Players take turns entering a number (1-9) corresponding to their chosen position.
  
  •	The board updates with the current player's symbol.
  
  •	The game checks for a winner after every move.
  
  •	If a player aligns three symbols in a row, column, or diagonal, they win.
  
  •	If no winner is found and the board is full, the game ends in a draw.
  
3. Winning Conditions
   
The game checks the following winning combinations:

•	Rows: (0,1,2), (3,4,5), (6,7,8)

•	Columns: (0,3,6), (1,4,7), (2,5,8)

•	Diagonals: (0,4,8), (2,4,6)

Code Breakdown

1. checkWinner()

  •	Checks if any player has won by evaluating predefined winning conditions.

  •	Returns the winner's name if a match is found.

  •	If the board is full and no winner is found, it returns "draw".

2. printBoard()

  •	Prints the current state of the board using a simple ASCII representation.

3. main() Method

  •	Initializes the game and takes player inputs.
  
  •	Runs a loop for turn-based gameplay.
  
  •	Calls checkWinner() after each move.

  •	Ends the game when a winner is found or the board is full.



**Installation & Running the Game**

1.	Clone the repository 

2.	git clone https://github.com/Himanshu70-17/Tic-Tac-Toe.git

3.	Navigate to the project folder 

4.	cd tic-tac-toe-java

5.	Compile and run the Java program 

6.	javac TTT.java

7.	java TTT



**Screenshot**

![image](https://github.com/user-attachments/assets/1e00d5ef-1f53-47ff-9d19-621b00ad6453)
![image](https://github.com/user-attachments/assets/aaab623c-4b7a-45af-a075-90bfab622a78)
![image](https://github.com/user-attachments/assets/903b8d33-1412-4b18-adaa-324ff3c49b18)


   
**Future Enhancements**

•	Implement a GUI version of the game using Java Swing.

•	Add a computer opponent (AI mode).

•	Include an option for custom player symbols.



**License**

This project is open-source and available under the MIT License.

📌 Follow me on GitHub: https://github.com/Himanshu70-17

