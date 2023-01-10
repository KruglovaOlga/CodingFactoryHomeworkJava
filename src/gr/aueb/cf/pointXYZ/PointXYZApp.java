package gr.aueb.cf.pointXYZ;

public class PointXYZApp {

    public static void main(String[] args) {

        PointXYZ point = new PointXYZ();

        point.setX(10);
        point.setY(20);
        point.setZ(20);

        PointXYZ point2 = new PointXYZ(2, 0, 3);

        System.out.println(point.convertToString());
        System.out.println(point2.convertToString());
    }
}
