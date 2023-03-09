
public class store {
    
    public static void main(String[] args) {

        merchandise cumber = new merchandise(140, 240, "cumber", 50);
        System.out.println(cumber.toString());

        cumber.addQuantity();
        System.out.println(cumber);

        cumber.sell();
        System.out.println(cumber);

        cumber.discount();
        System.out.println(cumber);

    }
}
