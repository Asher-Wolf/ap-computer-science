import java.util.Scanner;

public class math {
    public static void main(String[] args){
         int guess = 0;
        System.out.println("Please enter a number between 5-100: " );
        Scanner keyboard = new Scanner(System.in);
        guess = keyboard.nextInt();

        guess = (guess - 5) * 3;

        //System.out.println(guess);

        //Math ops in Java
        // + add, - subtract, * multiply, / divide
            // % mod : this will give you the remainder of the two numbers being divided.
        // for example:: 14 % 3 = 2, 19 % 4 = 3, 22 % 15 = 2

        guess = guess*3 - 10;
        System.out.println("the Math wizard has changed your number, guess what the new one is");
        int newGuess = keyboard.nextInt();
        while(newGuess != guess){
            if (newGuess > guess){
                System.out.println("YOU'RE GUES IS TO HI");
                newGuess = keyboard.nextInt();

            }
            else if (newGuess < guess){
                System.out.println("LOW !!! GUESS AGAIN DUMMY!");

            }

            else{
                System.out.println("you did it!");

            }
        }

        //conditional operators
        //compare two variables to see if they meet the given criteria
        //does_condtion_
        // == equal 
        // != not equal 
        // > greater than 
        // < less than
        // >= greater than or equal to 
        // <= less than or equal to 

        keyboard.close();

    }

}
