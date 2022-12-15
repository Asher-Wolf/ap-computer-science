public class Point {
    
    private int x;
    private int y; 

    public Point(int X, int Y){
        x = X;
        y = Y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
