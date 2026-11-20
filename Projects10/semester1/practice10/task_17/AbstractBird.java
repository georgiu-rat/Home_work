package semester1.practice10.task_17;

public abstract class AbstractBird {
    protected final String species;
    protected double weightKg;
    public AbstractBird(String species, double weightKg) {
        this.species = species;
        this.weightKg = weightKg;}
    public String getSpecies() {
        return species;}
    public double getWeightKg() {
        return weightKg;}
    public abstract String makeSound();
}
