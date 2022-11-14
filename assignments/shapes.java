import java.util.Scanner;

public class shapes {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        
        int x = 5;
        int y = 0;

        boolean done = false;
        String shape = "";
        int b = 0;
        int c = 0;


        while(done != true){

            System.out.println("this code makes shapes, would you like an iso triangle, a right triangle, a square, a rectangle, exit? ");
            shape = keyboard.nextLine();

            if(shape.equals("exit")){
                System.out.println("ending program");
                System.exit(0);
            }

            System.out.println("how tall would you like the shape to be?");
            b = keyboard.nextInt();

            if (shape.equals("right triangle")){

                for(y=0; y<=b ; y++){
                    for(x=0; x<y; x++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            else if (shape.equals("rectangle")){

                System.out.println("how wide would you like the shape to be?");
                c = keyboard.nextInt();

                for(y=0; y<b ; y++){
                    for(x=0; x<c; x++){
                        System.out.print("*  ");
                    }
                    System.out.println();
                }
            }
            
            else if (shape.equals("iso triangle")){

                int B = b/2;

                for(y=0; y<B ; y++){
                    for(x=0; x<y; x++){
                        System.out.print("*");  
                    }
                    System.out.println();
                }

                for(y=B; y >=0 ; y--){
                    for(x=0; x <=y; x++){
                        System.out.print("*");  
                    }
                    System.out.println();
                }
            }  
            
            
        }   
    }
}
    
