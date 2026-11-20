package semester1.practice10.task_15;

public class CircleRegion implements Transformable2D {
    private double centerX;
    private double centerY;
    private double radius;
    public CircleRegion(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;}
    @Override
    public void translate(double dx, double dy) {
        this.centerX += dx;
        this.centerY += dy;}
    @Override
    public void scale(double factor) {
        this.radius *= factor;}
    @Override
    public String toString() {
        return String.format("CircleRegion [Центр: (%.1f, %.1f), Радіус: %.1f]", centerX, centerY, radius);}
}
