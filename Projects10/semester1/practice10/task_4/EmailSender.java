package semester1.practice10.task_4;

public class EmailSender extends NotificationSender {
    private final String subject;
    public EmailSender(String recipient, String subject) {
        super(recipient);
        this.subject = subject;}
    @Override
    public String send(String message) {
        return String.format("[EMAIL на %s] Тема: '%s' | Повідомлення: %s",
                getRecipient(), subject, message);}
}
