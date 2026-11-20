package semester1.practice10.task_10;

public class BatteryCell implements EnergyConvertible {
    private final String model;
    private final double capacityKwh;
    public BatteryCell(String model, double capacityKwh) {
        this.model = model;
        this.capacityKwh = capacityKwh;}
    @Override
    public double getEnergyJoules() {
        return capacityKwh * JOULES_PER_KWH;}
    public String getModel() {
        return model;}
}
