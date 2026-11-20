package semester1.practice10.task_32;

public class ChemicalContainer extends CargoContainer implements HazardousCargo {
    private final int hazardClass;
    public ChemicalContainer(String trackingNumber, double weightKg, int hazardClass) {
        super(trackingNumber, weightKg);
        this.hazardClass = hazardClass;}
    @Override
    public int getHazardClass() {
        return hazardClass;}
}
