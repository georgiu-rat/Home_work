import java.util.Scanner;

public class Blos5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int y = 1; y <= 10; y++) {
            for (int x = 1; x <= 10; x++) {
                int hamber = y * x;
                System.out.printf("%-4d", hamber);
            }
            System.out.println();
        }
        System.out.println("\n\nЗавдання 37: Прямокутна рамка із символів\nведіть висоту");
        int h = scanner.nextInt();
        System.out.print("Введіть ширину: ");
        int w = scanner.nextInt();
        for (int y1 = 1; y1 <= h; y1++) {
            for (int x1 = 1; x1 <= w; x1++) {
                if (y1 == 1 || y1 == h || x1 == 1 || x1 == w) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n\nЗавдання 38: Прямокутний трикутник\nведіть висоту трикутника");
        int dd = scanner.nextInt();
        for (int row = 1; row <= dd; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\nЗавдання 40: Консольна шахівниця\nведіть висоту");
        int w3 = scanner.nextInt();
        System.out.println("ведіть ширину");
        int h3 = scanner.nextInt();
        for (int y2 = 1; y2 <= w3; y2++) {
            for (int x2 = 1; x2 <= h3; x2++) {
                System.out.printf("# _ ");
            }
            System.out.println();

        }
    }
}


