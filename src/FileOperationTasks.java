import java.io.*;
import java.util.Scanner;

public class FileOperationTasks {

    // Task 1
    public void printDirectory() {
        File directoryPath = new File("files");
        String[] contents = directoryPath.list();
        System.out.println("List of files and directories in the specified directory:");
        for (int i = 0; i < contents.length; i++) {
            System.out.println(contents[i]);
        }
    }

    // Task 2
    public boolean writeUserInputToFile() {
        String path = "files";
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me the filename:");
        String filename = sc.nextLine();
        System.out.println("Tell me the text you want to save in file:");
        String textToSave = sc.nextLine();


        File file = new File(path, filename);
        file.deleteOnExit();
        try (FileWriter writer = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            file.createNewFile();
            bufferedWriter.write(textToSave);
            bufferedWriter.flush();
            return true;
        } catch (IOException ioException) {
            ioException.printStackTrace();
            return false;
        }
    }

    public void readFromFile(String fileName) {

        String text;
        File file = new File(fileName);
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(reader))
        {
            text = bufferedReader.readLine();
            while (text != null) {
                builder.append(text + " ");
                text = bufferedReader.readLine();
            }
            System.out.println("In file " + fileName + " there is this text:");
            System.out.println(builder);
        } catch (IOException ioException) {
            ioException.printStackTrace();

        }

    }

}