//package assignments;
import java.util.*;

public class starterProgram {
    public static void main(String args[]){

        System.out.print("please give you first name");
        Scanner keyboard = new Scanner(System.in);
        String first = keyboard.nextLine();

        System.out.print("please give you last name");
        Scanner keyboard1 = new Scanner(System.in);
        String last = keyboard1.nextLine();

        System.out.print("your name is " + last + ", " + first);

        keyboard.close();
        keyboard1.close();

    }

}
    

        