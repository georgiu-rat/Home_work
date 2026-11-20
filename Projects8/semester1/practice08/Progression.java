package semester1.practice08;

public class Progression {
    protected double firstTerm;
    protected double step;
    public Progression(double firstTerm, double step) {
        this.firstTerm = firstTerm;
        this.step = step;}
    public double getTerm(int n) {
        return 0.0;}
    public double[] generateFirstN(int n) {
        if (n <= 0) return new double[0];
        double[] result = new double[n];
        for (int i = 1; i <= n; i++) {
            result[i - 1] = getTerm(i);
        }
        return result;}
}
class ArithmeticProgression extends Progression {
    public ArithmeticProgression(double firstTerm, double step) {
        super(firstTerm, step);}
    @Override
    public double getTerm(int n) {
        return firstTerm + (n - 1) * step;}
    @Override
    public String toString() {
        double[] first5 = generateFirstN(5);
        return String.format("арифметична прогресія|a1=%.1f, d=%.1f, first5=[%.1f, %.1f, %.1f, %.1f, %.1f]|",
                firstTerm, step, first5[0], first5[1], first5[2], first5[3], first5[4]);}
}
class GeometricProgression extends Progression {
    public GeometricProgression(double firstTerm, double step) {
        super(firstTerm, step);}
    @Override
    public double getTerm(int n) {
        return firstTerm * Math.pow(step, n - 1);}
    @Override
    public String toString() {
        double[] first5 = generateFirstN(5);
        return String.format("геомтрична прогресія|b1=%.1f, q=%.1f, first5=[%.1f, %.1f, %.1f, %.1f, %.1f]|",
                firstTerm, step, first5[0], first5[1], first5[2], first5[3], first5[4]);}
}