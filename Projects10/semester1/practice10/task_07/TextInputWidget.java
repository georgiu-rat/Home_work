package semester1.practice10.task_7;

public class TextInputWidget extends UiWidget {
    private final String placeholder;
    public TextInputWidget(String id, int width, int height, String placeholder) {
        super(id, width, height);
        this.placeholder = placeholder;}
    @Override
    public String renderHtml() {
        return String.format("<input type=\"text\" id=\"%s\" placeholder=\"%s\" style=\"width: %dpx; height: %dpx;\" />",
                id, placeholder, width, height);}
}
