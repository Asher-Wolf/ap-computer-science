import java.util.*;

public class inputs {
    public static void main(String args[]){
        //System.out.println("this is an example of how to create a user input");
        //System.out.println("it will allow the user to type their answer and save it as a string");

        System.out.print("please enter a communist propogadnagw: ");
        Scanner keyboard = new Scanner(System.in);
            String input = keyboard.nextLine();

        //System.out.print("you said " + input);
        //System.out.println("there are " + input.length() + " characters in your word");
        //System.out.println("the second to last letter is: " + input.charAt(input.length() -2 ));
        
        //if statements checks to see IF an input matches a critteria. ELSE it does not
        //the computer checks in this order if -> else if -> else. you can have as many else ifs as you need. however there can only be one if and one else in you if statement 


        if (input.equals("sharing is caring")){
            System.out.println("ballsy move my brother");

        }
        else if (input.equals("personally i think pinnaple on pizza is pretty good actually and people just hate on it for the trend")){
            System.out.println("fr fr");

        }
        else {
            System.out.println("i know your most regrettable life decisions");


            
        }
        keyboard.close();
    }
}
