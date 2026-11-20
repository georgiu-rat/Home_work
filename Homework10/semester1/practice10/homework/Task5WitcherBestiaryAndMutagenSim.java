package semester1.practice10.homework;

interface FlyingMonster {
    boolean isAirborne();
    void knockDownToGround();
}

interface RegeneratingMonster {
    int getRegenPerTurn();
    void applyMoonDustBomb();
}

interface SpectralPhantom {
    boolean isIncorporeal();
    void bindWithYrdenCircle();
}
abstract class AbstractMonster {
    private final String name;
    private final String bestiaryCategory;
    protected int hp;
    protected final int maxHp;

    public AbstractMonster(String name, String bestiaryCategory, int maxHp) {
        this.name = name;
        this.bestiaryCategory = bestiaryCategory;
        this.maxHp = maxHp;
        this.hp = maxHp;
    }

    public String getName() { return name; }
    public String getBestiaryCategory() { return bestiaryCategory; }
    public int getHp() { return hp; }
    public int getMaxHp() { return maxHp; }

    public abstract int calculateMonsterAttack();
    public abstract String getBattleCry();

    public final boolean isAlive() {
        return hp > 0;
    }

    public void receiveDamage(int dmg) {
        this.hp = Math.max(0, this.hp - dmg);
    }

    @Override
    public String toString() {
        return String.format("%s [%s | HP: %d/%d]", name, bestiaryCategory, hp, maxHp);
    }
}

class RoyalGriffin extends AbstractMonster implements FlyingMonster {
    private boolean airborne = true;

    public RoyalGriffin(String name, int maxHp) {
        super(name, "Гібриди", maxHp);
    }

    @Override
    public int calculateMonsterAttack() { return 65; }

    @Override
    public String getBattleCry() { return "Кір-р-р! (Грифон розправляє могутні крила)"; }

    @Override
    public boolean isAirborne() { return airborne; }

    @Override
    public void knockDownToGround() {
        if (airborne) {
            airborne = false;
            System.out.println("[instanceof FlyingMonster] Ґеральт складає пальці у Знак ААРД! Грифона збито на землю!");
        }
    }
}

class Noonwraith extends AbstractMonster implements SpectralPhantom {
    private boolean incorporeal = true;

    public Noonwraith(String name, int maxHp) {
        super(name, "Примари", maxHp);
    }

    @Override
    public int calculateMonsterAttack() { return 45; }

    @Override
    public String getBattleCry() { return "Шипіння полуденниці у спекотному мареві..."; }

    @Override
    public boolean isIncorporeal() { return incorporeal; }

    @Override
    public void bindWithYrdenCircle() {
        if (incorporeal) {
            incorporeal = false;
            System.out.println("[instanceof SpectralPhantom] Ґеральт креслить на землі магічне коло Знаку ІРДЕН! Примару матеріалізовано!");
        }
    }
}

class HigherVampireDettlaff extends AbstractMonster implements FlyingMonster, RegeneratingMonster {
    private boolean airborne = true;
    private boolean regenBlocked = false;
    private final int regenRate = 120;

    public HigherVampireDettlaff(String name, int maxHp) {
        super(name, "Вампіри", maxHp);
    }

    @Override
    public int calculateMonsterAttack() { return 90; }

    @Override
    public String getBattleCry() { return "Ти не уявляєш сили справжньої крові, відьмаче!"; }

    @Override
    public boolean isAirborne() { return airborne; }

    @Override
    public void knockDownToGround() {
        if (airborne) {
            airborne = false;
            System.out.println("[instanceof FlyingMonster] Телекінетичний імпульс Аарду вириває вампіра з повітряного піке!");
        }
    }

    @Override
    public int getRegenPerTurn() {
        return regenBlocked ? 0 : regenRate;
    }

    @Override
    public void applyMoonDustBomb() {
        if (!regenBlocked) {
            regenBlocked = true;
            System.out.println("[instanceof RegeneratingMonster] Ґеральт підриває бомбу 'Місячний Пил'! Срібні ошурки блокують регенерацію вампіра!");
        }
    }
}

final class AncientLeshen extends AbstractMonster implements RegeneratingMonster {
    private boolean regenBlocked = false;

    public AncientLeshen(String name, int maxHp) {
        super(name, "Релікти", maxHp);
    }

    @Override
    public int calculateMonsterAttack() { return 80; }

    @Override
    public String getBattleCry() { return "Шум вікового лісу і тріск деревних коренів..."; }

    @Override
    public int getRegenPerTurn() { return regenBlocked ? 0 : 50; }

    @Override
    public void applyMoonDustBomb() {
        if (!regenBlocked) {
            regenBlocked = true;
            System.out.println("[instanceof RegeneratingMonster] Бомба 'Місячний Пил' зупиняє зв'язок лісовика з коренями земної регенерації!");
        }
    }
}
class WitcherHunter {
    private final String witcherName = "Ґеральт із Рівії";
    private final String school = "Школа Вовка";
    private final int silverSwordAtk = 220;

    public void displayProfile() {
        System.out.println("Мисливець: " + witcherName + " (" + school + " | Срібний меч: " + silverSwordAtk + " ATK)");
    }

    public void applyBestiaryTactics(AbstractMonster target) {
        System.out.println("\n--- КОНТРАКТ: " + target + " ---");
        System.out.println("Бойовий клич: \"" + target.getBattleCry() + "\"");

        if (target instanceof SpectralPhantom sp) {
            if (sp.isIncorporeal()) {
                System.out.println("Примара нематеріальна (поглинає 80% звичайних ударів).");
                sp.bindWithYrdenCircle();
            }
        }

        if (target instanceof FlyingMonster fm) {
            if (fm.isAirborne()) {
                System.out.println("Чудовисько ширяє в повітрі! Атака з землі неефективна.");
                fm.knockDownToGround();
            }
        }

        if (target instanceof RegeneratingMonster rm) {
            System.out.println("Увага: Істота володіє регенерацією (" + rm.getRegenPerTurn() + " HP/хід).");
            rm.applyMoonDustBomb();
        }
    }

    public final int executeSilverStrike(AbstractMonster target) {
        int strikeDamage = silverSwordAtk;

        if (target instanceof SpectralPhantom sp && sp.isIncorporeal()) {
            strikeDamage = (int)(strikeDamage * 0.2);
            System.out.println("Удар пройшов крізь примарну плоть! Завдано лише " + strikeDamage + " од. шкоди.");
        } else {
            System.out.println("[final executeSilverStrike] Потужний випад срібним мечем завдає " + strikeDamage + " шкоди!");
        }

        target.receiveDamage(strikeDamage);
        return strikeDamage;
    }
}





public class Task5WitcherBestiaryAndMutagenSim {
    public static void main(String[] args) {
        System.out.println("================ВІДЬМАК 3: БЕСТІАРІЙ ТА ПОЛІМОРФНЕ ПОЛЮВАННЯ================");
        WitcherHunter geralt = new WitcherHunter();
        geralt.displayProfile();

        AbstractMonster[] contracts = {
                new RoyalGriffin("Князь Облаків (Королівський Грифон)", 400),
                new Noonwraith("Полудниця з Білого Саду", 300),
                new HigherVampireDettlaff("Детлафф ван дер Ерека (Вищий Вампір)", 650),
                new AncientLeshen("Прадавній Дух Лісу (Ancient Leshen)", 500)
        };

        for (AbstractMonster monster : contracts) {
            geralt.applyBestiaryTactics(monster);
            geralt.executeSilverStrike(monster);

            if (monster.isAlive()) {
                System.out.println("Чудовисько вижило! Залишок здоров'я: " + monster.getHp() + "/" + monster.getMaxHp() + "\n");
            } else {
                System.out.println("Чудовисько переможене та зачищене з Континенту!\n");
            }
        }
        System.out.println("====================================================================================");
    }
}
