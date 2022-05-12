// When a card is inserted, the controller saves the card data in ICard
// ISecurity gets ICard from the controller, asks the user to enter the PIN,
//      and verifies if the PIN is correct and matches the card data
// Controller asks the user to choose which operation (ex) access user's account)
// User can choose to check balance, deposit, or withdraw

public class ATMController implements IController {
    // If active = true, the ATM is managing user requests and cannot accept a new card.
    // If active = false, the ATM is idle and only responds to a card insertion.
    private boolean active = false;
    private ICard card = null;
    private ISecurity security = new ATMSecurity();

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
                }
            }
        }
        return null;
    }
}
