package semester1.practice08;

public class StaffMember {
    protected String name;
    protected double baseSalary;
    StaffMember(String name,double baseSalary){
        this.baseSalary=baseSalary >= 0.0 ? baseSalary : 0.0;;
        this.name=name;
    }
    @Override
    public String toString() {
        return String.format("Співробітник: %s | Ставка: %.2f грн | До виплати: %.2f грн",
                name, baseSalary, calculateMonthlyPay());
    }
    public double calculateMonthlyPay(){
        return baseSalary;
    }
}
class Manager extends StaffMember {
    private double teamBonus;

    public Manager(String name, double baseSalary, double teamBonus) {
        super(name, baseSalary);
        this.teamBonus = teamBonus >= 0.0 ? teamBonus : 0.0;
    }

    @Override
    public double calculateMonthlyPay() {
        return super.calculateMonthlyPay() + teamBonus;
    }

    @Override
    public String toString() {
        return String.format("Менеджер: %s | Ставка: %.2f грн (+ Бонус: %.2f грн) | До виплати: %.2f грн", name, baseSalary, teamBonus, calculateMonthlyPay());}
}
class SalesPerson extends StaffMember {
    private double salesVolume;
    private double commissionRate;

    public SalesPerson(String name, double baseSalary, double salesVolume, double commissionRate) {
        super(name, baseSalary);
        this.salesVolume = salesVolume >= 0.0 ? salesVolume : 0.0;
        this.commissionRate = commissionRate >= 0.0 ? commissionRate : 0.0;
    }
    @Override
    public double calculateMonthlyPay() {
        return super.calculateMonthlyPay() + salesVolume * (commissionRate / 100.0);
    }
    @Override
    public String toString() {
        return String.format("Продавець: %s | Ставка: %.2f грн (+ Комісія: %.1f%% від %.2f грн) | До виплати: %.2f грн",
                name, baseSalary, commissionRate, salesVolume, calculateMonthlyPay());
    }
}
