package assignments2;
import java.util.*;



public class arraylist {
    public static void main(String[] args) {
        String [] arrray = new String [3];

        arrray[1] = "heehee";

        for( int k = 0 ; k < arrray.length; k++){
             System.out.println(arrray[k] + " ");
        }

        ArrayList<String> hello = new ArrayList<String>();
        hello.add("hello");
        hello.add("there");
        hello.add("human");

        hello.set( 1 , "human");
        hello.remove( 2 );

       System.out.println(hello);


    }
}
