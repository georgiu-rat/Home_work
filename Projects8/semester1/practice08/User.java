package semester1.practice08;

public class User {
    private int id;
    private String email;
    public User(int id,String email){
        this.email=email;
        this.id=id;}
    public int getId() {
        return id;}
    public String getEmail() {
        return email;}
    @Override
    public String toString() {
        return String.format("користвач|id=%d, емейл='%s'|", id, email);}
}
class StudentUser extends User{
    String groupCode;
    double gpa;
    public StudentUser(int id,String groupCode,double gpa,String email){
        super(id,email);
        this.gpa=Math.max(0.0, Math.min(100.0, gpa));
        this.groupCode=groupCode;}
    public double getGpa() {
        return gpa;}
    @Override
    public String toString() {
        return String.format("студент юзер|%s, група='%s', оцінка=%.2f|", super.toString(), groupCode, gpa);
    }
}
class PostgraduateStudent extends StudentUser{
    private String thesisTopic;
    private String supervisorName;
    public PostgraduateStudent(int id, String email, String groupCode, double gpa, String thesisTopic, String supervisorName) {
        super(id,groupCode,gpa,email);
        this.thesisTopic = thesisTopic;
        this.supervisorName = supervisorName;}
    public boolean isEligibleForDefense() {
        return gpa >= 85.0 && thesisTopic != null && !thesisTopic.isBlank();}
    @Override
    public String toString() {
        return String.format("аспірант|%s, дисетація='%s', керівник='%s', кваліфікований=%s|",
                super.toString(), thesisTopic, supervisorName, isEligibleForDefense());}

}