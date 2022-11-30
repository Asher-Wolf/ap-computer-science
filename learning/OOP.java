

class Computer{

    private String processor;
    private int memory;
    private int storage;

    public Computer(String proc, int mem, int stor){
        processor = proc;
        memory = mem;
        storage = stor;

    }

    public String toString(){
        return processor + ", " + memory + " GB memory, " + storage + " GB storage";
    }

}

class pets{

    private int number;
    private String type;
    private String size;
    private String color;

    public pets(int num, String ty, String siz, String col){
        number = num;
        size = siz;
        type = ty;
        color = col;
    }
    public String toString(){
        return "You have " + number + " " + size + " " + color + " " + type + " in your home";

 
    }

}

class car{

    private int amount;
    private int year;
    private String model;
    private String color;

    public car(int amo, int yea, String mod, String col){
        amount = amo;
        model = mod;
        year = yea;
        color = col;
    }
    public String toString(){
        return "You have " + amount + " " + year + " " + color + " " + model + " ";

 
    }

}

public class OOP {
    

        public static void main(String[] args){
            System.out.println("this will give an intro to object oriented prgraming");

            Computer comp1 = new Computer("barack obamba", 69, 420);

            System.out.println(comp1);

            pets asher = new pets(89, "obamba", "extremely tiny", "brown");
            System.out.println(asher);

            car yass = new car(3, 1980, "la ferraris", "red" );
            System.out.println(yass);
        }
}