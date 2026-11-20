package semester1.practice10.task_37;

public abstract class AbstractPowerStation implements PowerProducer {
    private final String stationId;
    public AbstractPowerStation(String stationId) {
        this.stationId = stationId;}
    @Override
    public String getStationId() {
        return stationId;}
    public final double getNetOutputMw() {
        double rawPower = produceMw();
        return rawPower * 0.95;
    }
}
