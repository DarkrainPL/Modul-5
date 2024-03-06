
public class Main {
    public static void main(String[] args) {

        // Task1
        // FileOperationTasks task1 = new FileOperationTasks();
        // task1.printDirectory();

        // Task2
        FileOperationTasks task2 = new FileOperationTasks();
        if (task2.writeUserInputToFile()) {
            System.out.println("The operation of adding text to file was successful!");
        } else {
            System.out.println("The operation of adding text to file was unsuccessful!");
        }
        task2.readFromFile("files/ala.txt");
    }
}