package semester1.practice09;

public class Engine {
    private final String fuelType;
    private final int volumeCc;
    private int rpm;
    private boolean started;
    public Engine(String fuelType, int volumeCc) {
        this.fuelType = (fuelType == null || fuelType.isBlank()) ? "Benzin" : fuelType;
        this.volumeCc = Math.max(500, volumeCc);
        this.rpm = 0;
        this.started = false;}
    public void start() {
        this.started = true;
        this.rpm = 800;}
    public void stop() {
        this.started = false;
        this.rpm = 0;}
    public void setRpm(int rpm) {
        if (started) {
            this.rpm = Math.max(800, Math.min(8000, rpm));
        } else {
            this.rpm = 0;}
    }
    public boolean isStarted() {
        return started;}
    public int getRpm() {
        return rpm;}
    @Override
    public String toString() {
        return String.format("Engine[%s, %dcc, заведений=%s, оберти=%d RPM]",
                fuelType, volumeCc, started, rpm);}
}