import java.util.Scanner;

public class textparser{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter a long word or phrase: ");
        String phrase = keyboard.nextLine();
        System.out.println(phrase);

        //this programe will teach you how to parse words. it will show you how to use many function sthat will pertain to strings. we will take your phrase and edit it many times

        //.length(); will return the number of characters in your word or phrase

        System.out.println("                your word or phrase has: " + phrase.length() + " characters.");

        //.charAt(index): index will return the desired character at the desired index
        // the index of a string srtarts at 0 and increases until the end of a string

        System.out.println("                the third letter of your phrase is: " + phrase.charAt(2));

        //.toUpperCase() This will make your phrase all upper case
        System.out.println("                your phrase all caps is: " + phrase.toUpperCase());
 
        //.toLowerCase() this will make your phrase all lower case
        System.out.println("                your phrase all small like is: " + phrase.toLowerCase());

        //boolean is a variable that will return once of two things, true or false
        // .contains checks to see if the phrase has the desired letters. it will not account for upper or lowercasing  
        boolean hasThe = phrase.contains("the");
        System.out.println("                does the phrase contain \' the \' " + hasThe);

        // .substring(first,last) this will return a new string that is a peice of the orignial string, starrting at the first index and ending and the second index. make sure that the string is the apropritate length for the input indexes
        System.out.println("your phrase includes the follwoing letters " + phrase.substring(3,5));

        int length = phrase.length();
        int halfway = length/2;
        int third = length/3;
        int secondThird = length*2/3;

        System.out.println("the middle letter is: " + phrase.charAt(halfway));
        System.out.println("the first third of the phrase is:  " + phrase.substring(0, third));
        System.out.println("the middle third is: " + phrase.substring( third, secondThird) );
        System.out.println("the last third is: " + phrase.substring(secondThird, length ) );

        //.indexOf() returnes the first index of the desired character 
        System.out.println("the first \'a\' is at index:  " + phrase.indexOf('a'));

        keyboard.close();

    }

}
    
       