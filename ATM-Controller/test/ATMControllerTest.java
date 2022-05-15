import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ATMControllerTest {
    @Test
    void execute() throws FileNotFoundException {
        String response = null;
        IController controller = new ATMController();
        Scanner scan = new Scanner(new File("testInput.txt"));
        while(scan.hasNext()) {
            response = controller.execute(scan.nextLine());
            assertTrue(response.equals(scan.nextLine()));
        }
    }
}