package semester1.practice10.task_19;

public abstract class AbstractFinancialInstrument {
    private final String ticker;
    protected int quantity;
    public AbstractFinancialInstrument(String ticker, int quantity) {
        this.ticker = ticker;
        this.quantity = quantity;}
    public String getTicker() {
        return ticker;}
    public int getQuantity() {
        return quantity;}
    public abstract double getMarketValueUah();
}
