package assignments;
import java.util.Scanner;


public class rockpaperscissors {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //0 is left hand
        //1 is right hand
        float hand = (float)(Math.random())*3;

        if (hand>=0 && hand <=1){
            hand = 1;
        }
        else if (hand>1 && hand <=2){
            hand = 2;
        }
        else if (hand>2 && hand <=3){
            hand = 3;
        }

        int guess = 5;


        while (guess != 1 && guess != 2 && guess != 3 ){
            System.out.println("please say rock(1) paper(2) or scissors(3)");
            guess = keyboard.nextInt();

            if (guess == hand){
                System.out.println("wow what losers you tied");
            }

            if (guess == 1 && hand == 3){
                System.out.println("you won yayyyyyyyyyyyyyyyyyyyy");
            }
            if (guess == 2 && hand == 1){
                System.out.println("you won yayyyyyyyyyyyyyyyyyyyy");
            }
            if (guess == 3 && hand == 2){
                System.out.println("you won yayyyyyyyyyyyyyyyyyyyy");
            }
            if (guess == 1 && hand == 2){
                System.out.println("you lost yayyyyyyyyyyyyyyyyyyyy");
            }
            if (guess == 2 && hand == 3){
                System.out.println("you lost yayyyyyyyyyyyyyyyyyyyy");
            }
            if (guess == 3 && hand == 1){
                System.out.println("you lost yayyyyyyyyyyyyyyyyyyyy");
            }
            
        }

        keyboard.close();
    }
}
