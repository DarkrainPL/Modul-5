import java.io.File;

public class Main {
    public static void main(String[] args) {
        File directoryPath = new File("d:\\JAVATEST");
        String[] contents = directoryPath.list();
        System.out.println("List of files and directories in the specified directory:");
        for (int i = 0; i < contents.length; i++) {
            System.out.println(contents[i]);
        }

    }
}