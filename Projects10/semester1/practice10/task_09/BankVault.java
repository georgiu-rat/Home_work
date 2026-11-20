package semester1.practice10.task_9;

public class BankVault implements Measurable {
    private final String vaultId;
    private final double goldKg;
    public BankVault(String vaultId, double goldKg) {
        this.vaultId = vaultId;
        this.goldKg = goldKg;}
    @Override
    public double getMeasure() {
        return goldKg;}
    public String getVaultId() {
        return vaultId;}
}
