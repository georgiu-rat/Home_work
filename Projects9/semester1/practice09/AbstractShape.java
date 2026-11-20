package semester1.practice09;

public abstract class AbstractShape {
    private String color;
    public AbstractShape(String color) {
        this.color = (color == null || color.isBlank()) ? "Білий" : color;}
    public String getColor() {
        return color;}
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return String.format("Фігура [колір='%s', площа=%.2f, периметр=%.2f]",
                color, getArea(), getPerimeter());}
}