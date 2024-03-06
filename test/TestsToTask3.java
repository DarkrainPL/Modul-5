import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestsToTask3 {


    @Test
public void areaOfRectangle() {
        GeometricFigure rectangle = new Rectangle(3,4);
        Assertions.assertEquals(12, rectangle.calculateArea());
    }
    @Test
    public void areaOfTriangle() {
        GeometricFigure triangle = new Triangle(5,4);
        Assertions.assertEquals(10, triangle.calculateArea());
    }
    @Test
    public void areaOfHexagon() {
        GeometricFigure hexagon = new Hexagon(6);
        System.out.println(hexagon.calculateArea());
        Assertions.assertEquals(93, hexagon.calculateArea());
    }
}
