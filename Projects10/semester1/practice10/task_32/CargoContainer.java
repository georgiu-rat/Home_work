package semester1.practice10.task_32;

public abstract class CargoContainer {
    private final String trackingNumber;
    private final double weightKg;
    public CargoContainer(String trackingNumber, double weightKg) {
        this.trackingNumber = trackingNumber;
        this.weightKg = weightKg;}
    public String getTrackingNumber() {
        return trackingNumber;}
    public double getWeightKg() {
        return weightKg;}
}
