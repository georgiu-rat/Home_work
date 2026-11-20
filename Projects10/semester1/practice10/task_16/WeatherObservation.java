package semester1.practice10.task_16;

public class WeatherObservation implements DataExportable {
    private final String city;
    private final double tempC;
    private final int humidity;
    public WeatherObservation(String city, double tempC, int humidity) {
        this.city = city;
        this.tempC = tempC;
        this.humidity = humidity;}
    @Override
    public String toJson() {
        return String.format("{\"class\": \"WeatherObservation\", \"city\": \"%s\", \"tempC\": %.1f, \"humidity\": %d}",
                city, tempC, humidity);}
    @Override
    public String toCsvRow() {
        return String.format("WeatherObservation,%s,%.1f,%d", city, tempC, humidity);}
}
