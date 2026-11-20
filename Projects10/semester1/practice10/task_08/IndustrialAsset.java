package semester1.practice10.task_8;

public abstract class IndustrialAsset {
    private final String name;
    protected final double initialCost;
    protected final int usefulLifeYears;
    public IndustrialAsset(String name, double initialCost, int usefulLifeYears) {
        this.name = name;
        this.initialCost = initialCost;
        this.usefulLifeYears = usefulLifeYears;}
    public String getName() {
        return name;}
    public double getInitialCost() {
        return initialCost;}
    public abstract double getBookValueAfterYears(int years);
}
