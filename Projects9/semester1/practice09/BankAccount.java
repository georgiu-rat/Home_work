package semester1.practice09;

public class BankAccount {
    private final String iban;
    private double balance;
    public BankAccount(String iban, double initialBalance) {
        this.iban = (iban == null || iban.isBlank()) ? "UA0000000000" : iban;
        this.balance = Math.max(0.0, initialBalance);}
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;}
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;}
        return false;}
    public double getBalance() {
        return balance;}
    public String getIban() {
        return iban;}
    @Override
    public String toString() {
        return String.format("BankAccount{IBAN='%s', баланс=%.2f грн}", iban, balance);}
}
