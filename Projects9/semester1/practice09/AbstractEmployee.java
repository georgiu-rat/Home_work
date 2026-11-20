package semester1.practice09;

public abstract class AbstractEmployee {
    private final String fullName;
    private final String position;
    public AbstractEmployee(String fullName, String position) {
        this.fullName = (fullName == null || fullName.isBlank()) ? "Співробітник" : fullName;
        this.position = (position == null || position.isBlank()) ? "Спеціаліст" : position;}
    public String getFullName() {
        return fullName;}
    public String getPosition() {
        return position;}
    public abstract double calculateMonthlyPay();
    @Override
    public String toString() {
        return String.format("%s (%s) — Зарплата: %.2f грн",
                fullName, position, calculateMonthlyPay());}
}
