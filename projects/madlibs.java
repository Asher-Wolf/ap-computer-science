package projects;
import java.util.Scanner;

public class madlibs {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("this is a madlib code bb gorl. your madlib needs to include at least 16 inputs");
        System.out.println("these could be propernouns, adjectives, places, people. etc.................................................. ");

        System.out.println("please enter a noun");
        String noun1 = keyboard.nextLine();

        System.out.println("please enter an adjective ( not a color )");
        String adjective1 = keyboard.nextLine();

        System.out.println("please enter a noun");
        String noun2 = keyboard.nextLine();

        System.out.println("please enter a room or historical building");
        String place1 = keyboard.nextLine();

        System.out.println("please enter a verb in the past tense");
        String verb1 = keyboard.nextLine();

        System.out.println("please enter a object");
        String noun3 = keyboard.nextLine();

        System.out.println("please enter a imprtant well known person");
        String person1 = keyboard.nextLine();

        System.out.println("please enter a reaction");
        String reaction1 = keyboard.nextLine();

        System.out.println("please enter an adjective ( not a color )");
        String adjective2 = keyboard.nextLine();

        System.out.println("please enter a number");
        String number1 = keyboard.nextLine();

        System.out.println("please enter a noun");
        String noun4 = keyboard.nextLine();

        System.out.println("please enter a verb in the past tense");
        String verb2 = keyboard.nextLine();

        System.out.println("please enter a famous historical massacre");
        String massacre1 = keyboard.nextLine();

        System.out.println("please enter a describing word ( not a color ) ");
        String describe1 = keyboard.nextLine();

        System.out.println("please enter a famous american war zone");
        String zone1 = keyboard.nextLine();

        System.out.println("please enter a specific vehicle");
        String vehicle1 = keyboard.nextLine();

        System.out.println("please enter a united states president or famous dictator (xcluding hitler)");
        String president1 = keyboard.nextLine();

        System.out.println("please enter a building type");
        String building1 = keyboard.nextLine();

        System.out.println("once upon a time " + noun1 + " was flirting it up real " + adjective1 + " like with " + noun2 + " when suddenly they decided it was time to go to " + place1 + ". once they got there " + noun1 + " " + verb1 + " on a  " + noun3 + ". While " + noun1 + " was doing that, " + person1 + " walked in and was " + reaction1 + ", they couln't beleive the " + adjective2 + " scene that was taking place. SUDDENLY " + number1 + " " + noun4 + " " + verb2 + " into " + place1 + " resulting in a scene resembling " + massacre1 + " after this " + describe1 + " night. all three of them decided to go on a vacation to " + zone1 + " but on their way their " + vehicle1 + " crashed into " + president1 + "'s " + building1 + " and evryone died happily ever after" );

        keyboard.close();

    }
}
