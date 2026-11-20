package semester1.practice08;

public class InvoiceItem {
    private String description;
    private int quantity;
    private double unitPrice;
    private double discountPercent;
    public InvoiceItem(String description,int quantity,double unitPrice,double discountPercent){
        this.description=description;
        setQuantity(quantity);
        setUnitPrice(unitPrice);
        setDiscountPercent(discountPercent);
    }
    public double getFinalAmount(){
        double fullAmount = quantity * unitPrice;
        double discountAmount = fullAmount * (discountPercent / 100.0);
        return fullAmount - discountAmount;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity >= 1 ? quantity : 1; // мінімум 1 шт.
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice >= 0.0 ? unitPrice : 0.0;
    }
    public double getDiscountPercent() {
        return discountPercent;
    }
    public void setDiscountPercent(double discountPercent) {
        if (discountPercent >= 0.0 && discountPercent <= 50.0) {
            this.discountPercent = discountPercent;
        } else {
            this.discountPercent = 0.0;
        }
    }
    @Override
    public String toString() {
        return String.format("%s (К-ть: %d, Ціна: %.2f грн, Знижка: %.1f%%) | Разом: %.2f грн",
                description, quantity, unitPrice, discountPercent, getFinalAmount());
    }


}
