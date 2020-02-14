public class Circle implements GeometricalFigure {
    private final double j;

    public Circle(double radius) {
        this.j = radius;
    }

    public double getSurface() {
        return Math.PI * Math.pow(j, 2);
    }
}
