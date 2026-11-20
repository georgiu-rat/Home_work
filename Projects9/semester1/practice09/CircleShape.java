package semester1.practice09;

public class CircleShape extends AbstractShape {
    private final double radius;
    public CircleShape(String color, double radius) {
        super(color);
        this.radius = Math.max(0.1, radius);}
    @Override
    public double getArea() {
        return Math.PI * radius * radius;}
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;}
    @Override
    public String toString() {
        return String.format("Circle{радіус=%.2f, %s}", radius, super.toString());}}
