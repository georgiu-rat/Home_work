package semester1.practice10.task_5;

public class AirCargoTariff extends ShippingTariff {
    @Override
    public double calculateCost(double weightKg, double distanceKm) {
        return (45.0 * distanceKm) + (18.0 * weightKg) + 500.0;
    }
}