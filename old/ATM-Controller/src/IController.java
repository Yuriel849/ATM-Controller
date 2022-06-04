import java.io.FileNotFoundException;

/**
 * Simple interface to represent the ATM controller.
 * @author Myungjun Kim
 * @version 2022.05.15
 */
public interface IController {
    String execute(String request);
    String getInput(String query) throws FileNotFoundException;
}
