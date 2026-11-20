package semester1.practice10.task_38;

public class CubicFunction extends AbstractAnalyticFunction implements RootFindable {
    @Override
    public double evaluate(double x) {
        return Math.pow(x, 3) - 2.0 * x - 5.0;}
}
