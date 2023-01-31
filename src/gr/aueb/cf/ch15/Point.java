package gr.aueb.cf.ch15;

public class Point {
    private double x;

    public Point() {}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Point(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "x = " + x +
                '}';
    }


    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(x, 2));
    }


}
