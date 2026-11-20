package semester1.practice09;

public class CompositeCircle {
    private final double radius;
    private final Point2D center;
    public CompositeCircle(double centerX, double centerY, double radius) {
        this.center = new Point2D(centerX, centerY);
        this.radius = Math.max(0.0, radius);}
    public boolean containsPoint(Point2D p) {
        if (p == null) {
            return false;}
        return center.distanceTo(p) <= radius;}
    public double getRadius() {
        return radius;}
    public Point2D getCenter() {
        return new Point2D(center.getX(), center.getY());}
    @Override
    public String toString() {
        return String.format("CompositeCircle{центр=%s, радіус=%.2f}", center, radius);}
}
