package assignments2;

public class wordSearch {

    public static void main(String[] args) {
        String [][] grid = new String [15][15];

        for ( int x = 0; x< 15 ; x++ ){
            for ( int y = 0 ; y < 15; y++){
                grid[x][y] = wordSearch.randomLetter();

            }
        }

        grid[2][1] = "F";
        grid[2][2] = "E";
        grid[2][3] = "R";
        grid[2][4] = "R";
        grid[2][5] = "A";
        grid[2][6] = "R";
        grid[2][7] = "I";

        grid[3][2] = "M";
        grid[4][2] = "E";
        grid[5][2] = "R";
        grid[6][2] = "C";
        grid[7][2] = "E";
        grid[8][2] = "D";
        grid[9][2] = "E";
        grid[10][2] = "S";

        for (int a= 0 ; a < 15 ; a++){
            for( int b = 0; b < 15; b++){
                System.out.print(grid[a][b] + "  ");
            }
            System.out.println(grid[a][0]);
        }


        int rowIndex = -1;
        int count = 0;
        int columnIndex = 0;
        for ( String[] arr: grid ){
            String row = "";
            count++;

            for( String s: arr){
                row += s;
            }
            if ((row.indexOf("FERRARI") != -1 )){
                rowIndex = row.indexOf("FERRARI") + 1;
                columnIndex = count;
            }
        }
        System.out.println("the horizontal word is in row " + columnIndex + " and column " + rowIndex);

        int rowIndex2 = -1;
        int count2 = 0;
        int columnIndex2 = 0;
        for(int g = 0; g < grid.length; g++ ){
            String column = "";
            count2++;
            for(int h=0; h < grid.length; h ++){
                column += grid[h][g];
            }
            if ( column.indexOf("MERCEDES") != -1){
                columnIndex2 = column.indexOf("MERCEDES") + 1;
                rowIndex2 = count2;
            }
        }
        System.out.println("the vertical word is in column " + columnIndex2 + " starts in row " + rowIndex2 ) ;

    }

    public static String randomLetter(){
        String[] key = {"A" , "B" , "C" , "D" , "E" , "F" , "G" , "H" , "I" , "J" , "K" , "L" , "M" , "N" , "O" , "P" , "Q" , "R" , "S" , "T" , "U" , "V" , "W" , "X" , "Y" , "Z"};
        int num = (int)(Math.random() * 26);
        return key[num];

    }


    
}
