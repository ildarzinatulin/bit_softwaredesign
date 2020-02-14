import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

   @org.junit.jupiter.api.Test
    void getSurface() {
       Square square1 = new Square(5);
       assertEquals(25, square1.getSurface());
       Square square2 = new Square(1.1);
       assertEquals(1.1 * 1.1, square2.getSurface());
    }
}