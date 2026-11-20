import java.util.RandomAccess;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println("Java - надійна та кросплатформна мова!");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nВедіть текст");
        String text = scanner.nextLine();
        System.out.println("Ведіть число");
        int namber = scanner.nextInt();

        for (int t=1; t <= namber; t++) {
            System.out.println(text);
        }
        System.out.println();

        for (int m=1,balans=500; m <= 12; m++, balans +=500){
            System.out.println("місяць "+m+ " грошей на балансі: "+balans);
        }

        System.out.println();
        double rate = 44.5;
        for (int ero=10; ero <= 100; ero +=10){
            double uan = ero*rate;
            System.out.println(ero+"євро = "+uan);
        }

        System.out.println("\n\nВедіть розмір рамки");
        int size = scanner.nextInt();
        for (int s=1; s <= size; s++){
            System.out.print("=");

        }
        System.out.println("\n\n");
        int c = 10;
        while (c >= 0){
            System.out.println(c + "...");
            c--;
        }
        System.out.println("Ракета запушена\n\n");

        System.out.println("Ведіть число");
        int sum =0;
        int nambe =-1;
        while (nambe != 0){
             nambe = scanner.nextInt();
             sum += nambe;
        }
        System.out.println("резлультат: "+sum+ "\n\n");

        System.out.println("Ведіть число");
        int ra = 1;
        int aa = scanner.nextInt();
        while (ra <= aa){
            ra *= 2;
            System.out.println(ra);
        }
        System.out.println( );
        System.out.println("\n\n");
        int number = 7425;
        int count = 0;
        int cam1 = 0;
        int cam2 = 0;

        if (number == 0) {
            count = 1;
        }

        while (number > 0) {
            cam1 = number%10;
            cam2 += cam1;
            count++;
            number = number / 10;
        }

        System.out.println("Кількість цифр: " + count+ " сума цифр: "+cam2+ "\n\n");

        int nor = 12345;
        System.out.println("зворотній текст:");

        while (nor > 0) {
            int non = nor % 10;
            System.out.print(non);
            nor = nor / 10;
        }
        System.out.println("\n\n");

        double prosent =15.0;
        double moni = 1000.0;
        double girt = moni*2;
        int years = 0;
        while (moni < girt) {
            moni = moni + (moni * prosent / 100);
            years++;
        }
        System.out.println("грошей зібарано за "+years+ " років\n\n");

        System.out.println("№12  Ведіть число ");
        int mun = scanner.nextInt();
        int can = 2;
        while (mun % can != 0){
            can++;
            System.out.println(can);
        }
        System.out.println("найменшим дільником числа "+mun+" є "+can+ "\n\n");

        System.out.println("ведіть число від 1 до 100 - число 101 це вихід");
        int arkuh = 0;
        int randon = (int)(Math.random() * 100) + 1;
        while (true){
            int anada = scanner.nextInt();
            if (anada == 101){
                break;
            }
            arkuh++;
            System.out.println("це "+arkuh+" спроба");

            if ( randon > anada){
                System.out.println("більше");
            }


            else if (randon < anada){
                System.out.println("меньше");
            }

            else {
                System.out.println("вгадано з "+arkuh+" спроби");
                break;
            }
        }
        ;

    }
}