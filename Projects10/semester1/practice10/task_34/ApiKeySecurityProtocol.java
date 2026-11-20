package semester1.practice10.task_34;

public class ApiKeySecurityProtocol extends AbstractSecurityProtocol {
    @Override
    protected boolean authenticateUser(String token) {
        return "SECRET-API-KEY-2026".equals(token);}
    @Override
    protected String executePayload(String command) {
        return "Оброблено API-запит бази даних: " + command;}
}
