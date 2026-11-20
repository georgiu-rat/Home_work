package semester1.practice10.task_17;

public class Falcon extends AbstractBird implements FlyableUnit {
    private final double flightSpeedKmh;
    public Falcon(String species, double weightKg, double flightSpeedKmh) {
        super(species, weightKg);
        this.flightSpeedKmh = flightSpeedKmh;}
    @Override
    public String makeSound() {
        return "Стрімкий кльокіт сокола";}
    @Override
    public double getFlightSpeedKmh() {
        return flightSpeedKmh;}
}
