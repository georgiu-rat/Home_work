package semester1.practice10.task_20;

public class ProjectionXOperator extends AbstractVectorOperator {
    public ProjectionXOperator(String name) {
        super(name);}
    @Override
    public Vec2D transform(Vec2D v) {
        return new Vec2D(v.getX(), 0.0);}
}