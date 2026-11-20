package semester1.practice09;

public class CryptoVault {
    private final String walletAddress;
    private String secretRecoveryPhrase;
    private double btcBalance;
    private boolean locked;

    public CryptoVault(String walletAddress, String secretRecoveryPhrase, double initialBtc) {
        this.walletAddress = (walletAddress == null || walletAddress.isBlank()) ? "1UnknownWallet" : walletAddress;
        this.secretRecoveryPhrase = (secretRecoveryPhrase == null || secretRecoveryPhrase.isBlank()) ? "default secret" : secretRecoveryPhrase;
        this.btcBalance = Math.max(0.0, initialBtc);
        this.locked = true;}
    public boolean unlock(String phrase) {
        if (this.secretRecoveryPhrase.equals(phrase)) {
            this.locked = false;
            return true;}
        return false;}

    public void lock() {
        this.locked = true;}

    public boolean sendBtc(double amount, String destination) {
        if (locked) {
            System.out.println("Помилка: Гаманець заблоковано! Неможливо виконати транзакцію.");
            return false;}
        if (amount <= 0) {
            System.out.println("Помилка: Сума переказу має бути більшою за нуль.");
            return false;}
        if (this.btcBalance < amount) {
            System.out.println("Помилка: Недостатньо коштів на балансі.");
            return false;}
        this.btcBalance -= amount;
        System.out.printf("Успішно переказано %.4f BTC на адресу %s\n", amount, destination);
        return true;}
    public void depositBtc(double amount) {
        if (amount > 0) {
            this.btcBalance += amount;}}
    public String getWalletAddress() {
        return walletAddress;}
    public double getBtcBalance() {
        return btcBalance;}
    public boolean isLocked() {
        return locked;}
    @Override
    public String toString() {
        return String.format("CryptoVault{address='%s', locked=%s, btcBalance=%.4f}",
                walletAddress, locked, btcBalance);}
}
