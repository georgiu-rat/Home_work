package semester1.practice09;

public class CylinderSolid extends Solid3D {
    private final double radius;
    private final double height;
    public CylinderSolid(double radius, double height) {
        this.radius = Math.max(0.1, radius);
        this.height = Math.max(0.1, height);}
    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;}
    @Override
    public double getSurfaceArea() {
        return (2.0 * Math.PI * radius * height) + (2.0 * Math.PI * radius * radius);}
    @Override
    public String toString() {
        return String.format("CylinderSolid{радіус=%.2f, висота=%.2f, %s}", radius, height, super.toString());}
}
