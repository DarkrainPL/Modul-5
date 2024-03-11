public class Square extends Rectangle {


    public Square(double sideA) {

        super(sideA, sideA);
    }

    public double calculateDiameter(double sideA) {
        return 4 * sideA;
    }
}




