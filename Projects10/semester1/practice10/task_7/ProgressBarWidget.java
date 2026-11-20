package semester1.practice10.task_7;

public class ProgressBarWidget extends UiWidget {
    private final int progressPercent;
    public ProgressBarWidget(String id, int width, int height, int progressPercent) {
        super(id, width, height);
        this.progressPercent = Math.max(0, Math.min(100, progressPercent));}
    @Override
    public String renderHtml() {
        return String.format("<div id=\"%s\" class=\"progress-bar\" style=\"width: %dpx; height: %dpx;\"><span style=\"width: %d%%;\"></span></div>",
                id, width, height, progressPercent);}
}
