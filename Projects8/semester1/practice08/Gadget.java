package semester1.practice08;

public class Gadget {
        private String brand;
        private double price;
        public Gadget(String brand, double price) {
            this.brand = brand;
            this.price = price >= 0.0 ? price : 0.0;
        }
        @Override
        public String toString() {
            return String.format("Бренд: %s | Ціна: %.2f грн", brand, price);
        }
    }
class Smartphone extends Gadget {
    private int memoryGb;
    private boolean has5G;
    public Smartphone(String brand, double price, int memoryGb, boolean has5G) {
        super(brand, price);
        this.memoryGb = memoryGb;
        this.has5G = has5G;
    }
    public Smartphone(String brand, double price, int memoryGb) {
        this(brand, price, memoryGb, true);
    }
    public Smartphone(String brand) {
        this(brand, 9999.0, 128, false);
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" | Пам'ять: %d GB | Підтримка 5G: %s",
                memoryGb, has5G ? "Так" : "Ні");
    }
}
