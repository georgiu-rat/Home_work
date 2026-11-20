package semester1.practice10.task_1;

public class BankCardInstrument extends PaymentInstrument {
    public BankCardInstrument(String payerName) {
        super(payerName);}
    @Override
    public double calculateFee(double amount) {
        return (amount * 0.015) + 5.0;}
}
