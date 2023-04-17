package assignments2;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

// Nathan Carpenter is the realist G alive

public class magicSquares {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        int[][] SquareTest = {{7,0,5}, {2,4,6}, {3,8,1}};
        squareChecker(SquareTest);

        int[][] SquareTest2 = {{7,12,1,14}, {2,13,8,11}, {16,3,10,5}, {9,6,15,4}};
        squareChecker(SquareTest2);

        System.out.print("please say how big you want the magic sqaure to be; ");
        int dime = k.nextInt();
        squareRandom(dime);
        
    }

    public static void squareRandom(int size){
        int[][] square = new int[size][size];

        boolean MagicTrue = true;
        boolean MagicFinal = false;

        while(MagicFinal == false){

            for (int y = 0; y < size; y++){
                for( int x = 0; x< size; x++ ){

                    square[y][x] = (int)(Math.random() * 10);
                }
            }

        int finder = 0;
        for(int i = 0; i < square[0].length; i++){
            finder += square[0][i];
        }

        MagicTrue = true;
        int sum =0;
        int diagonalTwo = 0;
        int diagonalOne = 0;

        for( int y= 0; y< square[0].length; y++){
            sum = 0;
            for(int x=0; x<square[0].length; x++){
                sum += square[y][x];
            }
            if (sum == finder && MagicTrue == true){
                MagicTrue = true;
            }
            else{
                MagicTrue = false;
            }
            diagonalTwo += square[y][square[0].length - y - 1];
        }
        for( int x= 0; x< square[0].length; x++){
            sum = 0;
            for(int y=0; y<square[0].length; y++){
                sum += square[y][x];
            }
            if (sum == finder && MagicTrue == true){
                MagicTrue = true;
            }
            else{
                MagicTrue = false;
            }
            diagonalOne += square[x][x];
        }
        if(diagonalOne == finder && MagicTrue == true ){
            MagicTrue = true;
        }
        else{
            MagicTrue = false;
        }
        if( diagonalTwo == finder && MagicTrue == true){
            MagicTrue = true;
        }
        else{
            MagicTrue = false;
        }

        MagicFinal = MagicTrue;
        }

        squareChecker(square);

        }
    


    public static boolean squareChecker(int [][] grid){

        int finder = 0;
        for(int r = 0; r< grid[0].length; r++){
            finder += grid[0][r];
        }
        boolean MagicTrue = true;
        int sum = 0;

        for( int y = 0; y < grid[0].length; y++ ){
            sum = 0;
            for(int x = 0; x < grid[0].length; x++){
                sum += grid[y][x];

            if (String.valueOf(grid[y][x]).length() == 1){
                System.out.print(grid[y][x] + " ");
            }
            else {
                System.out.print(grid[y][x] + " ");
            }
        }

        System.out.println(" = " + sum);

        if (sum == finder && MagicTrue == true ){
            MagicTrue = true;
        }
        else{
            MagicTrue = false;
        }
        }

//------------------------------------------------------------------------------

        for( int i = 0; i < grid[0].length; i++){
            System.out.print("|  ");
        }
        System.out.println("");
        
        for( int x = 0; x < grid[0].length; x++ ){
            sum = 0;
            for(int y = 0; y < grid[0].length; y++){
                sum += grid[x][y];

        }

        System.out.print(sum + " ");

        if (sum == finder && MagicTrue == true ){
            MagicTrue = true;
        }
        else{
            MagicTrue = false;
        }
        }

        
       
        int diag = 0;
        for( int b = 0; b < grid[0].length; b++){
            diag += grid[b][b];
        }
        if( diag != finder ){
            MagicTrue = false;
        }
        System.out.print(" " + diag);

//----------------------------------------------------------------------------

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("magic square: " + MagicTrue );
        System.out.println(" ");
        System.out.println("==========");
        System.out.println(" ");

        return MagicTrue;
    }
    
}