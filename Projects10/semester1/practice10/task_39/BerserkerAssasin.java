package semester1.practice10.task_39;

public class BerserkerAssasin extends AbstractCombatUnit implements CriticalStriker {
    public BerserkerAssasin(String name, int hp) {
        super(name, hp);}
    @Override
    public int calculateDamage() {
        return 45;}
    @Override
    public double getCritMultiplier() {
        return 2.5;}
}
