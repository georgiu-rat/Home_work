package semester1.practice10.task_30;

public class VipCustomer extends AbstractCustomer {
    public VipCustomer(String fullName) {
        super(fullName);}
    @Override
    public double getDiscountPercent() {
        return 20.0;}
}
