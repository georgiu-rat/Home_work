package semester1.practice08;

public class Appliance {
    private String model;
    private double powerWatts;
    public double getDailyConsumptionKWh(int hours){
        return (powerWatts * hours) / 1000.0;
    }
    public String getModel() {
        return model;
    }
    Appliance(String model,double powerWatts){
        this.model=model;
        this.powerWatts=powerWatts  >= 0.0 ? powerWatts : 0.0;
    }
    @Override
    public String toString() {
        return String.format("Прилад: %s | Потужність: %.0f Вт", model, powerWatts);
    }
}
class EcoHeater extends Appliance {
    private boolean ecoModeActive;

    public EcoHeater(String model, double powerWatts, boolean ecoModeActive) {
        super(model, powerWatts);
        this.ecoModeActive = ecoModeActive;
    }

    @Override
    public double getDailyConsumptionKWh(int hours) {
        double baseConsumption = super.getDailyConsumptionKWh(hours);
        if (ecoModeActive) {
            return baseConsumption * 0.75;
        }
        return baseConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Екорежим: %s | Добове споживання (за 24г): %.2f кВт·год",
                ecoModeActive ? "УВІМКНЕНО (-25% енергії)" : "ВИМКНЕНО", getDailyConsumptionKWh(24));
    }
}