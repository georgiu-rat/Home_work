package semester1.practice10.task_4;

public class TelegramBotSender extends NotificationSender {
    private final String telegramUsername;
    public TelegramBotSender(String recipient, String telegramUsername) {
        super(recipient);
        this.telegramUsername = telegramUsername;}
    @Override
    public String send(String message) {
        return String.format("[Telegram  @%s] <b>Увага:</b> %s ",
                telegramUsername, message);}
}
