class DungeonEntity {
        private String name;
        private int level;
        protected int hp;
        protected int maxHp;
        protected int baseAttack;
        protected int defense;

        public DungeonEntity(String name, int level, int maxHp, int baseAttack, int defense) {
            this.name = name;
            this.level = level;
            this.maxHp = Math.max(1, maxHp);
            this.hp = this.maxHp;
            this.baseAttack = Math.max(0, baseAttack);
            this.defense = Math.max(0, defense);
        }

        public int takeDamage(int rawDamage) {
            int actual = Math.max(5, rawDamage - defense);
            hp = Math.max(0, hp - actual);
            return actual;
        }

        public int performAttack() {
            return baseAttack;
        }

        public boolean isAlive() {
            return hp > 0;
        }

        protected String buildHealthBar() {
            int totalSegments = 10;
            int filled = (int) Math.round((double) hp / maxHp * totalSegments);
            filled = Math.max(0, Math.min(totalSegments, filled));
            StringBuilder bar = new StringBuilder("[");
            for (int i = 0; i < filled; i++) bar.append("█");
            for (int i = filled; i < totalSegments; i++) bar.append("░");
            bar.append("]");
            return bar.toString();
        }

        public String getName() { return name; }
        public int getLevel() { return level; }
        public int getHp() { return hp; }

        @Override
        public String toString() {
            return String.format("DungeonEntity{name='%s', lvl=%d, HP=%s %d/%d, ATK=%d, DEF=%d}",
                    name, level, buildHealthBar(), hp, maxHp, baseAttack, defense);
        }
    }
class Hunter extends DungeonEntity {
    private char rank;
    protected int mana;
    protected int maxMana;

    public Hunter(String name, int level, int maxHp, int baseAttack, int defense, char rank, int maxMana) {
        super(name, level, maxHp, baseAttack, defense);
        this.rank = rank;
        this.maxMana = Math.max(10, maxMana);
        this.mana = this.maxMana;
    }

    public int useManaSkill(String skillName, int manaCost, double multiplier) {
        if (mana >= manaCost) {
            mana -= manaCost;
            System.out.println("Використано навичку [" + skillName + "] (-" + manaCost + " MP)");
            return (int) (performAttack() * multiplier);
        } else {
            System.out.println("Недостатньо мани для " + skillName + "!");
            return performAttack();
        }
    }

    @Override
    public String toString() {
        return String.format("Hunter{%s | Ранг: [%c] | MP: %d/%d}",
                super.toString(), rank, mana, maxMana);
    }
}
class DungeonBoss extends DungeonEntity {
    private String bossTitle;
    private boolean enraged;

    public DungeonBoss(String name, int level, int maxHp, int baseAttack, int defense, String bossTitle) {
        super(name, level, maxHp, baseAttack, defense);
        this.bossTitle = bossTitle;
        this.enraged = false;
    }

    @Override
    public int takeDamage(int rawDamage) {
        int actual = super.takeDamage(rawDamage);
        if (isAlive() && (double) hp / maxHp <= 0.4 && !enraged) {
            enraged = true;
            System.out.println("\nБОС " + getName() + " ВПАДАЄ У ФАЗУ ЛЮТІ! Атака зросла на 50%!\n");
        }
        return actual;
    }

    @Override
    public int performAttack() {
        if (enraged) {
            return (int) (super.performAttack() * 1.5);
        }
        return super.performAttack();
    }

    @Override
    public String toString() {
        return String.format("DungeonBoss{%s | Титул: '%s', Лють: %b}",
                super.toString(), bossTitle, enraged);
    }
}
class ShadowMonarch extends Hunter {
    private String[] shadowNames = new String[5];
    private int[] shadowBonuses = new int[5];
    private int shadowCount = 0;

    public ShadowMonarch(String name, int level, int maxHp, int maxMana, int baseAttack, int defense) {
        super(name, level, maxHp, baseAttack, defense, 'S', maxMana);
    }

    public boolean arise(String shadowName, int bonusAtk) {
        if (mana < 30) {
            System.out.println(" Замало мани для заклику (потрібно 30 MP)!");
            return false;
        }
        if (shadowCount >= shadowNames.length) {
            System.out.println(" Ліміт тіньового легіону вичерпано (5/5)!");
            return false;
        }
        mana -= 30;
        shadowNames[shadowCount] = shadowName;
        shadowBonuses[shadowCount] = bonusAtk;
        shadowCount++;
        System.out.println(" Тінь [" + shadowName + " (+" + bonusAtk + " ATK)] приєдналася до легіону! (Тіней: " + shadowCount + "/5)");
        return true;
    }

    public int getTotalShadowBonus() {
        int total = 0;
        for (int i = 0; i < shadowCount; i++) {
            total += shadowBonuses[i];
        }
        return total;
    }

    @Override
    public int performAttack() {
        return super.performAttack() + getTotalShadowBonus();
    }

    public void levelUp() {
        System.out.println("\n [СИСТЕМА]: РІВЕНЬ ПІДВИЩЕНО!");
        maxHp += 150;
        hp = maxHp;
        maxMana += 50;
        mana = maxMana;
        baseAttack += 25;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("  👥 Тіньовий Легіон (").append(shadowCount).append("/5): ");
        if (shadowCount == 0) {
            sb.append("[Легіон порожній]");
        } else {
            sb.append("[");
            for (int i = 0; i < shadowCount; i++) {
                sb.append((i + 1)).append(". ").append(shadowNames[i]).append(" (+").append(shadowBonuses[i]).append(" ATK)");
                if (i < shadowCount - 1) sb.append(", ");
            }
            sb.append("]");
        }
        sb.append(" | Сумарний бонус тіней: +").append(getTotalShadowBonus()).append(" ATK");
        return sb.toString();
    }
}
class Task5ShadowMonarchRpg {
    public static void main(String[] args) {
        System.out.println("================ ⚔️ SOLO LEVELING: ПІДЗЕМЕЛЛЯ S-РАНГУ ⚔️ ================\n");

        ShadowMonarch jinwoo = new ShadowMonarch("Сон Джін-Ву", 45, 1200, 300, 180, 45);
        DungeonBoss beru = new DungeonBoss("Король Мурах Беру", 80, 2500, 260, 60, "Кошмар Острова Чеджу");

        System.out.println("[ДОСЬЄ МИСЛИВЦЯ]:\n" + jinwoo + "\n");
        System.out.println("[БОС КАМЕРИ]:\n" + beru + "\n");

        System.out.println("--- ПОЧАТОК БОЮ ---");

        int skillDmg = jinwoo.useManaSkill("Кінджал Навченого Вбивці", 40, 1.8);
        int dealt1 = beru.takeDamage(skillDmg);
        System.out.println("🗡Сон Джін-Ву завдає " + dealt1 + " шкоди Босу!");
        System.out.println("   Залишок HP Боса: " + beru.getHp() + "/2500 " + beru.buildHealthBar() + "\n");

        int bossDmg = beru.performAttack();
        int taken = jinwoo.takeDamage(bossDmg);
        System.out.println("Бос Беру контратакує і завдає " + taken + " шкоди Джін-Ву!");
        System.out.println("   Залишок HP Джін-Ву: " + jinwoo.getHp() + "/1200 " + jinwoo.buildHealthBar() + "\n");

        System.out.println("--- КУЛЬМІНАЦІЯ РЕЙДУ ---");
        System.out.println("⚡ Сон Джін-Ву завдає фатального удару та використовує заклинання некромантії!");
        System.out.println("⚡ Сон Джін-Ву закликає тінь ворога: «ПОВСТАНЬ! (ARISE!)»");

        jinwoo.arise("Лицар Ігріс", 90);
        jinwoo.levelUp();

        System.out.println("\n[ОНОВЛЕНЕ ДОСЬЄ МИСЛИВЦЯ ПІСЛЯ ПЕРЕМОГИ]:\n" + jinwoo);
        System.out.println("=========================================================================");
    }
}
