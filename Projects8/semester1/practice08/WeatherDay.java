package semester1.practice08;

import java.util.Arrays;

public class WeatherDay {
    private String date;
    private double[] hourlyTemps;

    public WeatherDay(String date, double[] hourlyTemps) {
        this.date = date;
        this.hourlyTemps = new double[hourlyTemps.length];
        for (int i = 0; i < hourlyTemps.length; i++) {
            this.hourlyTemps[i] = hourlyTemps[i];
        }
    }

    public double getMinTemp() {
        if (hourlyTemps.length == 0) return 0.0;
        double min = hourlyTemps[0];
        for (double temp : hourlyTemps) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    public double getMaxTemp() {
        if (hourlyTemps.length == 0) return 0.0;
        double max = hourlyTemps[0];
        for (double temp : hourlyTemps) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public double getAverageTemp() {
        if (hourlyTemps.length == 0) return 0.0;
        double sum = 0;
        for (double temp : hourlyTemps) {
            sum += temp;
        }
        return sum / hourlyTemps.length;
    }

    @Override
    public String toString() {
        return String.format("Погода на %s | Температури: %s | Середня: %.1f°C",
                date, Arrays.toString(hourlyTemps), getAverageTemp());

    }
}