package semester1.practice10.task_18;

public abstract class AbstractSmartAppliance {
    private final String room;
    private final String model;
    protected boolean poweredOn;
    public AbstractSmartAppliance(String room, String model) {
        this.room = room;
        this.model = model;
        this.poweredOn = true;}
    public String getRoom() {
        return room;}
    public String getModel() {
        return model;}
    public boolean isPoweredOn() {
        return poweredOn;}
    public void setPoweredOn(boolean poweredOn) {
        this.poweredOn = poweredOn;}
    public abstract double getCurrentWatts();
}
