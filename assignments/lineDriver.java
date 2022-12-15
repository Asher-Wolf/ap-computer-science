public class lineDriver {
    public static void main(String[] args) {
        Point point1 = new Point(15, 20);
        Point point2 = new Point(5, 45);

        linesegment point = new linesegment(point1, point2);
        System.out.println(point);
        System.out.println(point.getSlope());
        System.out.println(point.distance());


        

    }
}
