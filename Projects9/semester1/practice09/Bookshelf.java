package semester1.practice09;

public class Bookshelf {
    private final String genre;
    private final BookItem[] books;
    private int bookCount;
    public Bookshelf(String genre, int capacity) {
        this.genre = (genre == null || genre.isBlank()) ? "Загальний" : genre;
        int cap = Math.max(1, capacity);
        this.books = new BookItem[cap];
        this.bookCount = 0;}
    public boolean putBook(BookItem book) {
        if (book == null) {
            System.out.println("Помилка: Неможливо додати порожню книгу (null).");
            return false;}
        if (bookCount < books.length) {
            books[bookCount++] = book;
            return true;
        } else {
            System.out.println("Попередження: На полиці '" + genre + "' немає вільних місць!");
            return false;}
    }
    public BookItem findLongestBook() {
        if (bookCount == 0) {
            return null;}
        BookItem longest = books[0];
        for (int i = 1; i < bookCount; i++) {
            if (books[i].getPages() > longest.getPages()) {
                longest = books[i];}
        }
        return longest;}
    public int getTotalPagesOnShelf() {
        int total = 0;
        for (int i = 0; i < bookCount; i++) {
            total += books[i].getPages();}
        return total;}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("Bookshelf{жанр='%s', книг=%d/%d}:\n", genre, bookCount, books.length));
        for (int i = 0; i < bookCount; i++) {
            sb.append("  - ").append(books[i]).append("\n");}
        sb.append(String.format("  Загалом сторінок: %d", getTotalPagesOnShelf()));
        return sb.toString();}
}
