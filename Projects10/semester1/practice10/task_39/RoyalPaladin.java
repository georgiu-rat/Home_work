package semester1.practice10.task_39;

public class RoyalPaladin extends AbstractCombatUnit implements ShieldBearer, SelfRegenerating {
    public RoyalPaladin(String name, int hp) {
        super(name, hp);}
    @Override
    public int calculateDamage() {
        return 35;}
    @Override
    public int regenerateHp() {
        int heal = 10;
        this.hp += heal;
        return heal;}
    @Override
    public int absorbDamage(int incomingDamage) {
        return Math.max(0, incomingDamage - 20);}
}
