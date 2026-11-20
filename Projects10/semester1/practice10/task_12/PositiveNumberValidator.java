package semester1.practice10.task_12;

public class PositiveNumberValidator implements DataValidator {
    @Override
    public boolean isValid(String input) {
        if (!DataValidator.isNotNullOrBlank(input)) {
            return false;
        }
        try {
            double val = Double.parseDouble(input);
            return val > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
