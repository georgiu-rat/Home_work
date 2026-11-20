package semester1.practice10.task_6;

public abstract class DifferentiableFunction {
    public abstract double f(double x);
    public double derivativeAt(double x) {
        double h = 1e-5;
        return (f(x + h) - f(x - h)) / (2 * h);}
}
