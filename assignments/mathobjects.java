import java.util.*;

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
        return "4x - 8 = " + ((4*x) - 8); 
    }
}

class StringFunc{
   
    private String word;

    public StringFunc(String words){
        word = words;

    }

    public String toString(){
        return word.substring(0, (word.length()-1));
    }

}

class StringLen{
    private String phrase;
    private String tell; 

    public StringLen(String PHRASE){
        phrase = PHRASE;
        double even = phrase.length()%2;

        if(even == 0){
            tell = "it is even";
        }
        else{
            tell = "it is odd";
        }
    }
    public String toString(){
            return tell;
    }
}


class shuffleCharacters{
    private String word;

    public shuffleCharacters(String w){
        word = w;
    }

    public String toString(){
        ArrayList<Character> shuffled = new ArrayList<Character>();
        for(int x= 0; x < word.length(); x ++){
            shuffled.add(word.charAt(x));                
        }

        Collections.shuffle(shuffled);
        String shuffFinal = shuffled.toString();

        shuffFinal = shuffFinal.replace("[", "");
        shuffFinal = shuffFinal.replace("]", "");
        shuffFinal = shuffFinal.replace(",", "");
        shuffFinal = shuffFinal.replace(" ", "");

        return shuffFinal;
    }
}


public class mathobjects{
    public static void main(String[] args){
        
    functions func1 = new functions(10);
    System.out.println(func1);

    functions2 func2 = new functions2(20);
    System.out.println(func2);

    StringFunc str1 = new StringFunc("basinki");
    System.out.println(str1);

    StringLen str2 = new StringLen("balllllllllllslslslslslslslslssllslslslslsls");
    System.out.println(str2);
    
    StringRepeat str3 = new StringRepeat("tyler is so dreamy            ", 69);
    System.out.println(str3); 

    shuffleCharacters str4 = new shuffleCharacters("OBAAM");
    System.out.println(str4);
    
    }
}