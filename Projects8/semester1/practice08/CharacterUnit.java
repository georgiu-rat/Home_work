package semester1.practice08;

public class CharacterUnit {
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int armor;

    public CharacterUnit(String name, int hp, int maxHp, int armor) {
        this.name = name;
        this.maxHp = Math.max(1, maxHp);
        this.hp = Math.max(0, Math.min(hp, this.maxHp));
        this.armor = Math.max(0, armor);
    }
    public void takeDamage(int rawDamage) {
        if (rawDamage <= 0) return;
        int actualDamage = Math.max(1, rawDamage - armor);
        hp = Math.max(0, hp - actualDamage);
    }
    protected String getHealthBar() {
        int totalBars = 10;
        int filledBars = (int) Math.round(((double) hp / maxHp) * totalBars);
        filledBars = Math.max(0, Math.min(filledBars, totalBars));
        StringBuilder bar = new StringBuilder("[");
        for (int i = 0; i < totalBars; i++) {
            if (i < filledBars) {
                bar.append("█");
            } else {
                bar.append("░");
            }
        }
        bar.append("]");
        return bar.toString();
    }
    @Override
    public String toString() {
        return String.format("CharacterUnit{name='%s', hp=%d/%d, armor=%d} %s",
                name, hp, maxHp, armor, getHealthBar());
    }
}
class ShieldedPaladin extends CharacterUnit {
    private int shieldPoints;
    public ShieldedPaladin(String name, int hp, int maxHp, int armor, int shieldPoints) {
        super(name, hp, maxHp, armor);
        this.shieldPoints = Math.max(0, shieldPoints);
    }
    @Override
    public void takeDamage(int rawDamage) {
        if (rawDamage <= 0) return;
        if (shieldPoints > 0) {
            if (rawDamage >= shieldPoints) {
                int remainingDamage = rawDamage - shieldPoints;
                shieldPoints = 0;
                if (remainingDamage > 0) {
                    super.takeDamage(remainingDamage);
                }
            } else {
                shieldPoints -= rawDamage;
            }
        } else {
            super.takeDamage(rawDamage);
        }
    }
    @Override
    public String toString() {
        String baseStr = super.toString().replace("CharacterUnit", "ShieldedPaladin");
        return String.format("%s, shieldPoints=%d", baseStr, shieldPoints);
    }
}
