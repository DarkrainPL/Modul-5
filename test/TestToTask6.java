import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class TestToTask6 {

    @Test
    void isSuccessReallySuccess() {

        FileOperationTasks task6 = new FileOperationTasks();
        Assertions.assertTrue(task6.areTextFilesEqual("files/task6file.txt", "test/testToTask6file.txt"));

    }
}
