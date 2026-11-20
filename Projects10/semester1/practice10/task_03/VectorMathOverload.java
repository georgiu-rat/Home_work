package semester1.practice10.task_3;

public class VectorMathOverload {
    public static double norm(double x) {
        return Math.abs(x);}
    public static double norm(double x, double y) {
        return Math.sqrt(x * x + y * y);}
    public static double norm(double[] v) {
        double sum = 0;
        for (double val : v) {
            sum += val * val;}
        return Math.sqrt(sum);}
}
