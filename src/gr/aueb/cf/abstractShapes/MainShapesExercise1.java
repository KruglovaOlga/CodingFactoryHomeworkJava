package gr.aueb.cf.abstractShapes;

public class MainShapesExercise1 {

    public static void main(String[] args) {
        // create instance of Circle
        Circle c = new Circle(5);
        c.setId(1L);
        System.out.println("Circle Radius: " + c.getRadius());
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle ID: " + c.getId());
        System.out.println("*******************************");

        // create instance of Line
        Line l = new Line(7);
        System.out.println("Line X1: " + l.getLength());
        System.out.println("*******************************");

        // create instance of Rectangle
        Rectangle r = new Rectangle(5, 7);
        r.setId(2L);
        System.out.println( r.toString());
        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle ID: " + r.getId());
    }

}
/*
    public static void main(String[] args) {
        AbstractShape abstractShape = new Circle(5);
        ((Circle) abstractShape).setId(1);
        System.out.println("Circle Id: " + abstractShape.getId());
        System.out.println("Circle Radius: " + ((Circle) abstractShape).getRadius());
        System.out.println("Circle Area: " + ((ITwoDimensional) abstractShape).getArea());


        Line line = new Line(10);
        System.out.println("Line Length: " + line.getLength());

        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.setId(2);
        System.out.println("Rectangle Id: " + rectangle.getId());
        System.out.println("Rectangle Width: " + rectangle.getWidth());
        System.out.println("Rectangle Height: " + rectangle.getHeight());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}

 */
