import java.util.Scanner;

public class Blos3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sistem1;
        do {
            System.out.println("\n1. Розпочати нову гру\n2. Завантажити збереження\n3. Налаштування\n0. Вихід\n");
            sistem1 = scanner.nextInt();

            switch (sistem1) {
                case 1:
                    System.out.println("Завантаження...");
                    break;
                case 2:
                    System.out.println("Збережня 1\n|    +    |\nЗбережня 2\n|    +    |\nЗбережня 3\n|    +    |\nЗбережня 3\n|    +    |\nвийти в меню");
                    break;
                case 3:
                    System.out.println("Звук (100%)\nграфіка (+| | )\nвийти в меню");
            }
        } while (sistem1 != 0);

        int age;
        do {
            System.out.println("\n\nведіть вік");
            age = scanner.nextInt();
        } while (age < 1 || age > 120);
        System.out.println("Вік підтврджено дякую за співпрацю\n\n");

        int corekt_PIN = 1234;
        int sprobn = 3;
        int zapnt;
        do {
            System.out.println("Ведіть ПІН-КОД");
            zapnt = scanner.nextInt();

            if (zapnt == corekt_PIN) {
                System.out.println("доступ надано");
                break;
            } else {
                sprobn--;
                System.out.println("помилка ведіть ще: увас ще " + sprobn + " спроб");
            }
        } while (sprobn > 0);
        System.out.println("карту заблоковано\n\n");

        char r;
        do {
            System.out.println("ведіть перше число");
            int a = scanner.nextInt();
            System.out.println("ведіть друге число");
            int b = scanner.nextInt();
            int cem = a + b;
            System.out.println("резлультат " + cem);
            System.out.println("бажає продожвити-Y");
            r = scanner.next().charAt(0);


        } while (r == 'y' || r == 'Y');
        System.out.println("Дякую за використання програми! Роботу завершено.\n\n");

        System.out.println("Ви хочете почати симлцію кубика\n1.да\nбудяке інще число.скіп");
        int coise = scanner.nextInt();
        if (coise == 1) {
            int cube1;
            int cube2;
            int rutur = 0;
            do {
                cube1 = (int) (Math.random() * 6) + 1;
                cube2 = (int) (Math.random() * 6) + 1;
                rutur++;
                System.out.println("кидок №" + rutur + " числа " + cube1 + " і " + cube1);
            } while (cube1 != cube2);
            System.out.println("успішно ви викинули дубль");
        } else {
            System.out.println("ви пропустили програму");
        }
        System.out.println();
        int b1;
        int a1;
        do {
            System.out.println("ведіть число 1: ");
            a1 = scanner.nextInt();
            System.out.println("ведіть число 2");
            b1 = scanner.nextInt();
            if (b1 != 0) {
                System.out.println(a1 / b1);
            }
        } while (b1 != 0);

        int bal;
        int com=0;
        int rat=0;

        do {

            do {
                System.out.println("ведіть бал від 1 до 100");
                bal = scanner.nextInt();
                if (bal > 100) {
                    System.out.println("неправльйно");
                }
            } while (bal > 100);

            if (bal >= 0) {
                com += bal;
                rat++;
            }

        } while (bal >= 0);
        if (rat > 0) {
            double average = (double) com / rat;
            System.out.println("\n Розрахунок завершено!");
            System.out.println("Кількість зданих тестів: " + rat);
            System.out.println("Середній бал студента: " + average);
        } else {
            System.out.println("Ви не ввели жодного правильного балу.");
        }
    }
}


