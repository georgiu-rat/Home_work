package semester1.practice10.task_34;

public abstract class AbstractSecurityProtocol {
    protected abstract boolean authenticateUser(String token);
    protected abstract String executePayload(String command);
    public final String runSecureCommand(String token, String command) {
        if (token == null || !authenticateUser(token)) {
            return "403 FORBIDDEN: Доступ заборонено або токен недійсний!";}
        String result = executePayload(command);
        return "[AUDITED SECURITY LOG] " + result;}
}
