package semester1.practice08;

public class Ticket {
    private String eventName;
    private double basePrice;
    public Ticket(String eventName, double basePrice) {
        this.eventName = eventName;
        this.basePrice = basePrice >= 0.0 ? basePrice : 0.0;
    }
    public double getFinalPrice() {
        return basePrice;
    }
    @Override
    public String toString() {
        return String.format("Подія: \"%s\" | Кінцева ціна: %.2f грн", eventName, getFinalPrice());
    }
}
class StudentTicket extends Ticket {
    private String studentCardNumber;
    public StudentTicket(String eventName, double basePrice, String studentCardNumber) {
        super(eventName, basePrice);
        this.studentCardNumber = studentCardNumber;}
    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() * 0.5;}
    @Override
    public String toString() {
        return super.toString() + String.format(" [Студентський квиток №%s, знижка 50%%]", studentCardNumber);}
}
class VipTicket extends Ticket {
    private boolean includesBackstage;
    private double loungeFee;
    public VipTicket(String eventName, double basePrice, boolean includesBackstage, double loungeFee) {
        super(eventName, basePrice);
        this.includesBackstage = includesBackstage;
        this.loungeFee = loungeFee >= 0.0 ? loungeFee : 0.0;
    }
    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + loungeFee;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" [VIP | Бекстейдж: %s | Доплата за лаунж: %.2f грн]",
                includesBackstage ? "Так" : "Ні", loungeFee);
    }
}