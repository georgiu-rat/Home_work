package semester1.practice08;

public class SensorNode {
    private String sensorId;
    protected double calibrationOffset;
    private double rawValue;

    public double getCalibratedValue() {
        return rawValue + calibrationOffset;
    }

    public SensorNode(String sensorId, double calibrationOffset, double rawValue) {
        this.sensorId = sensorId;
        this.calibrationOffset = calibrationOffset;
        this.rawValue = rawValue;
    }
    public String getSensorId() {
        return sensorId;
    }
    public double getRawValue() {
        return rawValue;
    }
    public void setRawValue(double rawValue) {
        this.rawValue = rawValue;
    }
    @Override
    public String toString() {
        return String.format("Датчик [%s] | Сире значення: %.2f | Зсув калібрування: %.2f | Відкалібровано: %.2f",
                sensorId, rawValue, calibrationOffset, getCalibratedValue());
    }
}
