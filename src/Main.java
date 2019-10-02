import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Intro to Game
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Find a friend and take turns playing!");
        System.out.println("Type in \"Start\" to begin!");
        Scanner startScanner = new Scanner(System.in);
        String start = startScanner.nextLine();
        while (!(start.equals("Start")) && !(start.equals("start"))) {
            start = startScanner.nextLine();
        }
        
        //Set up board and variables
        String board[][] = { {"-","-","-"},{"-","-","-"},{"-","-","-"} };
        boolean gameDone = false;
        boolean oTurn = true;
        boolean xTurn = false;

        //Main Game Loop
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

                boolean validInputO = false;
                while (validInputO == false) {
                    validInputO = true;

                    while (oInput > 9 || oInput < 1) {
                        oInput = oInputScanner.nextInt();
                    }
                    switch (oInput) {
                        case 1:
                            if (board[0][0].equals("O") || board[0][0].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputO = false;
                                break;
                            } else {
                                board[0][0] = "O";
                                validInputO = true;

                                break;
                            }
                        case 2:
                            if (board[0][1].equals("O") || board[0][1].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputO = false;
                                break;
                            } else {
                                board[0][1] = "O";
                                validInputO = true;
                                break;
                            }
                        case 3:
                            if (board[0][2].equals("O") || board[0][2].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputO = false;
                                break;
                            } else {
                                board[0][2] = "O";
                                validInputO = true;
                                break;
                            }
                        case 4:
                            if (board[1][0].equals("O") || board[1][0].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputO = false;
                                break;
                            } else {
                                board[1][0] = "O";
                                validInputO = true;
                                break;
                            }
                        case 5:
                            if (board[1][1].equals("O") || board[1][1].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputO = false;
                                break;
                            } else {
                                board[1][1] = "O";
                                validInputO = true;
                                break;
                            }
                        case 6:
                            if (board[1][2].equals("O") || board[1][2].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputO = false;
                                break;
                            } else {
                                board[1][2] = "O";
                                validInputO = true;
                                break;
                            }
                        case 7:
                            if (board[2][0].equals("O") || board[2][0].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputO = false;
                                break;
                            } else {
                                board[2][0] = "O";
                                validInputO = true;
                                break;
                            }
                        case 8:
                            if (board[2][1].equals("O") || board[2][1].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputO = false;
                                break;
                            } else {
                                board[2][1] = "O";
                                validInputO = true;
                                break;
                            }
                        case 9:
                            if (board[2][2].equals("O") || board[2][2].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputO = false;
                                break;
                            } else {
                                board[2][2] = "O";
                                validInputO = true;
                                break;
                            }
                        default: System.out.println("Error: This message should not appear");
                    }
                    oInput = 0;
                }

                //Print out board
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; (board[i] != null && j < board[i].length); j++)
                        System.out.print(board[i][j] + " ");
                    System.out.println();
                }


                if (board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O")) {
                    gameDone = true;
                    System.out.println("O wins!");
                    break;
                } else if (board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O")) {
                    gameDone = true;
                    System.out.println("O wins!");
                    break;
                } else if (board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O")) {
                    gameDone = true;
                    System.out.println("O wins!");
                    break;
                } else if (board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O")) {
                    gameDone = true;
                    System.out.println("O wins!");
                    break;
                } else if (board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O")) {
                    gameDone = true;
                    System.out.println("O wins!");
                    break;
                } else if (board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O")) {
                    gameDone = true;
                    System.out.println("O wins!");
                    break;
                } else if (board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O")) {
                    gameDone = true;
                    System.out.println("O wins!");
                    break;
                } else if (board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O")) {
                    gameDone = true;
                    System.out.println("O wins!");
                    break;
                } else {
                    if (!(board[0][0].equals("-")) && !(board[0][1].equals("-")) && !(board[0][2].equals("-")) && !(board[1][0].equals("-")) && !(board[1][1].equals("-")) && !(board[1][2].equals("-")) && !(board[2][0].equals("-")) && !(board[2][1].equals("-")) && !(board[2][2].equals("-"))) {
                        gameDone = true;
                        System.out.println("Tie! Game Over!");
                        break;
                    } else {
                        System.out.println("Switching turns!");
                        xTurn = true;
                        oTurn = false;
                    }
                }
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
                boolean validInputX = false;
                while (validInputX == false) {
                    validInputX = true;

                    while (xInput > 9 || xInput < 1) {
                        xInput = xInputScanner.nextInt();
                    }

                    switch (xInput) {
                        case 1:
                            if (board[0][0].equals("O") || board[0][0].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputX = false;
                                break;
                            } else {
                                board[0][0] = "X";
                                validInputX = true;
                                break;
                            }
                        case 2:
                            if (board[0][1].equals("O") || board[0][1].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputX = false;
                                break;
                            } else {
                                board[0][1] = "X";
                                validInputX = true;
                                break;
                            }
                        case 3:
                            if (board[0][2].equals("O") || board[0][2].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputX = false;
                                break;
                            } else {
                                board[0][2] = "X";
                                validInputX = true;
                                break;
                            }
                        case 4:
                            if (board[1][0].equals("O") || board[1][0].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputX = false;
                                break;
                            } else {
                                board[1][0] = "X";
                                validInputX = true;
                                break;
                            }
                        case 5:
                            if (board[1][1].equals("O") || board[1][1].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputX = false;
                                break;
                            } else {
                                board[1][1] = "X";
                                validInputX = true;
                                break;
                            }
                        case 6:
                            if (board[1][2].equals("O") || board[1][2].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputX = false;
                                break;
                            } else {
                                board[1][2] = "X";
                                validInputX = true;
                                break;
                            }
                        case 7:
                            if (board[2][0].equals("O") || board[2][0].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputX = false;
                                break;
                            } else {
                                board[2][0] = "X";
                                validInputX = true;
                                break;
                            }
                        case 8:
                            if (board[2][1].equals("O") || board[2][1].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputX = false;
                                break;
                            } else {
                                board[2][1] = "X";
                                validInputX = true;
                                break;
                            }
                        case 9:
                            if (board[2][2].equals("O") || board[2][2].equals("X")) {
                                System.out.println("That space is already occupied!");
                                validInputX = false;
                                break;
                            } else {
                                board[2][2] = "X";
                                validInputX = true;
                                break;
                            }
                        default: System.out.println("Error: This message should not appear");
                    }
                    xInput = 0;
                }

                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; (board[i] != null && j < board[i].length); j++)
                        System.out.print(board[i][j] + " ");
                    System.out.println();
                }


                if (board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X")) {
                    gameDone = true;
                    System.out.println("X wins!");
                    break;
                } else if (board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X")) {
                    gameDone = true;
                    System.out.println("X wins!");
                    break;
                } else if (board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X")) {
                    gameDone = true;
                    System.out.println("X wins!");
                    break;
                } else if (board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X")) {
                    gameDone = true;
                    System.out.println("X wins!");
                    break;
                } else if (board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X")) {
                    gameDone = true;
                    System.out.println("X wins!");
                    break;
                } else if (board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")) {
                    gameDone = true;
                    System.out.println("X wins!");
                    break;
                } else if (board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X")) {
                    gameDone = true;
                    System.out.println("X wins!");
                    break;
                } else if (board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X")) {
                    gameDone = true;
                    System.out.println("X wins!");
                    break;
                } else {
                    if (!(board[0][0].equals("-")) && !(board[0][1].equals("-")) && !(board[0][2].equals("-")) && !(board[1][0].equals("-")) && !(board[1][1].equals("-")) && !(board[1][2].equals("-")) && !(board[2][0].equals("-")) && !(board[2][1].equals("-")) && !(board[2][2].equals("-"))) {
                        gameDone = true;
                        System.out.println("Tie! Game Over!");
                        break;
                    } else {
                        System.out.println("Switching turns!");
                        oTurn = true;
                        xTurn = false;
                    }
                }
            }
        }
    }
}
