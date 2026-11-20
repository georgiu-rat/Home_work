package semester1.practice08;

public class CardWallet {
    private String cardNumber;
    private String pinCode;
    private double balance;

    public CardWallet(String cardNumber, String pinCode, double balance) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = balance >= 0.0 ? balance : 0.0;
    }

    public boolean changePin(String oldPin, String newPin){
        if (this.pinCode.equals(oldPin)) {
            this.pinCode = newPin;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        String lastFourDigits = cardNumber.substring(12);
        return String.format("CardWallet{card='**** **** **** %s', balance=%.2f UAH}",
                lastFourDigits, balance);
    }

}
