package semester1.practice10.task_5;

public class RoadTruckTariff extends ShippingTariff {
    @Override
    public double calculateCost(double weightKg, double distanceKm) {
        return (15.0 * distanceKm) + (2.5 * weightKg);
    }
}
