public class Asta {
    private String name = "Аста";
    private int maxHp = 1000;
    private int hp = 1000;
    private int antiMagicEnergy = 0;
    private int baseAttack = 120;
    private int defense = 35;
    private boolean isBlackFormActive = false;
    private boolean limitPushed = false;
    private String[] skills = {
            "Удар Демоноборця",
            "Чорний Ураган",
            "Метеорит Демона",
            "Форма Чорного Демона"
    };

    public void showStatus() {
        double percent = (double) hp / maxHp * 100;
        int filled = (int) (percent / 10);
        StringBuilder healthBar = new StringBuilder("[");
        for (int i = 0; i < 10; i++) {
            if (i < filled) {
                healthBar.append("█");
            } else {
                healthBar.append(".");
            }
        }
        healthBar.append(String.format("] (%.0f%%)", percent));

        System.out.println("Герой: " + name + " | HP: " + hp + "/" + maxHp + " " + healthBar);
        System.out.println("Антимагія: [ " + antiMagicEnergy + " / 100 ] | Чорна форма: " + (isBlackFormActive ? "АКТИВНА" : "неактивна"));
    }

    public int basicSwordAttack() {
        int damage = baseAttack;
        if (isBlackFormActive) {
            damage *= 2;
        }
        antiMagicEnergy = Math.min(100, antiMagicEnergy + 20);
        return damage;
    }

    public int useSkill(int skillIndex) {
        if (skillIndex < 0 || skillIndex >= skills.length) {
            System.out.println("Невірний індекс навички!");
            return 0;
        }
        int cost = 0;
        int damage = 0;
        switch (skillIndex) {
            case 0:
                cost = 25;
                damage = 220;
                break;
            case 1:
                cost = 50;
                damage = 380;
                break;
            case 2:
                cost = 75;
                damage = 550;
                break;
            case 3:
                cost = 100;
                damage = 0;
                break;
        }
        if (antiMagicEnergy < cost) {
            System.out.println("Недостатньо енергії антимагії! Потрібно " + cost + ", а є " + antiMagicEnergy + ".");
            return 0;
        }
        antiMagicEnergy -= cost;
        if (skillIndex == 3) {
            isBlackFormActive = true;
            hp = Math.min(maxHp, hp + 300);
            System.out.println("Аста активує Форму Чорного Демона! Відновлено 300 HP, силу всіх атак подвоєно!");
            return 0;
        }
        if (isBlackFormActive) {
            damage *= 2;
        }
        return damage;
    }
    public void takeDamage(int incomingDmg) {
        int realDmg = incomingDmg - defense;
        if (realDmg < 15) {
            realDmg = 15;
        }
        hp -= realDmg;
        if (hp < 0) {
            hp = 0;
        }
        System.out.println("Меч частково блокує магію! Аста отримує " + realDmg + " чистої шкоди.");
        pushLimits();
    }
    public void pushLimits() {
        if (!limitPushed && hp > 0 && (double) hp / maxHp < 0.25) {
            limitPushed = true;
            hp = Math.min(maxHp, hp + 150);
            antiMagicEnergy = Math.min(100, antiMagicEnergy + 50);
            System.out.println("\n✨ «Моя магія — ніколи не здаватися!» Аста долає межу своїх можливостей! Відновлено 150 HP та додано 50 очок антимагії!");
        }
    }
    public boolean isAlive() {
        return hp > 0;
    }
    public String[] getSkills() {
        return skills;
    }
}