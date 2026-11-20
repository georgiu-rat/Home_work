import java.util.Scanner;

public class bloc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("число x і число y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println((x > y) ? x : y);

        System.out.println("\n\nчисло n");
        int ab = scanner.nextInt();
        int abs = (ab < 0) ? -ab : ab;
        System.out.println("Модуль числа |" + ab + "| дорівнює: " + abs+ "\n\n");

        System.out.println("число n");
        int n = scanner.nextInt();
        String status = (n > 0) ? "Додатне" : (n < 0) ? "Від'ємне" : "Нуль";
        System.out.println("число "+n+ " " +status);

        System.out.println("\n\nСума покупки");
        double cost = scanner.nextInt();
        double znizka = (cost <= 1000)? 0.98 : 0.9;
        double gg = Math.round(cost*znizka*100.0) / 100.0;
        System.out.println("До сплати зі знижкою: " + gg);

        System.out.println("ведіть 2 числа:");
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println((b != 0)?(c/b):"на нуль ділити не можна\n\n");

        System.out.println("ведіть кількість помилок");
        int count = scanner.nextInt();
        System.out.println((count == 1)?"Знайдено 1 помилку":"Знайдено " + count + " помилок\n\n");





    }
}
