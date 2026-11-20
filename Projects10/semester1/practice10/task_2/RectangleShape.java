package semester1.practice10.task_2;

public class RectangleShape extends Shape2D {
    private final double width;
    private final double height;
    public RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;}
    @Override
    public double getArea() {
        return width * height;}
    @Override
    public double getPerimeter() {
        return 2 * (width + height);}
    public double getDiagonal() {
        return Math.sqrt(width * width + height * height);}
    public boolean isSquare() {
        return Double.compare(width, height) == 0;}
}
