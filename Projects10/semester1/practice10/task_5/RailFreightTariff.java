package semester1.practice10.task_5;

public class RailFreightTariff extends ShippingTariff {
    @Override
    public double calculateCost(double weightKg, double distanceKm) {
        return 1200.0 + (4.0 * distanceKm) + (0.8 * weightKg);
    }
}
