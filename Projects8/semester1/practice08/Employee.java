package semester1.practice08;

public class Employee {
    private String name;
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary >= 0.0 ? salary : 0.0;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Працівник: %s | Зарплата: %.2f грн", name, salary);
    }
}
    class Developer extends Employee{
        private String programmingLanguage;
        Developer(String name, double salary, String programmingLanguage){
            super(name, salary);
            this.programmingLanguage = programmingLanguage;
        }
        public String getProgrammingLanguage() {
            return programmingLanguage;
        }
        @Override
        public String toString() {
            return String.format("Розробник: %s | Зарплата: %.2f грн | Мова: %s",
                    getName(), salary, programmingLanguage);
        }
    }
