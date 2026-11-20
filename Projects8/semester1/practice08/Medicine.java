package semester1.practice08;

public class Medicine {
    private String name;
    private double price;
    private boolean isExpired;
    public Medicine(String name, double price, boolean isExpired) {
        this.name = name;
        this.price = Math.max(0.0, price);
        this.isExpired = isExpired;}
    public boolean isExpired() {
        return isExpired;}
    public String getName() {
        return name;}
    @Override
    public String toString() {
        return String.format("ліки|імя='%s', ціна=%.2f, термін дії=%s|", name, price, isExpired);}
}
class PrescriptionMedicine extends Medicine {
    private String doctorLicense;
    public PrescriptionMedicine(String name, double price, boolean isExpired, String doctorLicense) {
        super(name, price, isExpired);
        this.doctorLicense = doctorLicense;}
    public boolean canSell(boolean hasPrescription) {
        return !isExpired() && hasPrescription && doctorLicense != null && !doctorLicense.isBlank();}
    @Override
    public String toString() {
        return String.format("ліки за рецептом|%s, license='%s'|", super.toString(), doctorLicense);}
}
class ControlledSubstance extends PrescriptionMedicine {
    private int patientAge;
    public ControlledSubstance(String name, double price, boolean isExpired, String doctorLicense, int patientAge) {
        super(name, price, isExpired, doctorLicense);
        this.patientAge = Math.max(0, patientAge);}
    @Override
    public boolean canSell(boolean hasPrescription) {
        boolean baseCanSell = super.canSell(hasPrescription);
        return baseCanSell && patientAge >= 18;}
    @Override
    public String toString() {
        return String.format("контрольва речовина|%s, пацієнт=%d, можна продати зараз=%s|",
                super.toString(), patientAge, canSell(true));

    }

}
