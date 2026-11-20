package semester1.practice10.task_39;

public class TrollWarlord extends AbstractCombatUnit implements CriticalStriker, SelfRegenerating {
    public TrollWarlord(String name, int hp) {
        super(name, hp);}
    @Override
    public int calculateDamage() {
        return 60;}
    @Override
    public double getCritMultiplier() {
        return 1.5;}
    @Override
    public int regenerateHp() {
        int heal = 15;
        this.hp += heal;
        return heal;}
}
