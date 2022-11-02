package assignments;
import java.util.*;

    public class passcode{
        public static void main(String args[]){
    
            System.out.println("please give your name: ");
            Scanner NAMEX = new Scanner(System.in);
            String NAME = NAMEX.nextLine();
    
            System.out.println("your name is " + NAME);
    
            System.out.println("please gimme gimme password?  ");
            Scanner PASS = new Scanner(System.in);
            String pass = PASS.nextLine();

            if (pass.equals("no thanks")){
                System.out.println("you're correct!");
    
            }

            else {
                System.out.println("i expected more from you. i know your most regrettable life decisions and i will now hold them over you");

            }
                
            NAMEX.close();
            PASS.close();
    
        }
    
    }

