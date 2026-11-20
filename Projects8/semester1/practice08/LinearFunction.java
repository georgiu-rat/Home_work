package semester1.practice08;

public class LinearFunction {
    protected double k;
    protected double b;
    public LinearFunction(double k, double b) {
        this.k = k;
        this.b = b;}
    public double evaluate(double x) {
        return k * x + b;}
    @Override
    public String toString() {
        return String.format("LinearFunction{f(x) = %.1fx + %.1f}", k, b);}
}
class QuadraticFunction extends LinearFunction {
    private double a;

    public QuadraticFunction(double a, double k, double b) {
        super(k, b);
        this.a = a;
    }

    @Override
    public double evaluate(double x) {
        return a * x * x + super.evaluate(x);}
        public double getVertexX () {
            if (a == 0) return 0.0;
            return -k / (2 * a);
    }
    @Override
    public String toString () {
        return String.format("QuadraticFunction{f(x) = %.1fx^2 + %.1fx + %.1f, vertexX=%.2f}", a, k, b, getVertexX());
        }
    }
