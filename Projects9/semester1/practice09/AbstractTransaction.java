package semester1.practice09;

public abstract class AbstractTransaction {
    protected double amount;
    protected boolean executed;
    public AbstractTransaction(double amount) {
        this.amount = Math.max(0.0, amount);
        this.executed = false;}
    public double getAmount() {
        return amount;}
    public boolean isExecuted() {
        return executed;}
    public abstract boolean execute();
    @Override
    public String toString() {
        return String.format("Транзакція на суму %.2f грн — Статус: %s", amount, (executed ? "Виконано":"Очікує"));
    }
}
