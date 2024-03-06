public class Hexagon implements GeometricFigure {

    int side;

    public Hexagon(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return (int) (3 * (Math.sqrt(3) * Math.pow(side, 2)))/2; // tu powinien byc double w trojkacie z reszta tez nie?
    }
}
