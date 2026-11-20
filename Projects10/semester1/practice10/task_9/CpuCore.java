package semester1.practice10.task_9;

public class CpuCore implements Measurable {
    private final String model;
    private final double frequencyGhz;
    public CpuCore(String model, double frequencyGhz) {
        this.model = model;
        this.frequencyGhz = frequencyGhz;}
    @Override
    public double getMeasure() {
        return frequencyGhz;}
    public String getModel() {
        return model;}
}
