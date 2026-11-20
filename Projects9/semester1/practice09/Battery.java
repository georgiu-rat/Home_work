package semester1.practice09;

public class Battery {
    private int capacityMah;
    private int chargePercent;
    public Battery(int capacityMah) {
        this.capacityMah = Math.max(500, capacityMah);
        this.chargePercent = 100;}
    public void drain(int percent) {
        if (percent > 0) {
            this.chargePercent = Math.max(0, this.chargePercent - percent);}
    }
    public void charge(int percent) {
        if (percent > 0) {
            this.chargePercent = Math.min(100, this.chargePercent + percent);}
    }
    public int getChargePercent() {
        return chargePercent;}
    public boolean isEmpty() {
        return chargePercent <= 0;}
    @Override
    public String toString() {
        return String.format("Battery{ємність=%d мА·год, заряд=%d%%}", capacityMah, chargePercent);}
}

