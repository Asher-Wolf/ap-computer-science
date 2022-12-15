public class Catalog {

  public static void main(String[] args) {

    Text book1 = new Book("how to get away with traffic violations", "charles Leclerc", 2006, "henry cavil");
    Text book2 = new Book("The Hobbit", "Tolkien", 2006, "Harper Collins");
    Book book3 = new Book("Democracy in America", "Tocqueville", 2003, "Penguin");
    Article art = new Article("How to Get Your Rabbit to De-Stabilize Foreign Governments", "Tom Hanks", 2022, "Vogue");
    website web = new website("road rage.com", "Cobder Sibdert", 2022, "https://www.google.com/search?q=henry+cechini&rlz=1C1RXQR_enUS1022US1022&source=lnms&tbm=isch&sa=X&ved=2ahUKEwj2tYGGrPz7AhVwATQIHS6cD7QQ_AUoAXoECAEQAw&biw=1920&bih=912&dpr=1" );


    System.out.println(web);
    System.out.println(art);
    System.out.println(book1);
    System.out.println(book2);
    System.out.println(book3);

    


  }


}
