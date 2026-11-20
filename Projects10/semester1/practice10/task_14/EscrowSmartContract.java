package semester1.practice10.task_14;

public class EscrowSmartContract implements BlockchainSmartContract {
    private final String contractId;
    private final String creatorKey;
    private boolean executed;
    public EscrowSmartContract(String contractId, String creatorKey) {
        this.contractId = contractId;
        this.creatorKey = creatorKey;
        this.executed = false;}
    @Override
    public boolean verifySignature(String key) {
        return this.creatorKey.equals(key);}
    @Override
    public String getAuditTrail() {
        return String.format("Контракт депонування [%s]: статус виконання = %b", contractId, executed);}
    @Override
    public boolean executeContract(double gasLimit) {
        if (gasLimit >= 21000.0 && !executed) {
            executed = true;
            return true;}
        return false;}
}
