package assignments2;
import java.util.*;
import javax.swing.SpringLayout;


public class programs { 

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        

        System.out.println("please give a tempature in farenshaight: ");
        double f = k.nextDouble();
        double c = ((f - 32.0) * (5.0/9.0));
        System.out.println( f + " degrees farnanaheight is " + c +  " degrees calculous" );
       
//------------------------------------------------------------------------------------------------------------

        System.out.println("please give your weight: ");
        double earth = k.nextDouble();
        double moon = (earth * (1.0/6.0));
        System.out.println( earth + " pounds on earth is " + moon + " pounds on the moon" );

//-----------------------------------------------------------------------------------------------------------------

        System.out.print("please give your name: ");
        String name = k.next();
        String back = " "; 

        for( int x = name.length() ; x > 0 ; x-- ){
            back += name.charAt(x-1);
        }
        System.out.println(back);

//-----------------------------------------------------------------------------------------------------------------

        System.out.print("please give a number in binary: ");
        String bin = k.next();
        System.out.println(bin + " in base 10 is: " + Integer.parseInt( bin , 2 ));

//-----------------------------------------------------------------------------------------------------------------

        System.out.print("please give a number in base 10: ");
        int num = k.nextInt();
        System.out.println( num + " in binary is: " + Integer.toBinaryString(num));

//-----------------------------------------------------------------------------------------------------------------

        System.out.print("please give me a bunch of seconds: ");
        int sec = k.nextInt();
        int h = 0;
        int m = 0;

        while(sec >= 3600 ){
            sec -= 3600;
            h ++;
        }
        while( sec >= 60 ){
            sec -= 60;
            m++;
        }

        System.out.println( sec + " seconds is " + h + " hours, " + m + " minutes, and " + sec + " seconds." );

//------------------------------------------------------------------------------------------------------------------

        chair('j');

//------------------------------------------------------------------------------------------------------------------


        System.out.println("give me a width/hieght for a sqaure: ");
        double len = k.nextDouble();
        System.out.println("give me an x coordinate: ");
        double x = k.nextDouble();
        System.out.println("give me a y coordinate: ");
        double y = k.nextDouble();

        int numb = 500000;
        double rad = len/2;
        double pointY = 0;
        double pointX = 0;
        double in = 0;
        double out = 0; 
        for (int i = 0; i<= numb; i++){
            pointX = Math.random() * len;
            pointY = Math.random() * len;
            if(Math.sqrt(Math.pow(pointX - x, 2) + Math.pow(pointY - y, 2)) > rad){
                out++;
            }
            else{
                in++;
            }  
        }
        System.out.println(out/in);

//------------------------------------------------------------------------------------------------------------------

    System.out.println("please give ma a radius for a sphere: ");
    double ra = k.nextDouble();

    double volume = (4/3) * Math.pow(( 3.1415926535897932384626433832795028841971693 * ra), 3);

    System.out.println(volume);
    
    }

//------------------------------------------------------------------------------------------------------------------

        public static void chair (char a ){

            if( Character.isLetter(a)){
                System.out.println("your character is a letter :) ");
            }
            else if( Character.isDigit(a)){
                System.out.println("your character is a number :) ");
            }
            else{
                System.out.println("your chracter is a special character :) ");
            }
        }
}
