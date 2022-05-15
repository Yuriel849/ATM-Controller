import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMSecurity implements ISecurity {
    @Override
    public boolean checkPin(ICard card) {
//        int pin = getPin();

        // Code to access the banking network to verify that the PIN is correct.
        // Omitted here for simplicity.

        return true;
    }

    @Override
    public int getPin() {
        int input = 0;

        System.out.println("Enter PIN");
        try {
//            Scanner in = new Scanner(System.in);
            Scanner in = new Scanner(new File("testPin.txt"));
            input = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid PIN");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        return input;
    }

    @Override
    public IUser getCustomer(ICard card) {
        return new Customer(10000);
    }
}
