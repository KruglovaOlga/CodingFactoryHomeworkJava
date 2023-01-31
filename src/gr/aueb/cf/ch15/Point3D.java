package gr.aueb.cf.ch15;

public class Point3D extends Point2D{
    private double z;

    public Point3D(){}

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(double x, double y) {
        super(x, y);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() +  " {" +
                "z = " + z +
                '}';
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(z, 2));
    }


}


