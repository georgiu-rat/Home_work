package semester1.practice10.task_3;

public class HypotenuseOp extends BinaryOperation {
    @Override
    public double apply(double a, double b) {
        return Math.sqrt(a * a + b * b);}
}
