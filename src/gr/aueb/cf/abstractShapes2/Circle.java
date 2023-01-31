package gr.aueb.cf.abstractShapes2;

public class Circle extends AbstractShape implements ICircle {
    private double radius;

    public Circle(){};

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public long getCircumference(double radius) {
        return ICircle.super.getCircumference(radius);
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public double getDiameter(double radius) {
        return radius * 2;
    }
}
