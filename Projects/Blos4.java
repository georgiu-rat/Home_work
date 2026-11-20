import java.util.Scanner;
public class Blos4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Початок");
        int a = scanner.nextInt();
        System.out.println("Кінець");
        int b = scanner.nextInt();
        if (a % 2 != 0) {
            a++; // 7 перетвориться на 8
        }

        for (int i = a; i <= b; i += 2) {
            System.out.print(i + "|");

        }

        System.out.println("\n\n№22 ведіть число яке стане факторіалом");
        int ar = scanner.nextInt();
        long far = 1;
        for (int i = ar; i >= 1; i--) {
            far = far * i;
        }
        System.out.println(far);


        System.out.println("\n\nЗавдання 23: Таблиця кубів та квадратів");
        for (int w = 1; w <= 10; w++) {
            System.out.printf("|%-4d|%-4d|%-4d|\n", w, (w * w), (w * w * w));
        }
        System.out.println("\n\nЗавдання 24: Фільтрація чисел за допомогою continue");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            System.out.print(i + " ");
        };
        System.out.println("\n\nЗавдання 25: Пошук першого кратного числа та break");
        for(int ir =100; ir <= 200; ir++){
            if (ir % 13 ==0 && ir % 7 == 0){
                System.out.println(ir+" ");
                break;
            }

        }
        System.out.println("\n\nЗавдання 26: Виведення латинського алфавіту (char лічильник)");
        for (char ch ='A'; ch <= 'Z'; ch++ ){
            System.out.print(ch + " ");
        }
        System.out.println("\n\nЗавдання 27: Знакозмінна сума ряду\nведіть число");
        int ae = scanner.nextInt();
        int cum = 0;
        for (int aa=1; aa<=ae;aa++){
            if (aa % 2 == 0){
            cum += aa;}
            else {
            cum -= aa;}
        }System.out.println(cum);

        System.out.println("\n\nЗавдання 28: Арифметична прогресія\nведіть перший член прогреїсії");
        int d = scanner.nextInt();
        System.out.println("ведіть різницю прогресії");
        int d2 = scanner.nextInt();
        System.out.println("ведіть кількість членів");
        int d3 = scanner.nextInt();
        int sum = 0;
        int curent = d;
        for (int i = 1; i <= d3; i++){
            sum += curent;
            sum += d;
        }System.out.println("сума: "+sum);

        System.out.println("\n\nЗавдання 29: Демонстрація переповнення byte");
        int but = 125;
        for (int i = 1; i <= 6; i++) {
            but = (byte) (but + 1);
        System.out.println("Крок " + i + ": b = " + but);}




        System.out.print("\n\nЗавдання 30: Точний розрахунок середнього значення\nСкільки чисел ви хочете ввести (N): ");
        int n = scanner.nextInt();

        int sim = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Введіть число " + i + ": ");
            int num = scanner.nextInt();
            sim += num;
        }
        System.out.println("\nЗагальна сума " + sim);
        double eror = sim / n;
        double tre = (double) sim / n;
        System.out.println("Середнє добл: " + eror);
        System.out.println("Середнє З добл: " + tre);


        System.out.println("\n\nЗавдання 31: Шифратор символів (Зсув Цезаря)\nВведіть слово для шифрування: ");
        String word = scanner.next();
        System.out.print("Зашифрований рядок: ");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            char hifr = (char) (ch + 1);
            System.out.print(hifr);
        }
        System.out.println("\n\nЗавдання 32: Зрізання дробової частини (Cashier's change)");
        double[] ds = {19.99, 45.50, 12.10, 99.95, 3.40};
        double tos = 0;
        int intSum = 0;
        for (double number : ds) {
            tos += number;
            intSum += (int) number;}
        double centsOnly = tos - intSum;
        System.out.println("загальна сума "+intSum);
        System.out.println("Суму відкинутих копійок "+centsOnly);
        System.out.println("ще одна сума "+tos);

        System.out.println("\n\nЗавдання 33: Прогрес-бар завантаження (Percentages)");
        int loag = 0;
        for (int save = 0; save < 51; save++){
        loag = (int) (((double) save / 50) * 100);
        System.out.println("заватженя "+loag+"%");
        }
        System.out.println("\n\nЗавдання 34: Переповнення при приведенні long до int");
        long bigNumber = 3_000_000_000L;
        int aa= (int) bigNumber;
        System.out.println("Початкове число (long): " + bigNumber);
        System.out.println("Після звуження до int: " + aa);

        System.out.println("Завдання 35: Демонстрація накопичення похибки double");
        for (double di = 0.0; di <= 1.0; di += 0.1){
            System.out.println(di);}
        System.out.println();
        for (int d4 = 0; d4 <= 10; d4 ++){
            System.out.println(d4);}





    }
}