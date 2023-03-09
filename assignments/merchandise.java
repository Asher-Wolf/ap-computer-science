public class merchandise{

    int whole;
    double retail;
    String name;
    int quantity;

    public merchandise(int c, double rc , String n, int q ){
        whole = c;
        retail = rc;
        name = n;
        quantity = q;
    }

    public merchandise(){
        whole = 12;
        retail = 75;
        name = "PRIME CUCUMBER";
        quantity = 50 ;

    }

    public void addQuantity(){
        quantity +=1;
    }

    public void discount(){
        retail *= .9;
    }

    public void sell(){
        quantity -= 1;
        System.out.println("we made " + retail + " off this sale");
    }

    public String toString(){
        return "the item is a " + name + " it costs " + whole + " to buy, but we charge you " + retail + " and we have " + quantity + " in stock";
    }
}

