import java.io.FileNotFoundException;

public interface IController {
    String execute(String request);

    String getInput(String query) throws FileNotFoundException;
}
