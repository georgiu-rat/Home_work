package semester1.practice10.task_11;

public class AmphibiousRescueDrone implements Flyable, Swimmable, GpsTrackable {
    private final String droneId;
    public AmphibiousRescueDrone(String droneId) {
        this.droneId = droneId;}
    @Override
    public void takeOff() {
        System.out.printf("[Дрон %s] Вертикальний зліт виконано успішно.%n", droneId);}
    @Override
    public double getMaxAltitude() {
        return 4500.0;}
        @Override
    public void dive(double depthMeters) {
        System.out.printf("[Дрон %s] Занурення під воду на глибину %.1f м.%n", droneId, depthMeters);}
    @Override
    public double getMaxDepth() {
        return 120.0;}
    @Override
    public String getCoordinates() {
        return "50.4501° N, 30.5234° E (Київ)";}
}
