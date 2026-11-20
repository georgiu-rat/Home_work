package semester1.practice09;

public class Automobile {
    private final String model;
    private double speed;
    private final Engine engine;
    public Automobile(String model, String fuelType, int volumeCc) {
        this.model = (model == null || model.isBlank()) ? "Standard Car" : model;
        this.speed = 0.0;
        this.engine = new Engine(fuelType, volumeCc);}
    public void startEngine() {
        engine.start();
        System.out.println(model + ": Двигун успішно запущено.");}
    public void stopEngine() {
        engine.stop();
        this.speed = 0.0;
        System.out.println(model + ": Двигун зупинено, швидкість 0.");}
    public void accelerate(double deltaSpeed) {
        if (!engine.isStarted()) {
            System.out.println(model + ": Неможливо розігнатися — двигун не заведений!");
            return;}
        if (deltaSpeed <= 0) {
            return;}
        this.speed += deltaSpeed;
        int targetRpm = 800 + (int)(this.speed * 100);
        engine.setRpm(targetRpm);
        System.out.printf(" %s розганяється. Поточна швидкість: %.1f км/год\n", model, speed);}
    public double getSpeed() {
        return speed;}
    public Engine getEngine() {
        return engine;}
    @Override
    public String toString() {
        return String.format("Automobile{модель='%s', швидкість=%.1f км/год, %s}",
                model, speed, engine);}
}
