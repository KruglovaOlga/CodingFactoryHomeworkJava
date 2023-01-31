package gr.aueb.cf.abstractShapes;

public class Circle extends AbstractShape implements ITwoDimensional {
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
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }
}
