package semester1.practice10.task_7;

public abstract class UiWidget {
    protected String id;
    protected int width;
    protected int height;
    public UiWidget(String id, int width, int height) {
        this.id = id;
        this.width = width;
        this.height = height;}
    public abstract String renderHtml();
}
