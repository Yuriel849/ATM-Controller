import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMSecurity implements ISecurity {
    @Override
    public boolean checkPin(ICard card) {
        int pin = getPin();

        // Code to access the banking network to verify that the PIN is correct.
        // Omitted here for simplicity.

        return true;
    }

    @Override
    public int getPin() {
        int input = 0;

        System.out.println("Please enter your PIN and press \'Enter\'.");
        try {
            Scanner in = new Scanner(System.in);
            input = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid PIN.");
        }

        return input;
    }
}
