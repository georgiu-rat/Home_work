import java.util.Scanner;

public class bloc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 10; int divisor = 0;
        if (divisor != 0 && (x / divisor > 1)) {
            System.out.println("Успішне ділення");
        } else {
            System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
        }
        int counter1 = 0;
        int counter2 = 0;
        boolean b1 = false && (++counter1 > 0);
        boolean b2 = false & (++counter2 > 0);
        System.out.println("counter1 після &&: " + counter1+ "\ncounter2 після &: " + counter2);


        System.out.println("ведіть час від 1 до 23");
        int hour = scanner.nextInt();
        System.out.println("ведіть час від одного від 1 до 59");
        int minets = scanner.nextInt();
        boolean isValidTime = (hour >= 0 && hour <= 23) && (minets >= 0 && minets <= 59);
        if (!isValidTime){
            System.out.println("помилка");
        } else {
            System.out.println(hour+ ":"+minets);
        }
        System.out.println("ведіть число a");
        int a = scanner.nextInt();
        System.out.println("ведіть число b");
        int b = scanner.nextInt();
        System.out.println("ведіть число c");
        int c = scanner.nextInt();
        if ((a+b<c)||(a+c<b)||(c+b<a)){
            System.out.println("помила");
        }
        else {
            System.out.println("правильно");
        }
        System.out.println("ведіть число n");
        int n = scanner.nextInt();
        boolean isEvenBitwise = (n & 1) == 0;
        boolean parne = (n % 2 == 0);
        System.out.println(isEvenBitwise);
        System.out.println(parne);
        double money = 1000.0;
        System.out.println("ведіть число");
        double cost1 = scanner.nextDouble();
        double limit = 500.0;
        boolean isPinCorrect = true;
        boolean isCardActive = true;
        boolean hasSufficientBalance = money >= cost1;
        boolean isDailyLimitExceeded = cost1 >= limit;
        if (isCardActive && !isDailyLimitExceeded && hasSufficientBalance && isPinCorrect){
            System.out.println("транзакція успішна");
        }
        else {
            System.out.println("відихлено помилка");
        }




    }

}
