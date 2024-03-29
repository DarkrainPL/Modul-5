import java.io.*;
import java.util.Scanner;

public class FileOperationTasks {

    // Task 1
    public void printDirectory(String directoryPath) {
        File dirPath = new File(directoryPath);
        String[] contents = dirPath.list();
        System.out.println(" TASK 1 - z przekazywaniem ścieżki do pliku");
        System.out.println("List of files and directories in the specified directory:");

        for (int i = 0; i < contents.length; i++) {
            System.out.println(contents[i]);
        }
        System.out.println("");
    }

    // Task 2
    public boolean writeUserInputToFile() {
        String path = "files";
        Scanner sc = new Scanner(System.in);
        System.out.println(" TASK 2");
        System.out.println("Tell me the filename:");
        String filename = sc.nextLine();

        File file = new File(path, filename);
        if (file.exists()) {
            System.out.println("File already exists!");
            return false;
        } else {
            System.out.println("Tell me the text you want to save in file:");
            String textToSave = sc.nextLine();
            String[] stringToArray = textToSave.split("\\s+");

            try (FileWriter writer = new FileWriter(file);
                 BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

                file.createNewFile();

                for (int i = 0; i < stringToArray.length; i++) {

                    if ((i + 1) % 4 != 0) {
                        bufferedWriter.write(stringToArray[i] + " ");
                    } else {
                        bufferedWriter.write(stringToArray[i]);
                        bufferedWriter.newLine();
                    }
                }
                bufferedWriter.flush();
                return true;


            } catch (IOException ioException) {
                ioException.printStackTrace();
                return false;
            }
        }
    }

    public boolean readFromFile(String fileName) {

        String text;
        File file = new File(fileName);
        if (file.exists()) {
            StringBuilder builder = new StringBuilder();
            try (FileReader reader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(reader)) {
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
        } else {
            System.out.println("File doesn't exist!");
            return false;
        }
        return false;
    }

    public boolean areTextFilesEqual(String filePath1, String filePath2) {

        String text1;
        String text2;
        boolean answer = true;
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);
        if (file1.exists() && file2.exists()) {

            try (FileReader reader1 = new FileReader(file1);
                 BufferedReader bufferedReader1 = new BufferedReader(reader1);
                 FileReader reader2 = new FileReader(file2);
                 BufferedReader bufferedReader2 = new BufferedReader(reader2)) {

                text1 = bufferedReader1.readLine();
                text2 = bufferedReader2.readLine();


                while (text1 != null && text2 != null) {
                    if (text1.equals(text2)) {
                        answer = true;
                        text1 = bufferedReader1.readLine();
                        text2 = bufferedReader2.readLine();
                    } else {
                        return false;
                    }
                }

            } catch (IOException ioException) {
                ioException.printStackTrace();

            }
        } else {
            System.out.println("File doesn't exist!");
        }
        return answer;
    }

    public boolean invertFile(String directory, String fileName) {

        String text;
        File file = new File(directory, fileName);
        StringBuilder builder = new StringBuilder();

        if (file.exists()) {


            try (FileReader reader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(reader)) {

                text = bufferedReader.readLine();
                while (text != null) {
                    builder.append(text + " ");
                    text = bufferedReader.readLine();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
                return false;
            }
        } else {
            System.out.println("File doesn't exist!");
            return false;
        }

        String[] stringToArray = builder.toString().split("\\s+");
        String newFilePath = directory+"Inverted."+fileName;
        File newFileName = new File(newFilePath);

        try (FileWriter writer = new FileWriter(newFileName);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            newFileName.createNewFile();

            for (int i = 0; i < stringToArray.length; i++) {

                bufferedWriter.write(stringToArray[stringToArray.length - i - 1] + " ");
            }
            bufferedWriter.flush();
            return true;
        } catch (IOException ioException) {
            ioException.printStackTrace();
            return false;
        }
    }

}
