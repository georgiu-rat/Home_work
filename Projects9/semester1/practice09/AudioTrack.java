package semester1.practice09;

public class AudioTrack {
    private final String title;
    private final String artist;
    private final int durationSeconds;
    public AudioTrack(String title, String artist, int durationSeconds) {
        this.title = (title == null || title.isBlank()) ? "Невідома пісня" : title;
        this.artist = (artist == null || artist.isBlank()) ? "Невідомий автор" : artist;
        this.durationSeconds = Math.max(1, durationSeconds);}
    public int getDurationSeconds() {
        return durationSeconds;}
    public String getFormattedDuration() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);}
    @Override
    public String toString() {
        return String.format("%s - %s [%s]", artist, title, getFormattedDuration());}
}
