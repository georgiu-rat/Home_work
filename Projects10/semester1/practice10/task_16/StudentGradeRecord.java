package semester1.practice10.task_16;

public class StudentGradeRecord implements DataExportable {
    private final String name;
    private final int group;
    private final double gpa;
    public StudentGradeRecord(String name, int group, double gpa) {
        this.name = name;
        this.group = group;
        this.gpa = gpa;}
    @Override
    public String toJson() {
        return String.format("{\"class\": \"StudentGradeRecord\", \"name\": \"%s\", \"group\": %d, \"gpa\": %.2f}",
                name, group, gpa);}
    @Override
    public String toCsvRow() {
        return String.format("StudentGradeRecord,%s,%d,%.2f", name, group, gpa);}
}
