public class Circle implements GeometricalFigure{
    protected Point center;
    protected double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getSurface() {
        return Math.PI * Math.pow(radius, 2);
    }
}
