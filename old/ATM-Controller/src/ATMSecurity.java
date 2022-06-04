import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The class responsible for verifying the PIN and interacting with the banking system.
 * The banking system was omitted for simplicity.
 * @author Myungjun Kim
 * @version 2022.05.15
 */
public class ATMSecurity implements ISecurity {
    /**
     * Method used to check that the user entered the correct PIN.
     * The code to access the banking system to verify the PIN was omitted for simplicity.
     * Here the method returns true by default, regardless of what PIN is entered.
     */
    @Override
    public boolean checkPin(ICard card) {
        int pin = getPin();
        return true;
    }

    /**
     * Method to ask the user to enter a PIN and check that the user entered a number.
     */
    @Override
    public int getPin() {
        int input = 0;

        System.out.println("Enter PIN");
        try {
            // To get user input in the terminal
//            Scanner in = new Scanner(System.in);
            // For testing with ATMControllerTest
            Scanner in = new Scanner(new File("testPin.txt"));
            input = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid PIN");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        return input;
    }

    /**
     * Method to create a customer object, once the PIN has been verified.
     * The balance is 10,000 by default.
     */
    @Override
    public IUser getCustomer(ICard card) {
        return new Customer(10000);
    }
}
