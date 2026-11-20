package semester1.practice08;

public class Weapon {
    private String title;
    private int baseDamage;

    public int calculateDamage(){
        return baseDamage;
    }
    Weapon(String title,int baseDamage){
        this.baseDamage = baseDamage >= 0 ? baseDamage : 0;
        this.title=title;
    }
    @Override
    public String toString() {
        return String.format("Зброя: \"%s\" | Фізична шкода: %d", title, calculateDamage());
    }
}
class EnchantedSword extends Weapon {
    private String element;
    private int magicPower;
    private int enchantmentLevel;

    EnchantedSword(String element, int magicPower, int enchantmentLevel,String title,int baseDamage) {
        super(title, baseDamage);
        this.element = element;
        this.enchantmentLevel = enchantmentLevel >= 0 ? enchantmentLevel : 0;
        this.magicPower = magicPower >= 0 ? magicPower : 0;
    }

    @Override
    public int calculateDamage() {
        return super.calculateDamage() + (magicPower * enchantmentLevel);
    }

    @Override
    public String toString() {
        int physicalDamage = super.calculateDamage();
        int magicDamage = magicPower * enchantmentLevel;

        return String.format("%s [Стихія: %s] | Фіз. шкода: %d | Маг. шкода: %d (%d x +%d) | Загальна шкода: %d",
                super.toString(), element, physicalDamage, magicDamage, magicPower, enchantmentLevel, calculateDamage());
    }
}
