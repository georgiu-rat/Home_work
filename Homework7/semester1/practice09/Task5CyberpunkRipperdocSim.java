package semester1.practice09;

class BioMonitor {
    private int hp;
    private final int maxHp;
    private int humanity;
    private boolean cyberpsychosis;

    public BioMonitor(int maxHp) {
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.humanity = 100;
        this.cyberpsychosis = false;}
    public int getHp() { return hp; }
    public int getMaxHp() { return maxHp; }
    public int getHumanity() { return humanity; }
    public boolean isCyberpsychosis() { return cyberpsychosis; }

    public void reduceHumanity(int cost) {
        this.humanity = Math.max(0, this.humanity - cost);
        if (this.humanity < 20) {
            this.cyberpsychosis = true;}
    }

    public void injectImmunoblockers(int restoreAmount) {
        this.humanity = Math.min(100, this.humanity + restoreAmount);
        if (this.humanity >= 20) {
            this.cyberpsychosis = false;}
    }

    public void takeDamage(int rawDamage, int totalArmor) {
        int effectiveDamage = Math.max(5, rawDamage - totalArmor);
        this.hp = Math.max(0, this.hp - effectiveDamage);}

    @Override
    public String toString() {
        String status = cyberpsychosis ? " КІБЕРПСИХОЗ" : "Стабільний";
        return String.format("HP [%d/%d] | Людяність: %d/100 (%s)", hp, maxHp, humanity, status);}
}
abstract class AbstractCyberImplant {
    private final String name;
    private final String slot;
    private final int humanityCost;

    public AbstractCyberImplant(String name, String slot, int humanityCost) {
        this.name = name;
        this.slot = slot;
        this.humanityCost = humanityCost;}

    public String getName() { return name; }
    public String getSlot() { return slot; }
    public int getHumanityCost() { return humanityCost; }

    public abstract int getAttackBonus();
    public abstract int getArmorBonus();
    public abstract String activateSpecialAbility();

    @Override
    public String toString() {
        return String.format("[%s] %s (АТК: +%d, БРОНЯ: +%d, Людяність: -%d)",
                slot, name, getAttackBonus(), getArmorBonus(), humanityCost);}
}
class SandevistanOs extends AbstractCyberImplant {
    public SandevistanOs() {
        super("Militech Sandevistan Apogee", "Нейро-ОС", 35);
    }
    @Override public int getAttackBonus() { return 90; }
    @Override public int getArmorBonus() { return 20; }
    @Override public String activateSpecialAbility() {
        return " САНДЕВІСТАН АКТИВОВАНО: Час сповільнено на 85%! Вороги замріли на місці!";
    }
}

class MantisBlades extends AbstractCyberImplant {
    public MantisBlades() {
        super("Термальні Клинки Богомола", "Руки", 25);
    }
    @Override public int getAttackBonus() { return 110; }
    @Override public int getArmorBonus() { return 5; }
    @Override public String activateSpecialAbility() {
        return " Вихор розпечених клинків Богомола розтинає броню ворога!";
    }
}

class SubdermalTitaniumArmor extends AbstractCyberImplant {
    public SubdermalTitaniumArmor() {
        super("Підшкірна Титанова Броня", "Шкіра", 30);
    }
    @Override public int getAttackBonus() { return 10; }
    @Override public int getArmorBonus() { return 65; }
    @Override public String activateSpecialAbility() {
        return " Нано-пластини поглинають кінетичний удар!";
    }
}
class CyberMercenary {
    private final String nickname;
    private final int baseAttack;
    private final BioMonitor bioMonitor;
    private final AbstractCyberImplant[] implants;
    private int implantCount;

    public CyberMercenary(String nickname, int baseAttack) {
        this.nickname = nickname;
        this.baseAttack = baseAttack;
        this.bioMonitor = new BioMonitor(1000);
        this.implants = new AbstractCyberImplant[4];
        this.implantCount = 0;}

    public boolean installImplant(AbstractCyberImplant implant) {
        // Перевірка на дублювання слота
        for (int i = 0; i < implantCount; i++) {
            if (implants[i].getSlot().equalsIgnoreCase(implant.getSlot())) {
                System.out.println(" Помилка слота: Слот [" + implant.getSlot() + "] вже зайнятий імплантом '" + implants[i].getName() + "'!");
                return false;}
        }
        if (implantCount >= implants.length) {
            System.out.println(" Немає вільних слотів для імплантів!");
            return false;}

        implants[implantCount++] = implant;
        bioMonitor.reduceHumanity(implant.getHumanityCost());
        System.out.println(" Встановлено [" + implant.getSlot() + "]: " + implant.getName() + " (Людяність тепер: " + bioMonitor.getHumanity() + ")");
        return true;}

    public int getTotalAttack() {
        int sum = baseAttack;
        for (int i = 0; i < implantCount; i++) {
            sum += implants[i].getAttackBonus();}
        if (bioMonitor.isCyberpsychosis()) {
            sum = (int)(sum * 1.5);}
        return sum;}

    public int getTotalArmor() {
        int sum = 0;
        for (int i = 0; i < implantCount; i++) {
            sum += implants[i].getArmorBonus();}
        return sum;}

    public BioMonitor getBioMonitor() { return bioMonitor; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CyberMercenary{nick='").append(nickname)
                .append("', TotalATK=").append(getTotalAttack())
                .append(", TotalDEF=").append(getTotalArmor()).append("}\n");
        sb.append("  ├─ BioMonitor: ").append(bioMonitor.toString()).append("\n");
        sb.append("  └─ Встановлений Хром (").append(implantCount).append("/4):\n");
        for (int i = 0; i < implantCount; i++) {
            sb.append("       ").append(i + 1).append(". ").append(implants[i].toString()).append("\n");}
        return sb.toString();}
}





public class Task5CyberpunkRipperdocSim {
    public static void main(String[] args) {
        System.out.println("================ CYBERPUNK 2077: КЛІНІКА РІППЕРДОКА ================");
        CyberMercenary david = new CyberMercenary("Девід Мартінес", 120);
        System.out.println("Пацієнт прибув до клініки Віктора Вектора.\n");
        System.out.println("[ХІРУРГІЧНЕ ВСТАНОВЛЕННЯ ІМПЛАНТІВ]:");
        david.installImplant(new SandevistanOs());
        david.installImplant(new MantisBlades());
        david.installImplant(new MantisBlades());
        david.installImplant(new SubdermalTitaniumArmor());
        System.out.println("\n[ДОСЬЄ НАЙМАНЦЯ ПЕРЕД БОЄМ]:");
        System.out.println(david);
        System.out.println("---  БІЙ НА ВЕРШИНІ ARASAKA TOWER ПРОТИ АДАМА СМЕШЕРА️ ---");
        System.out.println(new SandevistanOs().activateSpecialAbility());
        System.out.println(new MantisBlades().activateSpecialAbility());
        int bossHp = 800;
        int damageDealt = david.getTotalAttack();
        bossHp -= damageDealt;
        System.out.println("" + "Девід Мартінес" + " завдає " + damageDealt + " шкоди! Адам Смешер втрачає HP. Залишок здоров'я боса: " + Math.max(0, bossHp));
        david.getBioMonitor().injectImmunoblockers(35);
        System.out.println("Введено Імуноблокатор! Людяність підвищено. Статус: " + (david.getBioMonitor().isCyberpsychosis() ? "Кіберпсихоз" : "Успішно стабілізовано!"));
        System.out.println("===========================================================================");}
}
