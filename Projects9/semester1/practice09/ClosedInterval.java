package semester1.practice09;

public class ClosedInterval {
    private double start;
    private double end;

    public ClosedInterval(double start, double end) {
        setRange(start, end);
    }
    private void setRange(double a, double b) {
        if (a <= b) {
            this.start = a;
            this.end = b;
        } else {
            this.start = b;
            this.end = a;}
    }
    public void resize(double newStart, double newEnd) {
        setRange(newStart, newEnd);}
    public double getLength() {
        return this.end - this.start;}
    public double getMidpoint() {
        return (this.start + this.end) / 2.0;}
    public boolean overlaps(ClosedInterval other) {
        if (other == null) {
            return false;}
        return Math.max(this.start, other.start) <= Math.min(this.end, other.end);}
    public double getStart() {
        return start;}
    public double getEnd() {
        return end;}
    @Override
    public String toString() {
        return String.format("[%.2f; %.2f] (центр: %.2f, довжина: %.2f)",
                start, end, getMidpoint(), getLength());}
}
