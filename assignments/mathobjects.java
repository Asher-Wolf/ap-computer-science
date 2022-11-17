import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

class functions{

    private int x;

    public functions(int X){
        x = X;

    }
    public String toString(){
        return "3x + 5 = " + ((3*x) + 5); 
    }
}
class functions2{

    private int x;

    public functions2(int X){
        x = X;

    }
    public String toString(){
        return "4x - 8 = " + ((4*x) + 5); 
    }
}

public class mathobjects{
        public static void main(String[] args){
            
        functions func1 = new functions(10);
        System.out.println(func1);

        functions2 func2 = new functions2(20);
        System.out.println();

        }
}