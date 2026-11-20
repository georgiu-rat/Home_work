package semester1.practice08;

public class PaymentCard {
    private String cardHolder;
    protected double balance;
    public boolean pay(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;}
        return false;}
    PaymentCard(String cardHolder,double balance){
        this.cardHolder=cardHolder;
        this.balance=balance;
    }
    public double getBalance() {
        return balance;}
    @Override
    public String toString() {
        return String.format("Платіжна карта|користвач='%s', баланс=%.2f|", cardHolder, balance);}
}
class DebitCard extends PaymentCard {
    private double dailyLimit;

    DebitCard(String cardHolder, double balance, double dailyLimit) {
        super(cardHolder, balance);
        this.dailyLimit = dailyLimit;
    }

    @Override
    public boolean pay(double amount) {
        if (amount > dailyLimit) {
            System.out.println("Помилка: Перевищено денний ліміт картки!");
            return false;
        }
        return super.pay(amount);
    }

    @Override
    public String toString() {
        return String.format("Дебетова картка|%s, денний ліміт=%.2f|", super.toString(), dailyLimit);
    }
}
    class CashbackPlatinumCard extends DebitCard {
        private double cashbackPercent;
        private double accumulatedCashback;
        public CashbackPlatinumCard(String cardHolder, double balance, double dailyLimit, double cashbackPercent) {
            super(cardHolder, balance, dailyLimit);
            this.cashbackPercent = cashbackPercent;
            this.accumulatedCashback = 0.0;}
        @Override
        public boolean pay(double amount) {
            boolean isSuccess = super.pay(amount);
            if (isSuccess) {
                double earned = amount * (cashbackPercent / 100.0);
                accumulatedCashback += earned;
            }
            return isSuccess;
        }

        @Override
        public String toString() {
            return String.format("кешбек картка|%s, кешбек=%.1f%%, накопичення=%.2f|", super.toString(), cashbackPercent, accumulatedCashback);
        }
    }