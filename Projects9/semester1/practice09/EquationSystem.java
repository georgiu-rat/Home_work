package semester1.practice09;

public class EquationSystem {
    private final LinearEquation[] equations;
    private int count;
    public EquationSystem(int capacity) {
        int cap = Math.max(1, capacity);
        this.equations = new LinearEquation[cap];
        this.count = 0;}
    public boolean addEquation(LinearEquation eq) {
        if (eq == null) return false;
        if (count < equations.length) {
            equations[count++] = eq;
            return true;}
        System.out.println("⚠️ Попередження: Неможливо додати більше рівнянь у систему!");
        return false;}
    public boolean checkSolution(double x, double y) {
        if (count == 0) return false;
        for (int i = 0; i < count; i++) {
            if (!equations[i].isSatisfiedBy(x, y)) {
                return false;}
        }
        return true;}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EquationSystem {\n");
        for (int i = 0; i < count; i++) {
            sb.append("  ").append(equations[i]).append("\n");}
        sb.append("}");
        return sb.toString();}
}
