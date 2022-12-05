public class FOURFUNC {

    public static void main(String[] args){

        FOURFUNC funky = new FOURFUNC();
        funky.insult("the current state of the US governemnt");

        FOURFUNC func = new FOURFUNC();
        func.output("asher", "wolf");
        ballsy(5);
    }

    public FOURFUNC() {

    }

    public void output(String first, String last){
        System.out.println(first.charAt(0) + "" + last.charAt(0));
    }

    public static void ballsy(int x){
        System.out.println("4x - 8 = " + ((4*x) - 8)); 
    }

    public static void insult(String ball){
        System.out.println("haha WHAT STUPID STRING TO PICK WHY WOULD YOU DO THAT  \'" + ball + "\' more like uhhh stoopid");
    }

}



