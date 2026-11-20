package semester1.practice10.task_6;

public class NaturalLogFunction extends DifferentiableFunction {
    private final double k;
    public NaturalLogFunction(double k) {
        this.k = k;}
    @Override
    public double f(double x) {
        return k * Math.log(x);}
}
