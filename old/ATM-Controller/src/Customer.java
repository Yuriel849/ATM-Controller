/**
 * The class representing the ATM user.
 * @author Myungjun Kim
 * @version 2022.05.15
 */
public class Customer implements IUser {
    private int balance;

    Customer(int balance) {
        this.balance = balance;
    }

    @Override
    public int chkBalance() {
        return balance;
    }

    @Override
    public void deposit(int deposit) {
        balance += deposit;
    }

    @Override
    public int withdraw(int amount) {
        int retVal = 0;
        if(amount < balance) {
            retVal = amount;
            balance -= amount;
        } else { // If amount to be withdrawn exceeds the balance
            retVal = -100;
        }
        return retVal;
    }
}
