package semester1.practice10.task_6;

public class ExponentialGrowth extends DifferentiableFunction {
    private final double amplitude;
    private final double lambda;
    public ExponentialGrowth(double amplitude, double lambda) {
        this.amplitude = amplitude;
        this.lambda = lambda;}
    @Override
    public double f(double x) {
        return amplitude * Math.exp(lambda * x);}
}
