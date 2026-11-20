package semester1.practice10.task_4;

public class NotificationSender {
    private final String recipient;
    public NotificationSender(String recipient) {
        this.recipient = recipient;}
    public String getRecipient() {
        return recipient;}
    public String send(String message) {
        return "Звичайне сповіщення для " + recipient + ": " + message;}
}
