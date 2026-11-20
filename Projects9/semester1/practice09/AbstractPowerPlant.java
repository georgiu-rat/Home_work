package semester1.practice09;

public abstract class AbstractPowerPlant {
    private final String stationName;
    protected double baseCapacityMw;
    AbstractPowerPlant(String stationName,double baseCapacityMw){
        this.stationName = (stationName == null || stationName.isBlank()) ? "Електростанція" : stationName;
        this.baseCapacityMw = Math.max(0.0, baseCapacityMw);}
    public String getStationName() {
        return stationName;}
    public abstract double generateMegawatts();
    public final double calculateDailyProfit(double tariffPerMwh) {
        double mwGenerated = generateMegawatts();
        return mwGenerated * 24.0 * Math.max(0.0, tariffPerMwh);}
    @Override
    public String toString() {
        return String.format("Електростанція '%s' (Базова потужність: %.1f МВт, Генерація: %.1f МВт)",
                stationName, baseCapacityMw, generateMegawatts());}
}
