package semester1.practice08;

public class Circle {
    private double radius;
    public Circle (double radius){
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        if (radius >= 0.0) {
            this.radius = radius;
        } else {
            this.radius = 1.0;
        }
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    public double getCircumference(){
        return radius*Math.PI*2;
    }
    @Override
    public String toString() {
        return String.format("Коло [Радіус: %.2f | Площа: %.2f | Довжина: %.2f]",
                radius, getArea(), getCircumference());
    }

}
