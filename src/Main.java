
public class Main {
    public static void main(String[] args) {

        // Task1
        //FileOperationTasks task1 = new FileOperationTasks();
        //task1.printDirectory();

        // Task2
        //FileOperationTasks task2 = new FileOperationTasks();
        //if (task2.writeUserInputToFile()) {
        //    System.out.println("The operation of adding text to file was successful!");
        //} else {
        //    System.out.println("The operation of adding text to file was unsuccessful!");
        //}
        //task2.readFromFile("files/ala.txt");

        // Task3
        GeometricFigure rectangle = new Rectangle(3,4);
        System.out.println(rectangle.calculateArea());

        GeometricFigure triangle = new Triangle(5,4);
        System.out.println(triangle.calculateArea());

        GeometricFigure hexagon = new Hexagon(6);
        System.out.println(hexagon.calculateArea());

        // Task4

        Square square = new Square(5,5);
        System.out.println(square.calculateDiameter(5));
    }
}