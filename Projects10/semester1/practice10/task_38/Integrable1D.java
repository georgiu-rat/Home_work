package semester1.practice10.task_38;

public interface Integrable1D {
    double evaluate(double x);
    default double integrateTrapezoid(double a, double b, int n) {
        if (n <= 0) throw new IllegalArgumentException("Кількість розбиттів n має бути > 0");
        double h = (b - a) / n;
        double sum = 0.5 * (evaluate(a) + evaluate(b));
        for (int i = 1; i < n; i++) {
            sum += evaluate(a + i * h);}
        return sum * h;}
}
