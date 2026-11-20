package semester1.practice10.task_18;

public class SmartLedChandelier extends AbstractSmartAppliance implements Dimmable {
    private int brightnessPercent;
    private final double maxPowerWatts;
    public SmartLedChandelier(String room, String model, double maxPowerWatts) {
        super(room, model);
        this.maxPowerWatts = maxPowerWatts;
        this.brightnessPercent = 100;}
    @Override
    public void setBrightness(int percent) {
        this.brightnessPercent = Math.max(0, Math.min(100, percent));}
    @Override
    public double getCurrentWatts() {
        if (!poweredOn) return 0.0;
        return maxPowerWatts * (brightnessPercent / 100.0);}
}
