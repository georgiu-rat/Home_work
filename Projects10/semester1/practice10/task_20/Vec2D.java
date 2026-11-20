package semester1.practice10.task_20;

public final class Vec2D {
    private final double x;
    private final double y;
    public Vec2D(double x, double y) {
        this.x = x;
        this.y = y;}
    public double getX() {
        return x;}
    public double getY() {
        return y;}
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);}
}