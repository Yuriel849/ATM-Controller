/**
 * Simple interface to represent the ATM user.
 * The intention is to allow different user classes to be used as necessary.
 * (ex) standard customer, VIP customer).
 * @author Myungjun Kim
 * @version 2022.05.15
 */
public interface IUser {
    int chkBalance();
    void deposit(int deposit);
    int withdraw(int amount);
}
