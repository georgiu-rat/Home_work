package semester1.practice10.task_10;

public class KineticBody implements EnergyConvertible {
    private final String name;
    private final double massKg;
    private final double velocityMps;
    public KineticBody(String name, double massKg, double velocityMps) {
        this.name = name;
        this.massKg = massKg;
        this.velocityMps = velocityMps;}
    @Override
    public double getEnergyJoules() {
        return 0.5 * massKg * velocityMps * velocityMps;}
    public String getName() {
        return name;}
}
