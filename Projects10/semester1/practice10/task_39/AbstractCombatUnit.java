package semester1.practice10.task_39;

public abstract class AbstractCombatUnit {
    private final String name;
    protected int hp;
    public AbstractCombatUnit(String name, int hp) {
        this.name = name;
        this.hp = Math.max(0, hp);}
    public String getName() {
        return name;}
    public int getHp() {
        return hp;}
    public void takeDamage(int amount) {
        this.hp = Math.max(0, this.hp - amount);}
    public final boolean isAlive() {
        return hp > 0;}
    public abstract int calculateDamage();
}
