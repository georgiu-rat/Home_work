package semester1.practice08;

public class Publication {
    private String title;
    private String author;
    private int releaseYear;
    Publication(String title,String author,int releaseYear){
        this.title=title;
        this.author=author;
        this.releaseYear=releaseYear;
    }
    @Override
    public String toString() {
        return String.format("\"%s\" — %s (%d р.)", title, author, releaseYear);
    }
}
class PrintedBook extends Publication{
    private int pageCount;
    private String coverType;
    PrintedBook(String title,String author,int releaseYear,int pageCount,String coverType){
        super(title,author,releaseYear);
        this.pageCount=pageCount >= 0 ? pageCount : 0;
        this.coverType=coverType;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" | Паперова: %d стор., обкладинка: %s", pageCount, coverType);
    }
}
class AudioBook extends Publication {
    private int durationMinutes;
    private String narrator;

    AudioBook(String title, String author, int releaseYear, int durationMinutes, String narrator) {
        super(title, author, releaseYear);
        this.durationMinutes = durationMinutes;
        this.narrator = narrator;
    }

    public String getFormattedDuration() {
        int hours = durationMinutes / 60;
        int minutes = durationMinutes % 60;
        if (hours > 0) {
            return String.format("%d год %d хв", hours, minutes);
        } else {
            return String.format("%d хв", minutes);
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Аудіо: %s, читає: %s",
                getFormattedDuration(), narrator);
    }
}