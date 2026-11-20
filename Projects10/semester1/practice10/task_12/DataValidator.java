package semester1.practice10.task_12;

public interface DataValidator {
    boolean isValid(String input);
    default String validateOrDefault(String input, String fallback) {
        if (isValid(input)) {
            return input;}
        return fallback;}
    static boolean isNotNullOrBlank(String s) {
        return s != null && !s.isBlank();}
}
