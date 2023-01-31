package gr.aueb.cf.abstractShapes;

public class Rectangle extends AbstractShape implements ITwoDimensional {
    private double width;
    private double height;

    public Rectangle(){}

    public Rectangle(double width, double height) {

        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "width = " + width +
                ", height = " + height +
                '}';
    }

    @Override
    public double getArea() {
        return width * height;
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
