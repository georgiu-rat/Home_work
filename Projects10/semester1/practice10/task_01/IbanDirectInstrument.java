package semester1.practice10.task_1;

public class IbanDirectInstrument extends PaymentInstrument {
    public IbanDirectInstrument(String payerName) {
        super(payerName);}
    @Override
    public double calculateFee(double amount) {
        if (amount <= 50000.0) {
            return 0.0;
        } else {
            return amount * 0.005;}
    }
}
