package semester1.practice10.task_30;

public class StudentCustomer extends AbstractCustomer {
    public StudentCustomer(String fullName) {
        super(fullName);}
    @Override
    public double getDiscountPercent() {
        return 10.0;}
}
