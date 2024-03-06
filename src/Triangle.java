public class Triangle implements GeometricFigure {

    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public int calculateArea() {
        return (int) (0.5*base*height);
    }
}
