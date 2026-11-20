package semester1.practice10.task_36;

public final class FiscalReceipt implements PrintableDocument {
    private final String fiscalNumber;
    private final double totalAmount;
    private final double vatAmount;
    public FiscalReceipt(String fiscalNumber, double totalAmount) {
        this.fiscalNumber = fiscalNumber;
        this.totalAmount = totalAmount;
        this.vatAmount = totalAmount * 0.2 / 1.2;}
    public String getFiscalNumber() {
        return fiscalNumber;}
    public double getTotalAmount() {
        return totalAmount;}
    public double getVatAmount() {
        return vatAmount;}
    @Override
    public String formatForPrinter() {
        return String.format("[ФІСКАЛЬНИЙ ЧЕК #%s]\n   Загальна сума: %.2f грн\n   ПДВ (20%%): %.2f грн",
                fiscalNumber, totalAmount, vatAmount);}
}
