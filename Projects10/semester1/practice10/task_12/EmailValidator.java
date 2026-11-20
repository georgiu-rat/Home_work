package semester1.practice10.task_12;

public class EmailValidator implements DataValidator {
    @Override
    public boolean isValid(String input) {
        if (!DataValidator.isNotNullOrBlank(input)) {
            return false;}
        return input.contains("@") && input.contains(".");}
}
