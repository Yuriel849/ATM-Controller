public interface ISecurity {
    boolean checkPin(ICard card);

    int getPin();

    IUser getCustomer(ICard card);
}
