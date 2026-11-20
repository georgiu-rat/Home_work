package semester1.practice08;

public class Parcel {
    private String trackingCode;
    private double weightKg;
    public double calculateShippingCost(){
        return 50.0 + weightKg * 12.0;
    }
    Parcel(String trackingCode,double weightKg){
        this.trackingCode=trackingCode;
        this.weightKg=weightKg >= 0.0 ? weightKg : 0.1;
    }
    @Override
    public String toString() {
        return String.format("Посилка [%s] | Вага: %.2f кг | Доставка: %.2f грн",
                trackingCode, weightKg, calculateShippingCost());
    }
}
class FragileParcel extends Parcel{
    private boolean requiresWoodenBox;
    private double insuranceValue;
    FragileParcel(boolean requiresWoodenBox,double insuranceValue, String trackingCode,double weightKg){
        super(trackingCode,weightKg);
        this.insuranceValue=insuranceValue >= 0.0 ? insuranceValue : 0.0;
        this.requiresWoodenBox=requiresWoodenBox;}

        @Override
        public double calculateShippingCost() {
            double cost = super.calculateShippingCost();
            cost += insuranceValue * 0.015;
            if (requiresWoodenBox) {
                cost += 120.0;}
            return cost;}
        @Override
        public String toString() {
            double insuranceFee = insuranceValue * 0.015;
            return super.toString() + String.format(" [КРИХКЕ | Страховка: %.2f грн (1.5%%) | Обрешітка: %s | Разом до сплати: %.2f грн]", insuranceFee, requiresWoodenBox ? "Так (+120 грн)" : "Ні", calculateShippingCost());
        }

}
