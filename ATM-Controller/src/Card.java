/**
 * The class representing the card inserted by the ATM user.
 * @author Myungjun Kim
 * @version 2022.05.15
 */
public class Card implements ICard {
    private int cardNumber;
    private int CVC;
    private int expiryMonth;
    private int expiryYear;
    private String name; // Name on card
    private String type; // Credit card, debit card

    public Card(int cardNumber, int CVC, int expiryMonth, int expiryYear, String name, String type) {
        this.cardNumber = cardNumber;
        this.CVC = CVC;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.name = name;
        this.type = type;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCVC() {
        return CVC;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }

    public int getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(int expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
