package semester1.practice08;

public class StandardTransfer {
    protected double amount;

    public StandardTransfer(double amount) {
        this.amount = amount >= 0.0 ? amount : 0.0;
    }

    public double getFee() {
        return amount * 0.01;
    }

    public double getTotalWithFee() {
        return amount + getFee();
    }

    @Override
    public String toString() {
        return String.format("Звичайний переказ | Сума: %.2f | Комісія (1%%): %.2f | Разом: %.2f",
                amount, getFee(), getTotalWithFee());
    }
}
class InternationalTransfer extends StandardTransfer {
    private String countryCode;
    private static final double SWIFT_FEE = 15.0;
    public InternationalTransfer(double amount, String countryCode) {
        super(amount);
        this.countryCode = countryCode;
    }
    @Override
    public double getFee() {
        return super.getFee() * 2 + SWIFT_FEE;
    }
    @Override
    public String toString() {
        return String.format("Міжнародний переказ (%s) | Сума: %.2f | Комісія (2%% + SWIFT): %.2f | Разом: %.2f",
                countryCode, amount, getFee(), getTotalWithFee());
    }
}
