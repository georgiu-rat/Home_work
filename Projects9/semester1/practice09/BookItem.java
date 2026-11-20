package semester1.practice09;

public class BookItem {
    private final String title;
    private final String author;
    private final int pages;
    public BookItem(String title, String author, int pages) {
        this.title = (title == null || title.isBlank()) ? "Невідома книга" : title;
        this.author = (author == null || author.isBlank()) ? "Невідомий автор" : author;
        this.pages = Math.max(1, pages);}
    public String getTitle() {
        return title;}
    public String getAuthor() {
        return author;}
    public int getPages() {
        return pages;}
    @Override
    public String toString() {
        return String.format("'%s' - %s (%d стор.)", title, author, pages);}
}
