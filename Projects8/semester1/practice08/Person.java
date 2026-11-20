package semester1.practice08;

public class Person {
    private String fullName;
    private int birthYear;

    Person(String fullName,int birthYear){
        this.fullName=fullName;
        this.birthYear=birthYear;
    }
    public String getFullName() {
        return fullName;
    }
    public int getAge(int currentYear) {
        return currentYear - birthYear;
    }
    @Override
    public String toString() {
        return String.format("Людина: %s | Рік народження: %d", fullName, birthYear);
    }
}
class UniversityStudent extends Person{
    private String studentId;
    private String major;
    private int scholarship;
    UniversityStudent(String fullName,int birthYear,String studentId,String major,int scholarship){
        super(fullName,birthYear);
        this.studentId=studentId;
        this.major=major;
        this.scholarship=scholarship;
    }
    @Override
    public String toString() {
        return String.format("Студент: %s (Вік: %d) | Студентський: %s | Спеціальність: %s | Стипендія: %d грн",
                getFullName(), getAge(2026), studentId, major, scholarship);
    }
}
class Professor extends Person{
    private String academicTitle;
    private int publicationsCount;
    Professor(String fullName,int birthYear,String academicTitle,int publicationsCount){
        super(fullName,birthYear);
        this.academicTitle=academicTitle;
        this.publicationsCount=publicationsCount;
    }
    @Override
    public String toString() {
        return String.format("Професор: %s (Вік: %d) | Звання: %s | К-ть публікацій: %d",
                getFullName(), getAge(2026), academicTitle, publicationsCount);
    }
}