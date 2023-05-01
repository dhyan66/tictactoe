import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // initialising the scanner
        Scanner kb = new Scanner(System.in);

        // initialising arrays with 3 rows and 3 columns

        int[][] grid = new int[3][3];

        // declaring the variables and taking inputs from the players


        int sentinalValue = -1;
        int store = 0;
        int counter = 1;                   // keeps track of the players
        String playerName = kb.next();
        int gridPlacement = kb.nextInt();  // grid location from the user to start while loop
        int moveCount1=0;                  // move counter for player 1
        int moveCount2=0;                  // move counter for player 2

        // while loop for checking invalid input

        while (gridPlacement==0||gridPlacement>9){
            System.out.println( "The move is not valid, try again.");
            playerName = kb.next();
            gridPlacement = kb.nextInt();
            if(gridPlacement>0&&gridPlacement<9){
                break;
            }
        }




        int gridProd1 = 0; // variable to keep track of the grid placement of player1
        int gridProd2 = 0; // variable to keep track of the grid placement of player2


        // while loop for sentinal value check and loop termination

        while (gridPlacement != sentinalValue) {
            store = gridPlacement;
            switch (gridPlacement) {  // used switch case to fill the grid

                case 1:
                    if (counter % 2 != 0) {  // conditional statements which checks if its player 1 or not.
                        grid[0][0] = 1;
                        counter++;
                        moveCount1++;
                        break;
                    }
                    if (counter % 2 == 0) {
                        grid[0][0] = 2;
                        counter++;
                        moveCount2++;
                        break;
                    }


                case 2:
                    if (counter % 2 != 0) {
                        grid[0][1] = 1;
                        counter++;
                        moveCount1++;
                        break;
                    }
                    if (counter % 2 == 0) {
                        grid[0][1] = 2;
                        counter++;
                        moveCount2++;
                        break;
                    }


                case 3:

                    if (counter % 2 != 0) {
                        grid[0][2] = 1;
                        counter++;
                        moveCount1++;
                        break;
                    }
                    if (counter % 2 == 0) {
                        grid[0][2] = 2;
                        counter++;
                        moveCount2++;
                        break;
                    }


                case 4:
                    if (counter % 2 != 0) {
                        grid[1][0] = 1;
                        counter++;
                        moveCount1++;
                        break;
                    }
                    if (counter % 2 == 0) {
                        grid[1][0] = 2;
                        counter++;
                        moveCount2++;
                        break;
                    }


                case 5:
                    if (counter % 2 != 0) {
                        grid[1][1] = 1;
                        counter++;
                        moveCount1++;
                        break;
                    }
                    if (counter % 2 == 0) {
                        grid[1][1] = 2;
                        counter++;
                        moveCount2++;
                        break;
                    }


                case 6:
                    if (counter % 2 != 0) {
                        grid[1][2] = 1;
                        counter++;
                        moveCount1++;
                        break;
                    }
                    if (counter % 2 == 0) {
                        grid[1][2] = 2;
                        counter++;
                        moveCount2++;
                        break;
                    }


                case 7:
                    if (counter % 2 != 0) {
                        grid[2][0] = 1;
                        counter++;
                        moveCount1++;
                        break;
                    }
                    if (counter % 2 == 0) {
                        grid[2][0] = 2;
                        counter++;
                        moveCount2++;
                        break;
                    }


                case 8:
                    if (counter % 2 != 0) {
                        grid[2][1] = 1;
                        counter++;
                        moveCount1++;
                        break;
                    }
                    if (counter % 2 == 0) {
                        grid[2][1] = 2;
                        counter++;
                        moveCount2++;
                        break;
                    }


                case 9:
                    if (counter % 2 != 0) {
                        grid[2][2] = 1;
                        counter++;
                        moveCount1++;
                        break;
                    }
                    if (counter % 2 == 0) {
                        grid[2][2] = 2;
                        counter++;
                        moveCount2++;
                        break;

                    }


            }

            playerName = kb.next(); // updating the player name
            gridPlacement = kb.nextInt(); // taking the next grid location from the player

            while (gridPlacement == 0 || gridPlacement > 9) { // while loop for checking invalid input
                System.out.println("The move is not valid, try again.");
                playerName = kb.next();
                gridPlacement = kb.nextInt();
                if (gridPlacement > 0 && gridPlacement < 9) {
                    break;
                }
            }
            while (gridPlacement == store) {
                System.out.println("The move has already been played, try again.");
                playerName = kb.next();
                gridPlacement = kb.nextInt();
                if(gridPlacement!=store){
                    break;
                }
            }
        }

        // output


        // printing out the grid

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j] + " ");

            }
            System.out.println(" ");
        }

        //finding if any zero
        boolean anyZero=false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[i][j]==0){
                    anyZero=true;
                    break;
                }
            }
        }

        // conditional statements for predicting the winner after the game

        boolean isDraw=false;
        boolean isWin=false;
        int totalCounts = moveCount1+moveCount2;
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][1] != 0) {  // conditions for checking rows

                if (grid[i][0] == 1) {
                    System.out.print("Game Over - Player 1 Wins");
                    isWin=true;
                    if(totalCounts>7){
                        System.out.println("100 points");
                    }
                    if(totalCounts<=5){
                        System.out.println("300 points");
                    }
                    if(totalCounts>5&&totalCounts<=7){
                        System.out.println("200 points");
                    }
                    return;
                }
                if (grid[i][0] == 2) {
                    System.out.print("Game Over - Player 2 Wins");
                    isWin=true;
                    if(totalCounts>7){
                        System.out.println("100 points");
                    }
                    if(totalCounts<=5){
                        System.out.println("300 points");
                    }
                    if(totalCounts>5&&totalCounts<=7){
                        System.out.println("200 points");
                    }

                    return;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i] && grid[1][i] != 0) {  //condition for checking columns
                if (grid[0][i] == 1) {
                    System.out.print("Game Over - Player 1 Wins");
                    isWin=true;
                    if(totalCounts>7){
                        System.out.println("100 points");
                    }
                    if(totalCounts<=5){
                        System.out.println("300 points");
                    }
                    if(totalCounts>5&&totalCounts<=7){
                        System.out.println("200 points");
                    }
                    return;
                }
                if (grid[0][i] == 2) {
                    System.out.print("Game Over - Player 2 Wins");
                    isWin=true;
                    if(totalCounts>7){
                        System.out.println("100 points");
                    }
                    if(totalCounts<=5){
                        System.out.println("300 points");
                    }
                    if(totalCounts>5&&totalCounts<=7){
                        System.out.println("200 points");
                    }
                    return;
                }
                else if((!isWin)&&(!anyZero)){
                    System.out.println("Game Over - Draw");
                    isDraw=true;
                    return;
                }

            }
        }


        // diagonal check (right to left bottom)


        if (grid[2][0] == grid[1][1] && grid[1][1] == grid[0][2]) {

            if (grid[1][1] == 1) {
                System.out.print("Game Over - Player 1 Wins");
                isWin=true;
                if(totalCounts>7){
                    System.out.println("100 points");
                }
                if(totalCounts<=5){
                    System.out.println("300 points");
                }
                if(totalCounts>5&&totalCounts<=7){
                    System.out.println("200 points");
                }
                return;
            }
            if (grid[1][1] == 2) {
                System.out.print("Game Over - Player 2 Wins");
                isWin=true;
                if(totalCounts>7){
                    System.out.println("100 points");
                }
                if(totalCounts<=5){
                    System.out.println("300 points");
                }
                if(totalCounts>5&&totalCounts<=7){
                    System.out.println("200 points");
                }
                return;
            }
            else if((!isWin)&&(!anyZero)){
                System.out.println("Game Over - Draw");
                isDraw=true;
                return;
            }


        }
        // checking diagonals for the winners (left to right bottom)


        for (int i = 0; i < 3; i++) {
            if (grid[i][i] == 1) {
                gridProd1++;
            }
            if (grid[i][i] == 2) {
                gridProd2++;
            }
        }
        if (gridProd1 == 3) {
            System.out.println("Game Over - Player 1 Wins");
            isWin=true;
            if(totalCounts>7){
                System.out.println("100 points");
            }
            if(totalCounts<=5){
                System.out.println("300 points");
            }
            if(totalCounts>5&&totalCounts<=7){
                System.out.println("200 points");
            }

        }
        if (gridProd2 == 3) {
            System.out.println("Game Over - Player 2 Wins");
            isWin=true;
            if(totalCounts>7){
                System.out.println("100 points");
            }
            if(totalCounts<=5){
                System.out.println("300 points");
            }
            if(totalCounts>5&&totalCounts<=7){
                System.out.println("200 points");
            }

        }
        else  if((!isWin)&&(!anyZero)){
            System.out.println("Game Over - Draw");
            isDraw=true;

        }

        if(!(isWin)&&!(isDraw)){
            System.out.println("Game Over - Exit");
        }




    }

}