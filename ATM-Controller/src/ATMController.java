import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ATMController implements IController {
    // If active = true, the ATM is managing user requests and cannot accept a new card.
    // If active = false, the ATM is idle and only responds to a card insertion.
    private boolean active = false;
    private ICard card = null;
    private IUser cust = null;
    private ISecurity security = new ATMSecurity();
    private String reply = null;
    private CashBin bin = new CashBin();

    @Override
    public String execute(String request) {
        // If not active, only responds to a card insertion
        if(!active) {
            if(request.equals("insert card")) {
                card = new Card(1234567890, 123,
                        05, 22,
                        "John Smith", "debit");

                if(security.checkPin(card)) {
                    active = true;
                    cust = security.getCustomer(card);
                    reply = "PIN verified";
                } else {
                    reply = "Incorrect PIN";
                }
            }
        } else if (request.equals("check balance")) {
            reply = Integer.toString(cust.chkBalance());
        } else if (request.equals("withdraw")) {
            int amt = Integer.parseInt(getInput("Amount to withdraw"));
            System.out.println(amt);
            System.out.println(bin.getCashBin());
            if(amt > bin.getCashBin()) {
                reply = "Cash bin insufficient";
            } else {
                amt = cust.withdraw(amt);
                if (amt == -100) {
                    reply = "Balance insufficient";
                } else {
                    reply = Integer.toString(amt);
                }
            }
        } else if (request.equals("deposit")) {
            int amt = Integer.parseInt(getInput("Amount to deposit"));
            cust.deposit(amt);
            reply = "Deposited";
        } else if (request.equals("quit")) {
            active = false;
            reply = "Terminating";
        }

        return reply;
    }

    @Override
    public String getInput(String query) {
        Scanner in = null;
        System.out.println(query);
        try {
            // To get user input in the terminal
//            in = new Scanner(System.in)
            // For testing with ATMControllerTest
            in = new Scanner(new File("query.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return in.next();
    }
}

