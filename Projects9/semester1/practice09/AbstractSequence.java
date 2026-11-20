package semester1.practice09;

public abstract class AbstractSequence {
    protected final double firstElement;
    public AbstractSequence(double firstElement) {
        this.firstElement = firstElement;}
    public abstract double getElement(int n);
    public double calculateSum(int count) {
        int n = Math.max(1, count);
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += getElement(i);}
        return sum;}
    @Override
    public String toString() {
        return String.format("Початок=%.1f, Сума перших 5 елементів=%.2f",
                firstElement, calculateSum(5));}}
