package semester1.practice10.task_19;

public class BlueChipStock extends AbstractFinancialInstrument implements Tradable, DividendPaying {
    private double currentPriceUah;
    private final double annualDividendPerShareUah;
    public BlueChipStock(String ticker, int quantity, double currentPriceUah, double annualDividendPerShareUah) {
        super(ticker, quantity);
        this.currentPriceUah = currentPriceUah;
        this.annualDividendPerShareUah = annualDividendPerShareUah;}
    @Override
    public double getMarketValueUah() {
        return quantity * currentPriceUah;}
    @Override
    public boolean buy(int qty) {
        if (qty > 0) {
            this.quantity += qty;
            return true;}
        return false;}
    @Override
    public boolean sell(int qty) {
        if (qty > 0 && this.quantity >= qty) {
            this.quantity -= qty;
            return true;}
        return false;}
    @Override
    public double calculateAnnualDividend() {
        return quantity * annualDividendPerShareUah;}
}
