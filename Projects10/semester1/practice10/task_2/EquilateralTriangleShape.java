package semester1.practice10.task_2;

public class EquilateralTriangleShape extends Shape2D {
    private final double side;
    public EquilateralTriangleShape(double side) {
        this.side = side;}
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;}
    @Override
    public double getPerimeter() {
        return 3 * side;}
}
