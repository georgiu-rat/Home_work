package semester1.practice09;

public class CardTransferTransaction extends AbstractTransaction {
    private final String cardNumber;
    public CardTransferTransaction(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = (cardNumber == null || cardNumber.isBlank()) ? "**** **** **** ****" : cardNumber;}
    @Override
    public boolean execute() {
        if (executed) return false;
        double commission = amount * 0.01;
        double totalToDebit = amount + commission;
        System.out.printf("Переказ на картку [%s]: знято суму %.2f грн (включно з комісією %.2f грн).\n",
                cardNumber, totalToDebit, commission);
        executed = true;
        return true;}
    @Override
    public String toString() {
        return String.format("CardTransfer{карта='%s', %s}", cardNumber, super.toString());}
}
