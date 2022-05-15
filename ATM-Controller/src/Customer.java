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
        } else {
            retVal = -100;
        }

        return retVal;
    }
}
