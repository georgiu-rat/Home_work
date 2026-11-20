import java.util.Scanner;

public class Task5AnimeHeroBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Asta asta = new Asta();

        String bossName = "Патри (Маг Світла)";
        int bossMaxHp = 1200;
        int bossHp = 1200;
        int round = 1;

        System.out.println("================ ⚔️ АРЕНА КОРОЛІВСТВА КОНЮШИНИ ⚔️ ================");
        System.out.println("Бос: " + bossName + " [HP: " + bossHp + " / " + bossMaxHp + "]");

        while (asta.isAlive() && bossHp > 0) {
            System.out.println("\n--- Раунд " + round + " ---");
            asta.showStatus();
            System.out.println("Бос " + bossName + " [HP: " + bossHp + " / " + bossMaxHp + "]");

            System.out.println("\nОберіть дію Асти:");
            System.out.println("[1] Удар мечем Демоноборця (+20 енергії)");
            System.out.println("[2] Застосувати суперздібність (навички)");
            System.out.println("[3] Захисна стійка мечем (знижує вхідний урон)");
            System.out.println("[4] Переглянути статус");
            System.out.print("Ваш вибір: ");
            int choice = scanner.nextInt();
            boolean playerActed = true;
            int damageToBoss = 0;
            switch (choice) {
                case 1:
                    damageToBoss = asta.basicSwordAttack();
                    System.out.println("Аста розсікає простір мечем Демоноборця! Завдано " + damageToBoss + " шкоди.");
                    bossHp -= damageToBoss;
                    break;
                case 2:
                    String[] skills = asta.getSkills();
                    System.out.println("\nДоступні навички:");
                    for (int i = 0; i < skills.length; i++) {
                        System.out.println("[" + i + "] " + skills[i]);
                    }
                    System.out.print("Введіть номер навички (0-3): ");
                    int skillIdx = scanner.nextInt();
                    damageToBoss = asta.useSkill(skillIdx);
                    if (damageToBoss > 0) {
                        bossHp -= damageToBoss;
                        System.out.println("Атака навичкою успішна! Завдано " + damageToBoss + " шкоди босу.");
                    }
                    break;
                case 3:
                    System.out.println("Аста застигає у захисній стійці, готуючись відбити ворожу магію.");
                    break;
                case 4:
                    System.out.println("Інформацію про статус виведено вище. Хід на роздуми пропускається.");
                    playerActed = false;
                    break;
                default:
                    System.out.println("Невірний вибір! Ви втрачаєте хід.");
                    break;
            }
            if (bossHp <= 0) {
                bossHp = 0;
                break;
            }
            if (playerActed) {
                int bossDmg = 80 + (int) (Math.random() * 40);
                if (choice == 3) {
                    bossDmg /= 2;
                }
                System.out.println("\nПатри атакує «Променями Покарання Світла»!");
                asta.takeDamage(bossDmg);
            }

            round++;
        }

        System.out.println("\n==================================================");
        if (asta.isAlive()) {
            System.out.println("ПЕРЕМОГА! Аста переміг Патри та врятував Королівство Конюшини!");
        } else {
            System.out.println("ПОРАЗКА... Патри виявився сильнішим, але воля Асти не згасла.");
        }

        scanner.close();
    }
        }