package semester1.practice10.task_34;

public class JwtSecurityProtocol extends AbstractSecurityProtocol {
    @Override
    protected boolean authenticateUser(String token) {
        return token != null && token.startsWith("JWT-admin");}
    @Override
    protected String executePayload(String command) {
        return "Виконано JWT-команду операційної системи: " + command;}
}
