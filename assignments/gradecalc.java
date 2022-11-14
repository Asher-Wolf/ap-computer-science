//package assignments;
import java.util.Scanner;

public class gradecalc{    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("this programe will calculate your compouter science grade and tell you your letter grade");


        System.out.println("please enter your average grade for KEY CONCEPTS: ");
        int gradeKeyconcepts = keyboard.nextInt(); // 40%

        System.out.println("please enter your average grade for QUIZES: ");
        int gradeQuiz = keyboard.nextInt(); // 20%

        System.out.println("please enter your average grade for PROJECTS: ");
        int gradeProjects = keyboard.nextInt(); // 20%

        System.out.println("please enter your average grade for TESTS: ");
        int gradeTests = keyboard.nextInt(); // 20%

        gradeQuiz/= 5;
        gradeProjects/= 5;
        gradeTests/= 5;
        gradeKeyconcepts*=2;
        gradeKeyconcepts/= 5;

        int gradeTot = gradeKeyconcepts + gradeProjects + gradeQuiz + gradeTests;

        if (gradeTot > 90 && gradeTot < 101 ){
            System.out.println("your percent grade is " + gradeTot );
            System.out.println("your letter grade is an A" );
        }
        else if (gradeTot > 80 && gradeTot < 90 ){
            System.out.println("your percent grade is " + gradeTot);
            System.out.println("Your letter grade is a B");
        }
        else if( gradeTot > 70 && gradeTot < 80 ){
            System.out.println("your percent grade is " + gradeTot);
            System.out.println("your letter grade is a C");
        }

        else if( gradeTot > 60 && gradeTot < 70 ){
            System.out.println("your percent grade is " + gradeTot);
            System.out.println("your letter grade is a D");
        }

        else if(gradeTot < 60 ){
            System.out.println("your percent grade is " + gradeTot);
            System.out.println("your letter grade is a F DUMBASS HAHA");
        }

        else{
            System.out.println("what did you even do wtf ??????????");

        }

        keyboard.close();
        }   
    
    }
