package semester1.practice10.task_33;

import java.util.Arrays;

public class FinalCalibrationTable {
    public static final double GRAVITY_G = 9.80665;
    private final String sensorSerial;
    private final double[] coefficients;
    public FinalCalibrationTable(String sensorSerial, double[] inputCoefficients) {
        this.sensorSerial = sensorSerial;
        if (inputCoefficients != null) {
            this.coefficients = Arrays.copyOf(inputCoefficients, inputCoefficients.length);
        } else {
            this.coefficients = new double[0];}}
    public String getSensorSerial() {
        return sensorSerial;}
    public double[] getCoefficients() {
        return Arrays.copyOf(coefficients, coefficients.length);}
}
