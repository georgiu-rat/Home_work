package semester1.practice10.task_4;

public class SmsSender extends NotificationSender {
    public SmsSender(String recipient) {
        super(recipient);}
    @Override
    public String send(String message) {
        String finalMsg = message;
        if (message != null && message.length() > 70) {
            finalMsg = message.substring(0, 67) + "...";}
        return String.format("[SMS на %s] %s", getRecipient(), finalMsg);}
}
