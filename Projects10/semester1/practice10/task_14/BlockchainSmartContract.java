package semester1.practice10.task_14;

public interface BlockchainSmartContract extends Authenticatable, Auditable {
    boolean executeContract(double gasLimit);
}
