package finalProject;
import java.util.Scanner;

public class driver {

    public static void main(String[] args) {

        Classes wordPhrase = new Classes("hello there");
        Scanner k = new Scanner(System.in);

        System.out.println("there is a group of classes designed to modify a string phrase");
        System.out.println("please enter a long word or phrase: ");
        String phrase = k.nextLine();
        
        System.out.println("one class inserts a sting in the middle of your phrase, one reverses your string, one counts how may of a certain letter is present in the string, one takes a segemnt of your phrase and the last one ends the peorgram.");

        int h = 0; 
        while ( h == 0 ){

            System.out.print("which program would you like to use?: insert, reverse, counter, segment, print, or end ");
            String choice = k.next();
            System.out.println(choice);
            
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

            if ( choice.equalsIgnoreCase("insert")){

                System.out.print("please input a word: ");
                String word = k.next();

                System.out.print("please input a place to insert that word: ");
                int insertion = k.nextInt();



                //wordPhrase.insert( phrase , word , insertion );

                phrase = wordPhrase.insert( phrase , word , insertion );

            }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

            else if( choice.equalsIgnoreCase("reverse")){
                phrase = wordPhrase.reverse(phrase);
                
            }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


            else if( choice.equalsIgnoreCase("counter")){
                System.out.print("please input a letter to check how many times it appears in the phrase: ");
                String letter = k.next();
                wordPhrase.letterCounter(phrase , letter);
            }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

            else if( choice.equalsIgnoreCase("segment")){
                System.out.print("please give a number to start your segment at: ");
                int start = k.nextInt();
                System.out.print("please input a number for the length of your segment ( make sure it doesn't go outside the lengh of your phrase): ");
                int len = k.nextInt();
                phrase = wordPhrase.segment(phrase, start , len );
            }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            
            else if( choice.equalsIgnoreCase("print")){
                System.out.println(phrase);
            }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            else{
                h=1;
            }
            

            

            

            

            

        }
        



        




    }}

    
