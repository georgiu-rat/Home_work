package semester1.practice08;

public class GradeSheet {
    private String studentName;
    protected int[] grades;
    public GradeSheet(String studentName, int[] grades) {
        this.studentName = studentName;
        this.grades = grades != null ? grades : new int[0];}
    public double calculateScore() {
        if (grades.length == 0) return 0.0;
        double sum = 0;
        for (int grade : grades) {
            sum += grade;}
        return sum / grades.length;}
    @Override
    public String toString() {
        return String.format("GradeSheet{student='%s', regularScore=%.2f}", studentName, calculateScore());}
}
class WeightedGradeSheet extends GradeSheet {
    private double[] weights;
    public WeightedGradeSheet(String studentName, int[] grades, double[] weights) {
        super(studentName, grades);
        this.weights = weights != null ? weights : new double[0];}
    @Override
    public double calculateScore() {
        if (grades.length == 0 || weights.length == 0 || grades.length != weights.length) {
            return super.calculateScore();}

        double weightedSum = 0.0;
        double totalWeight = 0.0;
        for (int i = 0; i < grades.length; i++) {
            weightedSum += grades[i] * weights[i];
            totalWeight += weights[i];}

        if (totalWeight == 0.0) return 0.0;
        return weightedSum / totalWeight;}
    @Override
    public String toString() {
        return String.format("WeightedGradeSheet{%s, weightedScore=%.2f}",
                super.toString().replace("GradeSheet", "Base"), calculateScore());}
}