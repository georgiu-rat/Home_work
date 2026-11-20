import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("назвіть імя героя");
        String name_hero = scanner.nextLine();
        System.out.println("виберіть клас\n1 — Воїн (HP: 120, Сила: 15, Мана: 10, Спритність: 8)" +
                "\n2 — Маг (HP: 75, Сила: 6, Мана: 50, Спритність: 10)\n" +
                "3 — Розбійник (HP: 90, Сила: 10, Мана: 15, Спритність: 18)");
        int cohisi = scanner.nextInt();
        String clas;
        int hp, sreng, mana, agility;
        clas = switch (cohisi) {
            case 1 -> {
                hp = 120;
                sreng = 15;
                mana = 10;
                agility = 8;
                yield "Воїн";
            }
            case 2 -> {
                hp = 75;
                sreng = 6;
                mana = 50;
                agility = 10;
                yield "Маг";
            }
            case 3 -> {
                hp = 90;
                sreng = 10;
                mana = 15;
                agility = 18;
                yield "Розбійник";
            }
            default -> {
                hp = 60;
                sreng = 8;
                mana = 5;
                agility = 8;
                yield "Волоцюга";
            }
        };
        System.out.println("Чи знайшли ви магічну книгу заклинань під час подорожі? (так/ні)");
        String book = scanner.next().toLowerCase();
        boolean hasSpellBook = book.equals("так");
        System.out.println("Ваш вибір північ, схід або захід.");
        String a = scanner.nextLine().toLowerCase();
        String vorota = scanner.nextLine().toLowerCase();


        switch (vorota) {
            case "північ" -> {
                System.out.println("Кімната Стародавньої Загадки\nкристал загдав загадку 25*4\nваша відповідь");
                int ancer = scanner.nextInt();
                boolean corekt = (ancer == 100);
                hp = corekt ? (hp + 20) : (hp - 30);

                if (corekt) {
                    System.out.println("Кристал засяяв зеленим! Ви відновили HP. Поточне HP: " + hp);
                } else {
                    System.out.println("Кристал вдарив вас струмом! Поточне HP: " + hp);
                }
            }
            case "схід" -> {
                System.out.println("\n--- АРСЕНАЛ ТА ЗАЧИНЕНА СКРИНЯ ВАРТОВОГО ---");
                System.out.println("Ви знайшли скриню зі складним замком.");
                if (agility >= 16 || (mana >= 25 && hasSpellBook)) {
                    sreng += 10;
                    System.out.println("Ви успішно відкрили скриню, знайшли Предмет: Легендарний Меч Сила+ " + sreng);
                } else {
                    hp -= 25;
                    System.out.println(" пастка!  -25 HP. Поточне HP: " + hp);
                }
            }
            case "захід" -> {
                System.out.println("Оберіть тактику: 1 — Лобова атака(треба хп >= 100 і сила > = 15" +
                        "\n 2 — Магічний бар'єр(треба мани >= 45" +
                        "\n 3 — Спроба прослизнути повз(треба спитність >= 18");
                int taktik = scanner.nextInt();
                switch (taktik) {
                    case 1 -> {
                        if (sreng >= 15 && hp >= 100) {
                            System.out.println("You win");
                        } else {
                            hp -= 200;
                            System.out.println("You die");
                        }
                    }
                    case 2 -> {
                        if (mana >= 45) {
                            mana -= 45;
                            System.out.println("закалття  шит -45 мани");
                        } else {
                            hp -= 200;
                            System.out.println("недостань мани You die");
                        }
                    }
                    case 3 -> {
                        if (agility >= 18) {
                            System.out.println("ви успішно прослизнули");
                        } else {
                            hp -= 200;
                            System.out.println("You die");
                        }
                    }
                    default -> {
                        hp -= 200;
                        System.out.println("ви знадто довго думали і голем вас помітив You die");

                    }
                }

            }


        }

        if (hp < 0) {
            System.out.println("кінець");
        } else {
            System.out.println("/************************************************************\\\n" +
                    "|               ПРИГОДА: ВТЕЧА З ТЕМНИЦІ ЧАКЛУНА             |\n" +
                    "\\************************************************************/\n" +
                    "Введіть ім'я вашого героя: " + name_hero + "\n" +
                    "[Створено персонажа]: " + clas + " " + name_hero + " (HP: "+hp+", MP: "+mana+", AGL: "+agility+")\n" +
                    "Фінал: Ви знайшли таємний важіль і відкрили головні ворота!\n" +
                    " ВІТАЄМО! ВИ УСПІШНО ВИБРАЛИСЯ З ТЕМНИЦІ!\n" +
                    "\\************************************************************/");
        }
    }
    }