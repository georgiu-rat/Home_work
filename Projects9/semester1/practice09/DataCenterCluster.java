package semester1.practice09;

public class DataCenterCluster {
    private final String clusterLocation;
    private final ServerNode[] nodes;
    private int nodeCount;
    public DataCenterCluster(String clusterLocation, int capacity) {
        this.clusterLocation = (clusterLocation == null || clusterLocation.isBlank()) ? "Центр" : clusterLocation;
        int cap = Math.max(1, capacity);
        this.nodes = new ServerNode[cap];
        this.nodeCount = 0;}
    public boolean addServer(ServerNode node) {
        if (node == null) return false;
        if (nodeCount < nodes.length) {
            nodes[nodeCount++] = node;
            return true;}
        System.out.println("⚠️ У кластері '" + clusterLocation + "' немає місця для нового сервера!");
        return false;}
    public boolean deployContainer(int requiredRamGb) {
        for (int i = 0; i < nodeCount; i++) {
            if (nodes[i].deploy(requiredRamGb)) {
                System.out.printf("Контейнер (%d ГБ) успішно розгорнуто на серверові %s\n",
                        requiredRamGb, nodes[i].getIpAddress());
                return true;}
        }
        System.out.printf("Не вдалося розгорнути контейнер (%d ГБ): бракує ресурсів або немає активних серверів.\n",
                requiredRamGb);
        return false;}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("DataCenterCluster{локація='%s', вузлів=%d/%d}:\n",
                clusterLocation, nodeCount, nodes.length));
        for (int i = 0; i < nodeCount; i++) {
            sb.append("  - ").append(nodes[i]).append("\n");}
        return sb.toString();}
}
