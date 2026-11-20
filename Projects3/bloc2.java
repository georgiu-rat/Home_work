import java.util.Scanner;

public class bloc2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int namber3 = scanner.nextInt();
        System.out.println((namber3 == 0) ? "0" : (namber3 > 0) ? "+\n\n" : "-\n\n");

        System.out.println("Введіть число: ");
        int gfh = scanner.nextInt();
        if (gfh == 0) {
            System.out.println("це нуль");
            System.out.println(gfh);
        } else if (gfh % 2 == 0) {
            System.out.println("парне");
        } else {
            System.out.println("не парне");
        }
        System.out.println("\n\n");

        System.out.println("Вік");
        int arg = scanner.nextInt();
        if (arg < 0 || arg > 120) {
            System.out.println("Некоректний вік");
        } else if (arg >= 0 && arg <= 12) {
            System.out.println("Дитина");
        } else if (arg >= 13 && arg <= 17) {
            System.out.println("Підліток");
        } else if (arg >= 18 && arg <= 64) {
            System.out.println("Дорослий");
        } else if (arg < 64) {
            System.out.println("Пенсіонер");
        }
        System.out.println("\n");


        System.out.println("оцінка");
        int code = scanner.nextInt();
        if (code < 0 || arg > 100) {
            System.out.println("Помилка: Некоректний бал");
        } else if (code >= 90) {
            System.out.println("А");
        } else if (code >= 82 && code <= 99) {
            System.out.println("B");
        } else if (code >= 74 && code <= 81) {
            System.out.println("C");
        } else if (code >= 64 && code <= 73) {
            System.out.println("D");
        } else if (code >= 60 && code <= 63) {
            System.out.println("E");
        } else if (code >= 0 && code <= 59) {
            System.out.println("F");
        }
        System.out.println("\n");


        System.out.println("Введіть 3 числа: ");
        int frea = scanner.nextInt();
        int freb = scanner.nextInt();
        int frec = scanner.nextInt();
        System.out.println("Мінімум: " + Math.min(frea, Math.min(freb, frec)));
        System.out.println("Максимум: " + Math.max(frea, Math.max(freb, frec)));
        System.out.println("\n\n");

        System.out.println("кординати");
        double x_nata = scanner.nextDouble();
        double y_nata = scanner.nextDouble();
        System.out.print("Точка (" + x_nata + "; " + y_nata + ") ");

        if (x_nata == 0 && y_nata == 0) {
            System.out.println("знаходиться в початку координат (0, 0).");
        } else if (x_nata == 0) {
            System.out.println("лежить на осі Y.");
        } else if (y_nata == 0) {
            System.out.println("лежить на осі X.");
        } else if (x_nata > 0 && y_nata > 0) {
            System.out.println("знаходиться у I чверті.");
        } else if (x_nata < 0 && y_nata > 0) {
            System.out.println("знаходиться у II чверті.");
        } else if (x_nata < 0 && y_nata < 0) {
            System.out.println("знаходиться у III чверті.");
        } else {
            System.out.println("знаходиться у IV чверті.\n\n");
        }

        int x = 5;
        int y = 20;

        if (x > 10) {
            if (y > 10) {
                System.out.println("y > 10");
            }
        } else {
            System.out.println("\n\nx <= 10\n\n");
        }

        System.out.print("Спожито: ");
        int enery = scanner.nextInt();
        double kvm;
        if (enery <= 100){
            kvm = enery * 2.64;
        }
        else {
            double kvm2 = enery-100;
            kvm = ((100*2.64) + kvm2*4.32);
        }
        System.out.println("Сума до сплати: " + kvm + " грн\n\n");













    }
}