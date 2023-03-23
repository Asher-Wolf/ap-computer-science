package assignments2;

import java.util.*;

public class TicTacToe {

  public static void main(String[] args) {

    int[][] grid = new int[3][3];
    Scanner kb = new Scanner(System.in);

    int player = 1;
    int round = 1;
    int winner = 0;

    while (winner == 0 && round <= 9) {
        String playerSymbol = "X";
        if (player == -1) playerSymbol = "O";

        System.out.println(playerSymbol + "'s turn\n'");

        int row = 4;
        int col = 4;
    
        while(row > 3){
            System.out.print("What row? (1-3): ");
            row = Integer.parseInt(kb.nextLine()) - 1;
            }

        while(col > 3){
            System.out.println("which column? (1-3)");
            col = Integer.parseInt(kb.nextLine()) - 1;
        }

        grid[row][col] = player;

        

      for(int a = 0; a<grid.length; a++){
        for(int b = 0; b<grid.length; b++ ){
            System.out.print(grid[a][b] + " ");
        }
        System.out.println();
      }

        
        winner = checkWinner(grid);

        if (winner != 0) {
                    System.out.println(playerSymbol + " wins!!!");
                    break;
                }

      player *= -1;
      round++;
    }

  }


  public static int checkWinner(int[][] grid) {
    
    int win = 0;

    for(int x = 0  ; x < 3; x++){
        if(grid[x][0] != 0 && grid[x][0] == grid[x][1] && grid[x][0] == grid[x][2]){
            win = grid[x][0];
        }
    }

    for (int y = 0  ; y < 3; y++ ){
         if(grid[0][y] != 0 && grid[0][y] == grid[1][y] && grid[0][y] == grid[2][y]){
             win = grid[0][y];
        }
    }

    if(grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]){
        win = grid[1][1];
    }

    if(grid[2][0] == grid[1][1] && grid[1][1] == grid[0][2]){
        win = grid[2][0];
    }

    return win;
  }
}


