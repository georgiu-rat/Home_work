import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        ;
        numbers[1] = 10;
        numbers[2] = 30;
        numbers[numbers.length - 1] = 50;
        System.out.println("\n" + Arrays.toString(numbers) + "\n\n");

        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        System.out.println("Загальна кількість днів: " + days.length);
        System.out.println("Перший день: " + days[0]);
        System.out.println("Останній день: " + days[days.length - 1]);
        days[5] = "Вихідний (Сб)";
        days[6] = "Вихідний (Нд)";
        System.out.println("Оновлений список днів: " + Arrays.toString(days) + "\n\n");

        double[] prices = {120.50, 45.00, 890.99, 15.30, 420.00};
        System.out.println(Arrays.toString(prices));
        prices[2] = prices[2] * 0.8;
        System.out.println(Arrays.toString(prices) + "\n\n");

        System.out.println("Завдання 4: Заповнення масиву числами від 1 до N\nведіть число");
        int n = scanner.nextInt();
        int[] nam = new int[n];
        for (int na = 0; na < n; na++) {
            nam[na] = na + 1;
        }
        System.out.println(Arrays.toString(nam) + "\n\n");

        int[] namb = {4, 8, 15, 16, 23, 42};
        for (int sr = namb.length - 1; sr > 0; sr--) {
            System.out.print(namb[sr] + " ");
        }
        int[] nambe = new int[10];
        int namber = 0;
        for (int na = 1; na < numbers.length; na++) {
            numbers[na] = numbers[na - 1] * 2;
        }

        System.out.println("\n\n");
        int[] original = {3, 7, 1, 9, 4};
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        copy[0] = 999;
        System.out.println("Original масив: " + Arrays.toString(original));
        System.out.println("Copy масив:     " + Arrays.toString(copy) + "\n\n");

        int[] grades = {95, 84, 70, 99, 65, 88, 92};
        int c = 0;
        int c1 = 0;
        for (int a1 = 1; a1 < grades.length; a1++) {
            c = c + grades[a1];
            c1 = c / a1;
        }
        System.out.println("сума " + c + " середній бал " + c1 + "\n\n");

        int[] temps = {18, 21, 15, 24, 13, 27, 20};
        int min = temps[0];
        int max = temps[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > max) {
                max = temps[i];
                maxIndex = i;
            }
            if (temps[i] < min) {
                min = temps[i];
                minIndex = i;
            }
        }
        System.out.println("мінімальна темперара " + min + " була " + minIndex + " дня");
        System.out.println("маскимальна темперара " + max + " була " + maxIndex + " дняn\n\n");

        int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};
        int plus = 0;
        int minus = 0;
        int zero = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                plus++;
            } else if (data[i] < 0) {
                minus++;
            } else {
                zero++;
            }
        }
        System.out.println("Кількість додатних елементів (> 0): " + plus);
        System.out.println("Кількість від'ємних елементів (< 0): " + minus);
        System.out.println("Кількість нульових значень (== 0): " + zero);

        int[] non = new int[10];
        int pozitiv = 0;
        int negativ = 0;
        for (int i = 0; i < non.length; i++) {
            non[i] = (int) (Math.random() * 100);
            if (non[1] % 2 == 0) {
                pozitiv += non[i];
            } else {
                negativ += non[i];
            }
        }
        System.out.println("парне " + pozitiv);
        System.out.println("не парне " + negativ);

        System.out.println("\n\nЗавдання 12: Лінійний пошук елемента\nведіть число");
        int co = scanner.nextInt();
        int[] students = {1042, 2031, 3055, 4018, 5099};
        boolean isFound = false;
        int foundIndex = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == co) {
                isFound = true;
                foundIndex = i;
                break;
            }
        }
        if (isFound) {
            System.out.println("ваша позиція " + foundIndex);
        } else {
            System.out.println("такого студента немає");
        }

        int[] rolls = {3, 6, 2, 6, 1, 4, 6, 5, 2, 6};

        System.out.print("\n\nЗавдання 13: Підрахунок кількості входжень\nВведіть число від 1 до 6, яке хочете порахувати: ");
        int userNumber = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i] == userNumber) {
                count++;
            }
        }
        System.out.println("Число " + userNumber + " випало стільки разів: " + count + "\n\n");

        int[] zar = {18000, 25000, 32000, 15000, 41000, 29000};
        int cfm = 0;
        int cer = 0;
        for (int a1 = 1; a1 < zar.length; a1++) {
            cfm += zar[a1];
            cer = cfm / a1;
        }for (int i=0;i<zar.length;i++){
            if (zar[i]>cer){
                System.out.println(zar[i]+" грн");
            }
        }

        System.out.println("\n");
        double[] price = {42.5, 41.8, 44.1, 40.9, 43.6, 45.0};
        double min1 = prices[0];
        double max1 = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max1) {
                max1 = prices[i];
            }
            if (prices[i] < min1) {
                min1 = prices[i];
            }
        }
        double difference = max1 - min1;
        System.out.printf("Різниця між макс. і мін.: %.2f%n", difference);    }
}


