public class Rectangle implements GeometricalFigure {
    protected Point upperLeftPoint; //the coordinate of the upper-left corner of the Rectangle
    protected double height;
    protected double width;

    public Rectangle(Point upperLeftPoint, double height, double width) {
        this.upperLeftPoint = upperLeftPoint;
        this.height = height;
        this.width = width;
    }

    public double getSurface() {
        return height * width;
    }
}
