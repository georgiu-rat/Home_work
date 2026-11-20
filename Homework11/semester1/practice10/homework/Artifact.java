package semester1.practice10.homework;

public class Artifact {
    private String name;
    private int costKarbovanets;
    private double radiationLevel;
    public static final double MAX_SAFE_RADIATION = 50.0;
    public Artifact(String name, int costKarbovanets, double radiationLevel){
        this.name = name;
        this.radiationLevel=radiationLevel;
        this.costKarbovanets=costKarbovanets;
    }
    public String getName(){
        return name;}
    public int getCostKarbovanets(){
        return costKarbovanets;}
    public double getRadiationLevel(){
        return radiationLevel;}

    public boolean isRadioactiveDud(double maxSafeRadiation) {
        if (costKarbovanets <= 0 || radiationLevel >= MAX_SAFE_RADIATION){
            return true;}
        else {return false;}
    }
    @Override public String toString(){
        return "[Артефакт: '" + name + "' | Ціна: " + costKarbovanets + " крб | Радіація: " + radiationLevel + " мкЗв/год]";
    }
}
