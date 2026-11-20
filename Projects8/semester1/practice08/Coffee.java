package semester1.practice08;

public class Coffee {
    private String roastType;
    private int volumeMl;
    private double basePrice;
    Coffee(String roastType,int volumeMl,double basePrice){
        this.basePrice=basePrice >= 0.0 ? basePrice : 0.0;
        this.roastType=roastType;
        this.volumeMl=volumeMl >= 0 ? volumeMl : 150;
    }
    public double getBasePrice() {
        return basePrice;}
    public double calculatePrice() {
        return basePrice;}
    public int calculateCalories() {
        return 5;}
    @Override
    public String toString() {
        return String.format("Кава (%s обсмаження) | Об'єм: %d мл | Ціна: %.2f грн",
                roastType, volumeMl, calculatePrice());}
}
class LatteWithAddons extends Coffee {
    private String milkType;
    private int syrupPumps;

    LatteWithAddons(String roastType, int volumeMl, double basePrice, String milkType, int syrupPumps) {
        super(roastType, volumeMl, basePrice);
        this.milkType = milkType;
        this.syrupPumps = syrupPumps >= 0 ? syrupPumps : 0;}
        @Override
        public double calculatePrice () {
            double finalPrice = super.calculatePrice();
            if (milkType.equalsIgnoreCase("кокосове") ||
                    milkType.equalsIgnoreCase("вівсяне") ||
                    milkType.equalsIgnoreCase("рослинне")) {
                finalPrice += 20.0;
            }
            finalPrice += syrupPumps * 12.0;
            return finalPrice;
        }
        @Override
        public int calculateCalories () {
            int baseCalories = super.calculateCalories() + 120;
            return baseCalories + (syrupPumps * 35);
        }
        @Override
        public String toString () {
            return String.format("--- ЧЕК КАВ'ЯРНІ ---\n%s\n" +
                            "Тип молока: %s\n" +
                            "Сироп (порцій): %d шт.\n" +
                            "Калорійність: %d ккал\n" +
                            "РАЗОМ ДО СПЛАТИ: %.2f грн\n" +
                            "--------------------",
                    super.toString(), milkType, syrupPumps, calculateCalories(), calculatePrice());
        }

}