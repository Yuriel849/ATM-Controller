public class CashBin {
    private int cashBin;

    public CashBin() {
        this(100000);
    }

    public CashBin(int cashBin) {
        this.cashBin = cashBin;
    }

    public int getCashBin() {
        return cashBin;
    }

    public void setCashBin(int cashBin) {
        this.cashBin = cashBin;
    }
}
