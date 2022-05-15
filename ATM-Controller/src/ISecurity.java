/**
 * Simple interface to represent the ATM security module.
 * @author Myungjun Kim
 * @version 2022.05.15
 */
public interface ISecurity {
    boolean checkPin(ICard card);
    int getPin();
    IUser getCustomer(ICard card);
}
