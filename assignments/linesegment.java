public class linesegment {
    private Point point1;
    private Point point2;

    public linesegment(Point p, Point x) {
        point1 = p;
        point2 = x;
    }

    public String getSlope(){

        return "the slope between those two points" + (point1.getY()-point2.getY()) / (point1.getX()-point2.getX());
    }

    public String distance(){
        return "the distance between your points is" + Math.sqrt(Math.pow(point2.getX()-point1.getX(),2) * Math.pow(point2.getY() - point1.getY(),2));
    }

    public String toString(){
        return "the endpoints of the line are " + (point1.getX()) + " , " +  (point1.getY()) + " and " +  (point2.getX()) + " , " + (point2.getY());
    }



}

