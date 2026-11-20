package semester1.practice10.task_17;

public class EmperorPenguin extends AbstractBird implements SwimmingUnit {
    private final double diveDepthMeters;
    public EmperorPenguin(String species, double weightKg, double diveDepthMeters) {
        super(species, weightKg);
        this.diveDepthMeters = diveDepthMeters;}
    @Override
    public String makeSound() {
        return "Трубний крик пінгвіна";}
    @Override
    public double getDiveDepthMeters() {
        return diveDepthMeters;}
}
