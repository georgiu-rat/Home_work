package semester1.practice10.task_35;

public final class ImmutableVector3D implements MetricSpaceElement {
    private final double x, y, z;
    public ImmutableVector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;}
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }
    @Override
    public double getNorm() {
        return Math.sqrt(x * x + y * y + z * z);}
    @Override
    public double distanceTo(MetricSpaceElement other) {
        if (other instanceof ImmutableVector3D v) {
            double dx = this.x - v.x;
            double dy = this.y - v.y;
            double dz = this.z - v.z;
            return Math.sqrt(dx * dx + dy * dy + dz * dz);}
        throw new IllegalArgumentException("Об'єкт повинен бути сумісним ImmutableVector3D");}
    @Override
    public String toString() {
        return String.format("Vector3D(%.1f, %.1f, %.1f)", x, y, z);}
}
