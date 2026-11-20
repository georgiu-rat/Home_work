package semester1.practice10.task_31;

public class RotationMatrix2x2 extends Matrix2x2 implements InvertibleMatrix, OrthogonalMatrix {
    public RotationMatrix2x2() {
        super(0, -1, 1, 0);}
    @Override
    public Matrix2x2 inverse() {
        return new Matrix2x2(0, 1, -1, 0) {};
    }
    @Override
    public boolean checkOrthogonality() {
        return true;}
}
