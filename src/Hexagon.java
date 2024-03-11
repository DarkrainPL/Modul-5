public class Hexagon implements GeometricFigure {

    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (3 * (Math.sqrt(3) * Math.pow(side, 2))) / 2;
    }
}
