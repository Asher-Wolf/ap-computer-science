import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        try (Scanner factor = new Scanner(System.in)) {
            //the goal of today is for the computer to type: 1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1  
            int x = 0;
            for(x=1; x<=10; x++){
                System.out.print(x + " ");
            }

            for(x=9; x>0; x--){
                System.out.print(x + " ");
            }

            //WHILE loops
            // while(test expression){
                // loop body tells the computer what to do if the test expression is met
            //}

            //create a factoreal funtion of a usar input. eg if they type 5 the output will be !5 = 120

            System.out.println("please gimme gimme a number pwease: ");
                int valid = factor.nextInt();

            int Y = 1;
            while(valid>0){
                Y = Y*valid;
                valid--;


            }
            System.out.println("the factorial = " + Y);
            //DO WHILE loop 
            //do
            //{
                    // statements, tell the computer what to do;
            //}while(test expression)
             //the goal of today is for the computer to type: 1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1
             int n = 0;
             do
             {
                System.out.print(n + " ");
                n++;

             }while( n <10 );

             do
             {
                System.out.print(n + " ");
                n--;

             }while( n >0 );

            factor.close();
        }

        // note before we begin 
        // ++ means incriment 1 up
        // -- means incriment 1 down

        //FOR loops:
            //for(initialization expression ; test_expression; update_expression){

        //   }
        // body of the looop tells the computer what to do with the variable if the test expression is not met


    }

}