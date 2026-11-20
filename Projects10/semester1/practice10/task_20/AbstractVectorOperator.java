package semester1.practice10.task_20;

public abstract class AbstractVectorOperator {
    private final String name;

    public AbstractVectorOperator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Vec2D transform(Vec2D v);
}
