package semester1.practice10.task_8;

public class DecliningBalanceAsset extends IndustrialAsset {
    private final double annualRate;
    public DecliningBalanceAsset(String name, double initialCost, int usefulLifeYears, double annualRate) {
        super(name, initialCost, usefulLifeYears);
        this.annualRate = annualRate;}
    @Override
    public double getBookValueAfterYears(int years) {
        int effectiveYears = Math.min(years, usefulLifeYears);
        double value = initialCost * Math.pow(1.0 - annualRate, effectiveYears);
        return Math.max(0.0, value);}
}
