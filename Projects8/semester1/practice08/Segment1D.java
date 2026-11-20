package semester1.practice08;

public class Segment1D {
    protected double length;
    public Segment1D(double length){
        this.length=Math.max(0.0, length);}
    public double getLength() {
        return length;}
    @Override
    public String toString() {
        return String.format("Сегмент 1д|довжина=%.2f|", length);}
}
class Square2D extends Segment1D{
    Square2D(double side){
        super(side);}
    double getPerimeter(){
        return 4*length;}
    public double getArea() {
        return length * length;}
    @Override
    public String toString() {
        return String.format("квадрат2д|%s, периметр=%.2f, плоша=%.2f|",
                super.toString(), getPerimeter(), getArea());}
}
class Cube3D extends Square2D {
    public Cube3D(double edge) {
        super(edge);
    }
    @Override
    public double getArea() {
        return 6 * super.getArea();
    }
    public double getVolume() {
        return super.getArea() * length;}
    @Override
    public String toString () {
        return String.format("куб 3д|край=%.2f, плоша=%.2f, обєм=%.2f|",
                length, getArea(), getVolume());
        }
    }