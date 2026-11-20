package semester1.dota2;

public class DotaHero {
    private String name;
    private String primaryAttribute;
    private int baseHp;
    public DotaHero(String name, String primaryAttribute, int baseHp) {
        this.name = name;
        this.primaryAttribute = primaryAttribute;
        this.baseHp = baseHp;}
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public String getPrimaryAttribute() {
        return primaryAttribute;}
    public void setPrimaryAttribute(String primaryAttribute) {
        this.primaryAttribute = primaryAttribute;}
    public int getBaseHp() {
        return baseHp;}
    public void setBaseHp(int baseHp) {
        this.baseHp = baseHp;}
    public int getMaxHp() {
        return baseHp;}
    @Override
    public String toString() {
        return "Hero{name='" + name + "', primaryAttribute='" + primaryAttribute + "', baseHp=" + baseHp + "}";}
}
class StrengthHero extends DotaHero {
    private int strength;
    public StrengthHero(String name, String primaryAttribute, int baseHp, int strength) {
        super(name, primaryAttribute, baseHp);
        this.strength = strength;}
    public int getStrength() {
        return strength;}
    public void setStrength(int strength) {
        this.strength = strength;}
    @Override
    public int getMaxHp() {
        return super.getMaxHp() + (strength * 22);}
    @Override
    public String toString() {
        return super.toString() + ", StrengthHero{strength=" + strength + ", totalHp=" + getMaxHp() + "}";}
}
class AlchemistHero extends StrengthHero {
    private int greevilsGreedBonusGold;
    public AlchemistHero(String name, int baseHp, int strength, int greevilsGreedBonusGold) {
        super(name, "Strength", baseHp, strength);
        this.greevilsGreedBonusGold = greevilsGreedBonusGold;}
    public int getGreevilsGreedBonusGold() {
        return greevilsGreedBonusGold;}
    public void setGreevilsGreedBonusGold(int greevilsGreedBonusGold) {
        this.greevilsGreedBonusGold = greevilsGreedBonusGold;}
    public void chemicalRage() {
        System.out.println(getName() + " активує Chemical Rage! Регенерація здоров'я та мани значно зросли.");}
    @Override
    public String toString() {
        return super.toString() + ", AlchemistHero{greevilsGreedBonusGold=" + greevilsGreedBonusGold + "}";}
}
