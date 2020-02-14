import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getSurface() {
        Rectangle rectangle1 = new Rectangle(5, 2);
        assertEquals(10, rectangle1.getSurface());
        Rectangle rectangle2 = new Rectangle(1, 2);
        assertEquals(2, rectangle2.getSurface());
    }
}