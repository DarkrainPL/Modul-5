import org.w3c.dom.ls.LSOutput;

public class Rectangle implements GeometricFigure {

    int sideA; // prywatne pola
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int calculateArea() {
        return sideA * sideB;
    }
}
