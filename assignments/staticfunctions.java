public class staticfunctions {
    public static void main(String[] args){
        henry("the current state of our US governemnt");
    }

    public staticfunctions () {}

    public static void henry( String haircolor){

        if ( haircolor.equalsIgnoreCase("ginger")){
            System.out.println("you are a henry you are amazing ");
        }
        else {
            System.out.println("meh");
        }
    }
}
