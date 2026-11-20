package semester1.practice10.task_20;

public class Rotation2DOperator extends AbstractVectorOperator implements InvertibleOperator {
    private final double angleRadians;
    public Rotation2DOperator(String name, double angleRadians) {
        super(name);
        this.angleRadians = angleRadians;}
    @Override
    public Vec2D transform(Vec2D v) {
        double cos = Math.cos(angleRadians);
        double sin = Math.sin(angleRadians);
        double newX = v.getX() * cos - v.getY() * sin;
        double newY = v.getX() * sin + v.getY() * cos;
        return new Vec2D(newX, newY);}
    @Override
    public Vec2D inverseTransform(Vec2D v) {
        double cos = Math.cos(-angleRadians);
        double sin = Math.sin(-angleRadians);
        double newX = v.getX() * cos - v.getY() * sin;
        double newY = v.getX() * sin + v.getY() * cos;
        return new Vec2D(newX, newY);}
}