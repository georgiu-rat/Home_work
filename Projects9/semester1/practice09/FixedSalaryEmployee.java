package semester1.practice09;

public class FixedSalaryEmployee extends AbstractEmployee {
    private final double monthlySalary;
    public FixedSalaryEmployee(String fullName, String position, double monthlySalary) {
        super(fullName, position);
        this.monthlySalary = Math.max(0.0, monthlySalary);}
    @Override
    public double calculateMonthlyPay() {
        return monthlySalary;}
}
