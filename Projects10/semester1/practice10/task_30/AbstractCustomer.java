package semester1.practice10.task_30;

public abstract class AbstractCustomer {
    private final String fullName;
    public AbstractCustomer(String fullName) {
        this.fullName = fullName;}
    public String getFullName() {
        return fullName;}
    public abstract double getDiscountPercent();
}
