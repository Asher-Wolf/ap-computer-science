public class Rectangle {

    // Attributes
    int length;
    int width;
  
    // Default Constructor
    public Rectangle() {
      this.length = 1;
      this.width = 1;
   
    }
  
    // Constructor
    public Rectangle(int L, int W) {
      this.length = L;
      this.width = W;

    }
  
    // method with no parameters
    public String area() {
      int area = length * width;
      return "the area is:  " + area;
    }
  
    /* Example: Complete this method */
    public String perimeter() {
        int perimeter = 2*(length + width );
        return "the periminter is: " + perimeter; 
    }
  
    // method with parameters
    public String scale(double factor) {
      length = (int)( length * factor);
      width = (int)(width * factor);

      int perimeter = 2*(length + width );
      return "the scaled perimeter is: " + perimeter; 

    }
  
    public String toString() {
      return length + "/" + width + " rectangle";
    }
  }