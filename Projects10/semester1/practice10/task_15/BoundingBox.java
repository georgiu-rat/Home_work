package semester1.practice10.task_15;

public class BoundingBox implements Transformable2D {
    private double x;
    private double y;
    private double width;
    private double height;
    public BoundingBox(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;}
    @Override
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;}
    @Override
    public void scale(double factor) {
        this.width *= factor;
        this.height *= factor;}
    @Override
    public String toString() {
        return String.format("BoundingBox [Координати: (%.1f, %.1f), Розміри: %.1fx%.1f]", x, y, width, height);}
}
