package semester1.practice08;

public class WarehouseItem {
    protected String name;
    protected int quantity;
    protected double[] priceHistory;
    public WarehouseItem(String name, int quantity, double[] priceHistory) {
        this.name = name;
        this.quantity = Math.max(0, quantity);
        this.priceHistory = priceHistory != null ? priceHistory : new double[0];}
    public double getAveragePurchasePrice() {
        if (priceHistory.length == 0) return 0.0;
        double sum = 0.0;
        for (double price : priceHistory) {
            sum += price;
        }
        return sum / priceHistory.length;
    }
    @Override
    public String toString() {
        return String.format("товар|назва='%s', кількість=%d, середня ціна=%.2f|",
                name, quantity, getAveragePurchasePrice());
    }
}
class DiscountedWarehouseItem extends WarehouseItem {
    private String markdownReason;
    private double discountPercent;
    public DiscountedWarehouseItem(String name, int quantity, double[] priceHistory, String markdownReason, double discountPercent) {
        super(name, quantity, priceHistory);
        this.markdownReason = markdownReason;
        this.discountPercent = Math.max(0.0, Math.min(100.0, discountPercent));}
    public double getDiscountedPrice() {
        double avgPrice = getAveragePurchasePrice();
        return avgPrice * (1.0 - discountPercent / 100.0);}
    @Override
    public String toString() {
        return String.format("знижееі товари|%s, причина='%s', знижка=%.1f%%, кінцева ціна=%.2f|",
                super.toString(), markdownReason, discountPercent, getDiscountedPrice());
    }
}


