import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getSurface() {
        Point point = new Point(1.0, 1.0);
        Circle circle = new Circle(point, 1);
        assertEquals(Math.PI, circle.getSurface());
    }
}