import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

   @org.junit.jupiter.api.Test
    void getSurface() {
       Point point = new Point(0.0, 0.0);
       Square square1 = new Square(point, 5);
       assertEquals(25, square1.getSurface());
       Square square2 = new Square(point, 1.1);
       assertEquals(1.1 * 1.1, square2.getSurface());
    }
}