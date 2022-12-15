public class website extends Text{

    public String URL;

    public website(String t, String a, int y, String u) {
        title = t;
        author = a;
        year = y;
        URL = u;
      
      }

      public String toString() {
        return title + ", " + author + ", " + year + ", " + URL;
      }

}
    

