import java.util.Scanner;

public class bloc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("який день тиженя: число");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("1-Понеділо");
                break;
            case 2:
                System.out.println("2-Вівторок");
                break;
            case 3:
                System.out.println("3-Середа");
                break;
            case 4:
                System.out.println("4-Четвер");
                break;
            case 5:
                System.out.println("5-Пятниця");
                break;
            case 6:
                System.out.println("6-Субота");
                break;
            default:
                System.out.println("7-Неділя");
                break;
        }

        System.out.println("\n\nдні");
        int day1 = scanner.nextInt();
        switch (day1) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("будні");
                break;
            case 6:
            case 7:
                System.out.println("вихідні");
                break;
        }


        System.out.println("\n\nмісяць від 1 до 12");
        int mouns = scanner.nextInt();
        int days = switch (mouns) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };
        if (days == 0) {
        System.out.println("Помилка! Місяця з таким номером не існує.");
        } else {
            System.out.println("У цьому місяці " + days + " днів.");
        }

        System.out.println("\n\nВедіть місяць");
        String mor = scanner.nextLine();
        String mour = scanner.nextLine();
        String season = switch (mour){
            case "грудень", "січень", "лютий"    -> "Зима";
            case "березень", "квітень", "травень" -> "Весна";
            case "червень", "липень", "серпень"  -> "Літо";
            case "вересень", "жовтень", "листопад" -> "Осінь";
            default                               -> "Невідомий місяць";

        };
        System.out.println("Пора року: " + season);

        System.out.println("\n\nОберіть спосіб доставки (1 — Самовивіз, 2 — Кур'єр, 3 — Поштомат):");
        int tipe = scanner.nextInt();

        System.out.println("Введіть вагу товару (в кг):");
        int vaig = scanner.nextInt();
        int hina = switch (tipe){
            case 1 -> 0;
            case 2 -> {
                if (vaig > 5){
                    yield 150;
                }else {
                    yield 90;
                }
            }
            case 3 -> 60;
            default -> -1;
        };
        System.out.println(hina);



        System.out.println("\n\nвиведіть цифру1");
        double a = scanner.nextDouble();
        System.out.println("один символ (- + * / )");
        char co = scanner.next().charAt(0);
        System.out.println("виведіть цифру2");
        double b = scanner.nextDouble();
        boolean eror = false;
        double result = switch (co){
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) {
                    System.out.println("eror");
                    eror = true;
                    yield 0;
                } else {
                    yield  a/b;
                }
            }
            default -> {
                System.out.println("Помилка: Некоректна операція!");
                eror = true;
                yield 0;
            }
        };
        System.out.println(result);












    }
    }
