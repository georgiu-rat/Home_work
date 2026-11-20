package semester1.practice10.task_17;

public class CargoPlane implements FlyableUnit {
    private final String model;
    private final double flightSpeedKmh;
    public CargoPlane(String model, double flightSpeedKmh) {
        this.model = model;
        this.flightSpeedKmh = flightSpeedKmh;}
    public String getModel() {
        return model;}
    @Override
    public double getFlightSpeedKmh() {
        return flightSpeedKmh;}
}
