import java.util.Scanner;


public class leftright {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //0 is left hand
        //1 is right hand
        int hand = (int)Math.random()*2;
        // set our guess = to something that is not left or right

        int guess = -2;

        //add in while checker 

        while (guess != hand){
            System.out.println("which hand am i holding candy in. please type left or right");
            String input = keyboard.nextLine();

            if (input.equals("left")){
                guess = 0;
            }
            else if (input.equals("right")){
                guess = 1;
            }
            else{
                System.out.println("please type left or right");
            }
        }

        System.out.println("you are correct but you don't get a candy");

        keyboard.close();
    }
}
