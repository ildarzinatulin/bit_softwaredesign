import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getSurface() {
        Circle circle1 = new Circle(1);
        assertEquals(Math.PI, circle1.getSurface());
        Circle circle2 = new Circle(2);
        assertEquals(Math.PI * 4, circle2.getSurface());
    }
}