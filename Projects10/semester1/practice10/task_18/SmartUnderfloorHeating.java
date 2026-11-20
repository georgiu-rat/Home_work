package semester1.practice10.task_18;

public class SmartUnderfloorHeating extends AbstractSmartAppliance implements HeatingCapable {
    private double targetTemperature;
    private final double powerWattsPerDegree;
    public SmartUnderfloorHeating(String room, String model, double powerWattsPerDegree) {
        super(room, model);
        this.powerWattsPerDegree = powerWattsPerDegree;
        this.targetTemperature = 22.0;}
        @Override
    public void setTargetTemperature(double celsius) {
        this.targetTemperature = celsius;}
    @Override
    public double getCurrentWatts() {
        if (!poweredOn) return 0.0;
        return targetTemperature * powerWattsPerDegree;}
}
