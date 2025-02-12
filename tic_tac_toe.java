import java.util.*;
public class TTT {
    static String[] board;
    static String player1Name;
    static String player2Name;
    static String turn;

    static String checkWinner() {
        int[][] winConditions = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, 
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, 
            {0, 4, 8}, {2, 4, 6}             
        };
        for (int[] condition : winConditions) {
            String line = board[condition[0]] + board[condition[1]] + board[condition[2]];
            if (line.equals(turn + turn + turn)) {
                return (turn.equals(player1Name.charAt(0) + "") ? player1Name : player2Name) + " wins"; 
            }
        }

        boolean isBoardFull = true;
        for (String position : board) {
            if (!position.matches("[A-Z]")) {
                isBoardFull = false;
                break;
            }
        }
        if (isBoardFull) {
            return "draw"; 
        }
        return null; 
    }
    static void printBoard() {
        System.out.println("|---|---|---|");
        for (int i = 0; i < 9; i += 3) {
            System.out.println("| " + board[i] + " | " + board[i + 1] + " | " + board[i + 2] + " |");
            System.out.println("|---|---|---|");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        System.out.println("Enter Player 1's name:");
        player1Name = in.nextLine();
        System.out.println("Enter Player 2's name:");
        player2Name = in.nextLine();
        turn = player1Name.charAt(0) + "";
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }

        printBoard();
        String winner = null;
        while (winner == null) {
            System.out.println(turn + "'s turn; enter a slot number to place your marker:");

            int numInput;
            try {
                numInput = in.nextInt();
                if (numInput < 1 || numInput > 9 || !board[numInput - 1].matches("[1-9]")) {
                    System.out.println("Invalid input. Please enter a number between 1 and 9 for an empty slot.");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next(); 
                continue;
            }c
            board[numInput - 1] = turn;
            printBoard();
            winner = checkWinner();
            if (winner == null) {  
                turn = (turn.equals(player1Name.charAt(0) + "")) ? player2Name.charAt(0) + "" : player1Name.charAt(0) + "";
            }
        }
        System.out.println("Game over! " + winner);
        in.close();
    }
}
