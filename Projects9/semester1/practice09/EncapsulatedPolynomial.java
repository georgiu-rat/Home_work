package semester1.practice09;

import java.util.Arrays;

public class EncapsulatedPolynomial {
    private final double[] coeffs;

    public EncapsulatedPolynomial(double[] coeffs) {
        if (coeffs == null || coeffs.length == 0) {
            this.coeffs = new double[]{0.0};
        } else {
            this.coeffs = Arrays.copyOf(coeffs, coeffs.length);}
    }
    public int getDegree() {
        return this.coeffs.length - 1;}
    public double getCoefficient(int power) {
        if (power >= 0 && power < coeffs.length) {
            return coeffs[power];}
        return 0.0;}
    public double evaluate(double x) {
        double result = 0.0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            result = result * x + coeffs[i];}
        return result;}
    public double[] getCoeffs() {
        return Arrays.copyOf(coeffs, coeffs.length);}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P(x) = ");
        for (int i = 0; i < coeffs.length; i++) {
            if (coeffs[i] == 0 && coeffs.length > 1) continue; // Пропускаємо нульові члени для краси
            if (i > 0 && coeffs[i] > 0) sb.append(" + ");
            else if (coeffs[i] < 0) sb.append(" - ");
            double val = Math.abs(coeffs[i]);
            if (i == 0) {
                sb.append(coeffs[i]);
            } else if (i == 1) {
                sb.append(val).append("*x");
            } else {
                sb.append(val).append("*x^").append(i);}
        }
        return sb.toString();}
}
