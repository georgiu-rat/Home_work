package semester1.practice10.task_32;

public class FrozenFoodContainer extends CargoContainer implements RefrigeratedCargo {
    private final double requiredTempC;
    public FrozenFoodContainer(String trackingNumber, double weightKg, double requiredTempC) {
        super(trackingNumber, weightKg);
        this.requiredTempC = requiredTempC;}
    @Override
    public double getRequiredTempC() {
        return requiredTempC;}
}
