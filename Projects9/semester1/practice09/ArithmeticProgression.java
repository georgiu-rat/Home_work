package semester1.practice09;

public class ArithmeticProgression extends AbstractSequence {
    private final double commonDifference; // різниця прогресії (d)
    public ArithmeticProgression(double firstElement, double commonDifference) {
        super(firstElement);
        this.commonDifference = commonDifference;}
    @Override
    public double getElement(int n) {
        int index = Math.max(1, n);
        return firstElement + (index - 1) * commonDifference;}
    @Override
    public String toString() {
        return String.format("ArithmeticProgression{перший член=%.1f, різниця=%.1f} — %s",
                firstElement, commonDifference, super.toString());}
}
