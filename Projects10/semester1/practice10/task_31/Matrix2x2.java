package semester1.practice10.task_31;

public abstract class Matrix2x2 {
    protected final double a11, a12, a21, a22;
    public Matrix2x2(double a11, double a12, double a21, double a22) {
        this.a11 = a11;
        this.a12 = a12;
        this.a21 = a21;
        this.a22 = a22;}
    public double determinant() {
        return a11 * a22 - a12 * a21;}
    @Override
    public String toString() {
        return String.format("\n[%.2f, %.2f],\n[%.2f, %.2f]", a11, a12, a21, a22);}

}
