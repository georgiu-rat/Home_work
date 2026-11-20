package semester1.practice10.task_2;

public class CircleShape extends Shape2D{
    private final double radius;
    public CircleShape(double radius) {
        this.radius = radius;}
    @Override
    public double getArea() {
        return Math.PI * radius * radius;}
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;}
    public double getDiameter() {
        return radius * 2.0;
    }
    }
