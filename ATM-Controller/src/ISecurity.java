public interface ISecurity {
    boolean checkPin(ICard card);

    int getPin();
}
