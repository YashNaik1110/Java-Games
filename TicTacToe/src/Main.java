import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = new char[3][3];

        // Initialize board
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        int moves = 0;

        while (!gameOver) {

            printBoard(board);

            System.out.println("Player " + player + " enter row and column (0-2):");

            int row = sc.nextInt();
            int col = sc.nextInt();

            // Check valid position
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid Position! Try Again.");
                continue;
            }

            if (board[row][col] == ' ') {

                board[row][col] = player;
                moves++;

                if (haveWon(board, player)) {
                    printBoard(board);
                    System.out.println("Player " + player + " has Won!");
                    gameOver = true;
                } else if (moves == 9) {
                    printBoard(board);
                    System.out.println("Match Draw!");
                    gameOver = true;
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }

            } else {
                System.out.println("Cell already occupied! Try Again.");
            }
        }

        sc.close();
    }

    public static boolean haveWon(char[][] board, char player) {

        // Check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == player &&
                    board[row][1] == player &&
                    board[row][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == player &&
                    board[1][col] == player &&
                    board[2][col] == player) {
                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player) {
            return true;
        }

        // Check secondary diagonal
        if (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static void printBoard(char[][] board) {

        System.out.println("-------------");

        for (int row = 0; row < 3; row++) {

            System.out.print("| ");

            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }

            System.out.println();
            System.out.println("-------------");
        }
    }
}