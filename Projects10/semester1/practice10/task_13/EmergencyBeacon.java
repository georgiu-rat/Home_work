package semester1.practice10.task_13;

public class EmergencyBeacon implements AcousticSignal, OpticalSignal {
    private final String location;
    public EmergencyBeacon(String location) {
        this.location = location;}
    @Override
    public String emitAlert() {
        String acousticPart = AcousticSignal.super.emitAlert();
        String opticalPart = OpticalSignal.super.emitAlert();
        return String.format("[Маяк у зоні: %s] Активно: %s + %s", location, acousticPart, opticalPart);}
}
