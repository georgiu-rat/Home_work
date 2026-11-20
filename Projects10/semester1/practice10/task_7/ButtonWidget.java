package semester1.practice10.task_7;

public class ButtonWidget extends UiWidget {
    private final String label;
    public ButtonWidget(String id, int width, int height, String label) {
        super(id, width, height);
        this.label = label;}
    @Override
    public String renderHtml() {
        return String.format("<button id=\"%s\" style=\"width: %dpx; height: %dpx;\">%s</button>",
                id, width, height, label);
    }}
