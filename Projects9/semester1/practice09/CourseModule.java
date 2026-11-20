package semester1.practice09;

public class CourseModule {
    private final String topic;
    private final int lectureHours;
    private final int practiceHours;
    private final double maxScore;
    public CourseModule(String topic, int lectureHours, int practiceHours, double maxScore) {
        this.topic = (topic == null || topic.isBlank()) ? "Модуль" : topic;
        this.lectureHours = Math.max(0, lectureHours);
        this.practiceHours = Math.max(0, practiceHours);
        this.maxScore = Math.max(1.0, maxScore);}
    public int getTotalHours() {
        return lectureHours + practiceHours;}
    public double getMaxScore() {
        return maxScore;}
    @Override
    public String toString() {
        return String.format("Модуль '%s' (Лекцій: %f год, Практик: %f год) — %.1f балів",
                topic, (double)lectureHours, (double)practiceHours, maxScore);}
}
