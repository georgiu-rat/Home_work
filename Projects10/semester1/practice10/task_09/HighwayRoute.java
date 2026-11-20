package semester1.practice10.task_9;

public class HighwayRoute implements Measurable {
    private final String routeName;
    private final double lengthKm;
    public HighwayRoute(String routeName, double lengthKm) {
        this.routeName = routeName;
        this.lengthKm = lengthKm;}
    @Override
    public double getMeasure() {
        return lengthKm;}
    public String getRouteName() {
        return routeName;}
}
