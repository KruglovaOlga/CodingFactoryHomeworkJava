package gr.aueb.cf.abstractShapes2;

public interface ITwoDimensional {
    /**
     * Gets the area of a 2D shape
     *
     * @return the area of a 2D shape
     */
    double getArea() ;

    /**
     * Gets the circumference of a circle
     * @return the circumference of a circle
     */
    default long getCircumference(double radius) {
        return (long) (2 * radius * Math.PI);
    }
}
