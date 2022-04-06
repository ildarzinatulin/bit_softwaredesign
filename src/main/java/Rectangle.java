public class Rectangle implements GeometricalFigure {
    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getSurface() {
        return height * width;
    }
}
