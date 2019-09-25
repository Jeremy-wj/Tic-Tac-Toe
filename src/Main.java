import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Find a friend and take turns playing!");
        System.out.println("Type in \"Start\" to begin!");
        Scanner startScanner = new Scanner(System.in);
        String start = startScanner.nextLine();
        while (!(start.equals("Start")) && !(start.equals("start"))) {
            start = startScanner.nextLine();
        }

        String board[][] = { {"-","-","-"},{"-","-","-"},{"-","-","-"} };
        boolean gameDone = false;
        boolean oTurn = true;
        boolean xTurn = false;

        while (!gameDone) {
            while (oTurn) {
                System.out.println("O's turn!");
                System.out.println("Enter the matching numbered position to place a circle on the board.");

                System.out.println("1 2 3");
                System.out.println("4 5 6");
                System.out.println("7 8 9");

                // Printing out the Board
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; (board[i] != null && j < board[i].length); j++)
                        System.out.print(board[i][j] + " ");
                    System.out.println();
                }

                Scanner oInputScanner = new Scanner(System.in);
                int oInput = oInputScanner.nextInt();
                while (oInput > 9 || oInput < 1) {
                    oInput = oInputScanner.nextInt();
                }
                System.out.println("You chose position " + Integer.toString(oInput) + "!");
                //Next time - use code to update the board depending on the input right here
                switch (oInput) {
                    case 1:
                        board[0][0] = "O";
                        break;
                    case 2:
                        board[0][1] = "O";
                        break;
                    case 3:
                        board [0][2] = "O";
                        break;
                    case 4:
                        board[1][0] = "O";
                        break;
                    case 5:
                        board[1][1] = "O";
                        break;
                    case 6:
                        board [1][2] = "O";
                        break;
                    case 7:
                        board[2][0] = "O";
                        break;
                    case 8:
                        board[2][1] = "O";
                        break;
                    case 9:
                        board [2][2] = "O";
                        break;
                    default: System.out.println("Error: This message should not appear");
                }

                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; (board[i] != null && j < board[i].length); j++)
                        System.out.print(board[i][j] + " ");
                    System.out.println();
                }

                xTurn = true;
                oTurn = false;

            }



            while (xTurn) {
                System.out.println("X's turn!");
                System.out.println("Enter the matching numbered position to place a cross on the board.");

                System.out.println("1 2 3");
                System.out.println("4 5 6");
                System.out.println("7 8 9");

                // Printing out the Board
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; (board[i] != null && j < board[i].length); j++)
                        System.out.print(board[i][j] + " ");
                    System.out.println();
                }

                Scanner xInputScanner = new Scanner(System.in);
                int xInput = xInputScanner.nextInt();
                while (xInput > 9 || xInput < 1) {
                    xInput = xInputScanner.nextInt();
                }
                System.out.println("You chose position " + Integer.toString(xInput) + "!");
                //Next time - use code to update the board depending on the input right here
                switch (xInput) {
                    case 1:
                        board[0][0] = "X";
                        break;
                    case 2:
                        board[0][1] = "X";
                        break;
                    case 3:
                        board [0][2] = "X";
                        break;
                    case 4:
                        board[1][0] = "X";
                        break;
                    case 5:
                        board[1][1] = "X";
                        break;
                    case 6:
                        board [1][2] = "X";
                        break;
                    case 7:
                        board[2][0] = "X";
                        break;
                    case 8:
                        board[2][1] = "X";
                        break;
                    case 9:
                        board [2][2] = "X";
                        break;
                    default: System.out.println("Error: This message should not appear");
                }

                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; (board[i] != null && j < board[i].length); j++)
                        System.out.print(board[i][j] + " ");
                    System.out.println();
                }

                oTurn = true;
                xTurn = false;
            }

        }


    }
}
