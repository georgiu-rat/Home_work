package semester1.practice10.task_6;

public class QuadraticParabola extends DifferentiableFunction {
    private final double a, b, c;
    public QuadraticParabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;}
    @Override
    public double f(double x) {
        return a * x * x + b * x + c;}
}
