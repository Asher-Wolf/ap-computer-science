public class christmasdays {

    public static void main(String[] args) {
        

    String [] dayOfChristmas = new String[13];

    dayOfChristmas[1] = "A Partridge in a Pear Tree";

    dayOfChristmas[2] = "Two Turtle Doves";

    dayOfChristmas[3] = "Three French Hens";

    dayOfChristmas[4] = "Four Calling Birds";

    dayOfChristmas[5] = "Five Gold Rings";

    dayOfChristmas[6] = "Six Geese A-laying";

    dayOfChristmas[7] = "Seven Swans A-swimming";

    dayOfChristmas[8] = "Eight Maids A-milking";

    dayOfChristmas[9] = "Nine Ladies Dancing";

    dayOfChristmas[10] = "Ten Lords A-leaping";

    dayOfChristmas[11] = "Eleven Pipers Piping";

    dayOfChristmas[12] = "Twelve Drummers Drumming";
    
    String x = "";

    for( int i = 1 ; i < 13 ; i++){

        x = dayOfChristmas[i]+ "\n" + x;
        System.out.println("on the " + i + " day of christams " + " \n" + x);

    }
    }
}
