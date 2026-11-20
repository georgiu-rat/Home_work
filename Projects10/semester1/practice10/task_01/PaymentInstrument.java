package semester1.practice10.task_1;

public abstract class PaymentInstrument {
    private final String payerName;
    public PaymentInstrument(String payerName) {
        this.payerName = payerName;}
    public String getPayerName() {
        return payerName;}
    public abstract double calculateFee(double amount);
    public double processPayment(double amount) {
        double fee = calculateFee(amount);
        return amount + fee;}
}
