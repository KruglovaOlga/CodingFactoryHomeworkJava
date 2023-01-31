package gr.aueb.cf.ch15;

public class PointUtil {

    public static void main(String[] args) {
        Point p1 = new Point(5.5);
        Point p2 = new Point2D(2.2, -3.3);
        Point p3 = new Point3D(1.5, -7.7, 4.4);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println();

        System.out.printf("The distance from origin for " + p1.getClass().getSimpleName() + " is %.2f\n", distanceFromOrigin(p1));
        System.out.printf("The distance from origin for " + p2.getClass().getSimpleName() + " is %.2f\n", distanceFromOrigin(p2));
        System.out.printf("The distance from origin for " + p3.getClass().getSimpleName() + " is %.2f\n ", distanceFromOrigin(p3));

    }

    public static double distanceFromOrigin(Point point) {
        return point.getDistanceFromOrigin();
    }
}



