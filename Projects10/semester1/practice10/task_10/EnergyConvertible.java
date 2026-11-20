package semester1.practice10.task_10;

public interface EnergyConvertible {
    double SPEED_OF_LIGHT = 299_792_458.0;
    double JOULES_PER_KWH = 3_600_000.0;
    double getEnergyJoules();
    default double getEnergyKwh() {
        return getEnergyJoules() / JOULES_PER_KWH;}
}
