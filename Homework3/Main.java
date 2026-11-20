import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================================================\n" + "           ⭐ BRAWL STARS: BOSS FIGHT ⭐\n" + "======================================================\n" + "Оберіть свого бійця:\n" + "1. Шеллі (Shelly)     - HP: 4000 | Атака: 1200 | Супер: 2800\n" + "2. Кольт (Colt)       - HP: 3000 | Атака: 1600 | Супер: 3600\n" + "3. Ель Прімо (Primo)  - HP: 6000 | Атака: 1100 | Супер: 2200\n" + "Ваш вибір (1-3): \n");
        int coise1 = scanner.nextInt();
        int maxHP_Player;
        int HP_Player;
        int attackDamage;
        int superDamage;
        String brawlerName;

        switch (coise1) {
            case 1:
                brawlerName = "Шеллі (Shelly)";
                maxHP_Player = 4000;
                attackDamage = 1200;
                superDamage = 2800;
                break;
            case 2:
                brawlerName = "Кольт (Colt)";
                maxHP_Player = 3000;
                attackDamage = 1600;
                superDamage = 3600;
                break;
            case 3:
                brawlerName = "Ель Прімо (El Primo)";
                maxHP_Player = 6000;
                attackDamage = 1100;
                superDamage = 2200;
                break;
            default:
                System.out.println("Невірний вибір! Автоматично обрано Шеллі.");
                brawlerName = "Шеллі (Shelly)";
                maxHP_Player = 4000;
                attackDamage = 1200;
                superDamage = 2800;
        }
        HP_Player = maxHP_Player;

        int maxbossHP = 10000;
        int bossHp = maxbossHP;
        int baseBossDamage = 700;
        int ammo = 3;
        double superCharge = 0.0;
        double damageMultiplier = 1.0;
        int roundCount = 0;
        boolean bossStunned = false;
        boolean nextBossAttackReduced = false;
        System.out.println("\nБій розпочинається! Ваш боєць: " + brawlerName);
        while (HP_Player > 0 && bossHp > 0) {
            roundCount++;
            System.out.println("\n-----------------------------------------");
            System.out.println("РАУНД " + roundCount);
            if (ammo < 3) {
                ammo++;
            }
            int playerBars = (int) (((double) HP_Player / maxHP_Player) * 10);
            if (playerBars < 0) playerBars = 0;
            System.out.print(brawlerName + " HP [" + HP_Player + "/" + maxHP_Player + "]: ");
            for (int i = 0; i < 10; i++) {
                if (i < playerBars) {
                    System.out.print("█");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println();
            int bossBars = (int) (((double) bossHp / maxbossHP) * 10);
            if (bossBars < 0) bossBars = 0;
            System.out.print("Робо-Бос HP [" + bossHp + "/" + maxbossHP + "]: ");
            for (int i = 0; i < 10; i++) {
                if (i < bossBars) {
                    System.out.print("█");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println();
            System.out.println("Статус: Набої (Ammo): " + ammo + "/3 | Супер: " + (int) (superCharge * 100) + "%");
            System.out.println("\nОберіть дію:\n1 - Основна атака\n2 - СУПЕР (Ульта)" + (superCharge >= 1.0 ? " [ГОТОВО!]" : " [Недоступно]"));
            System.out.println("3 - Захисний маневр і перезарядка (+2 набої, +15% HP)\n4 - Ризик: пошук Енергетичного куба (Power Cube)");
            System.out.print("Ваш вибір: ");
            int coise2 = scanner.nextInt();
            boolean Player_xid_end = true;

            switch (coise2) {
                case 1:
                    // Основна атака
                    if (ammo >= 1) {
                        ammo--;
                        int currentAttack = (int) (attackDamage * damageMultiplier);
                        bossHp -= currentAttack;
                        superCharge += 0.35; // +35% до заряду ульти
                        if (superCharge > 1.0) superCharge = 1.0;
                        System.out.println("Ви завдали " + currentAttack + " шкоди робо-босу!");
                    } else {
                        System.out.println("Немає набоїв! Хід втрачено через перезарядку.");
                    }
                    break;

                case 2:
                    // Суперздібність (Ульта)
                    if (superCharge >= 1.0) {
                        int currentSuper = (int) (superDamage * damageMultiplier);
                        bossHp -= currentSuper;
                        superCharge = 0.0; // Скидаємо заряд
                        System.out.println("ВИ ВИКОРИСТАЛИ СУПЕР! Завдано колосальної шкоди: " + currentSuper);

                        // Особливі ефекти суперів
                        if (coise1 == 1) {
                            nextBossAttackReduced = true;
                            System.out.println("Шеллі відкинула боса! Його наступна атака зменшена на 50%.");
                        } else if (coise1 == 3) {
                            bossStunned = true;
                            System.out.println("Ель Прімо оглушив боса! Він пропустить наступний хід.");
                        }
                    } else {
                        System.out.println("Супер ще не готовий! Потрібно 100% заряду.");
                        Player_xid_end = false;
                    }
                    break;

                case 3:
                    ammo += 2;
                    if (ammo > 3) ammo = 3;
                    int healAmount = (int) (maxHP_Player * 0.15);
                    HP_Player += healAmount;
                    if (HP_Player > maxHP_Player) HP_Player = maxHP_Player;
                    System.out.println("Ви зайняли захисну позицію: відновлено набої та регенеровано " + healAmount + " HP.");
                    break;

                case 4:
                    if (Math.random() < 0.6) {
                        damageMultiplier += 0.15;
                        System.out.println("Успіх! Ви знайшли Енергетичний куб (+15% до всієї шкоди назавжди).");
                    } else {
                        System.out.println("Невдача... Енергетичного куба не виявилося поблизу.");
                    }
                    break;

                default:
                    System.out.println("Невідома дія! Ви втратили хід.");
            }
            if (!Player_xid_end) {
                continue;
            }
            if (bossHp <= 0) {
                break;
            }
            if (bossStunned) {
                System.out.println("\nРобо-Бос оглушений і пропускає цей хід!");
                bossStunned = false;
            } else {
                double bossHpPercentage = ((double) bossHp / maxbossHP) * 100;
                int currentBossDamage = baseBossDamage;

                if (bossHpPercentage > 60) {
                    System.out.println("\nРобо-Бос у нормальній фазі.");
                } else if (bossHpPercentage >= 30) {
                    currentBossDamage = (int) (currentBossDamage * 1.3);
                    System.out.println("\nФаза ANGRY! Робо-Бос червоніє, його шкода зростає на 30% (" + currentBossDamage + ").");
                } else {
                    currentBossDamage = (int) (currentBossDamage * 1.7);
                    System.out.println("\nENRAGED / GOD MODE! Робо-Бос шаленіє, шкода зростає на 70% (" + currentBossDamage + ").");
                }
                if (nextBossAttackReduced) {
                    currentBossDamage = (int) (currentBossDamage * 0.5);
                    System.out.println("Завдяки суперу Шеллі, атака боса була зменшена вдвічі і склала " + currentBossDamage + "!");
                    nextBossAttackReduced = false;
                }
                if (Math.random() < 0.15) {
                    System.out.println("Ви блискавично виконали кувирок і УХИЛИЛИСЯ від атаки Робо-Боса!");
                } else {
                    HP_Player -= currentBossDamage;
                    System.out.println("Робо-Бос атакує і завдає вам " + currentBossDamage + " шкоди!");
                }
            }
        }
        System.out.println("\n=========================================");
        if (HP_Player > 0) {
            System.out.println("ПЕРЕМОГА! Ви зупинили залізного гіганта за " + roundCount + " раундів!");
            System.out.println("Нагорода: +10 Трофеїв 🏆, 100 Starr Drops!");
        } else {
            System.out.println("ПОРАЗКА! Сейф зруйновано, а ваш боєць зазнав поразки...");
        }
        System.out.println("=========================================");

        scanner.close();
    }

}
