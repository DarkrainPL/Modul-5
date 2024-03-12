import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class TestToTask6 {

    @Test
    void isSuccessReallySuccess() {

        FileOperationTasks task6 = new FileOperationTasks();
        Assertions.assertTrue(task6.areTextFilesEqual("files/task6file.txt", "test/testToTask6file.txt"));
    }

    @Test
    void fileDoNotExist() {

        FileOperationTasks task6 = new FileOperationTasks();
        Assertions.assertFalse(task6.readFromFile("files/task66file.txt"));
    }

    @Test
    void filesDoNotMatch() {
        FileOperationTasks task6 = new FileOperationTasks();
        Assertions.assertFalse(task6.areTextFilesEqual("files/ala.txt", "test/testToTask6file.txt"));
    }
}
