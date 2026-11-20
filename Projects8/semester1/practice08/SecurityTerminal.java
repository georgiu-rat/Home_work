package semester1.practice08;

public class SecurityTerminal {
    public final String generateAuthHash(String user) {
        return "AUTH-SHA-" + user.toUpperCase();}
}
class CustomTerminal extends SecurityTerminal {
    public String getWelcomeBanner() {
        return "Ласкаво просимо! Підпис безпеки: " + generateAuthHash("Admin");}
}
