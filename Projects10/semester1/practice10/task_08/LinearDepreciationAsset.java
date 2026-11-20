package semester1.practice10.task_8;

public class LinearDepreciationAsset extends IndustrialAsset {
    public LinearDepreciationAsset(String name, double initialCost, int usefulLifeYears) {
        super(name, initialCost, usefulLifeYears);}
    @Override
    public double getBookValueAfterYears(int years) {
        if (years >= usefulLifeYears) return 0.0;
        double value = initialCost * (1.0 - ((double) years / usefulLifeYears));
        return Math.max(0.0, value);}
}
