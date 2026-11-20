import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     String name = "Миша";
     String lastname = " Сирник";
     int age = 25;
     String citi = "Токіо";
     System.out.println("=== ВХІДНІ ДАНІ ===\nІм'я: "+ name + "\nПрізвище: " + lastname);
     System.out.println("Вік: " + age +"\nМісто: " + citi + "\n-------------------");
     System.out.println("Привіт, "+name+lastname+" з міста "+citi+"! Твій вік: "+age+" р.\n\n");

     Scanner scanner = new Scanner(System.in);
     System.out.println("Введіть перше число: ");
     int namber1 = scanner.nextInt();
     System.out.println("Введіть друге число: ");
     int namber2 = scanner.nextInt();
     System.out.println("Сума: "+(namber1+namber2));
     System.out.println("Різниця: "+ (namber1-namber2));
     System.out.println("Добуток: "+ namber1*namber2);
     System.out.println("Остача від ділення: "+ namber1%namber2 + "\n\n");

     System.out.println("Введіть суму в гривнях (UAH): ");
     double money = scanner.nextDouble();
     System.out.println("Введіть курс USD: ");
     double money2 = scanner.nextDouble();
     double rezult = Math.round((money/money2)*100.0)/100.0;
     System.out.println("Сума до видачі: " + rezult + " USD");


     System.out.println("Введіть номер квитка: ");
     int tiket = scanner.nextInt();
     scanner.nextLine();
     System.out.println("Введіть повне ім'я студента: ");
     String name1 = scanner.nextLine();
     System.out.println();
     System.out.println("Введіть спеціальність: ");
     String spesialiti = scanner.nextLine();
     System.out.println("Студент: "+name1+", квиток №"+tiket+", спеціальність: "+spesialiti + "\n\n");

     System.out.println("Ваш зріст (м): ");
     int height = scanner.nextInt();
     System.out.println("Ваша вага (кг): ");
     int waiz = scanner.nextInt();
     System.out.println("Розрахований BMI: " + height/Math.pow(waiz, 2));
     System.out.println("\n");

     System.out.println("Ведіть символ");
     char leter = scanner.next().charAt(0);
     int cod = (int)leter;
     System.out.println("Символ: "+leter+" | Код символу: "+cod + "\n\n");

     System.out.println("Катет A: ");
     int katet = scanner.nextInt();
     System.out.println("Катет B: ");
     int hatet = scanner.nextInt();
     System.out.println("Гіпотенуза: "+Math.sqrt((katet*katet)+(hatet*hatet)));
     System.out.println("Периметр: "+ 2*(hatet+katet));
     System.out.println("Площа: "+hatet*katet + "\n\n");

     System.out.println("Товар: ");
     String tovar = scanner.nextLine();
     scanner.nextLine();
     System.out.println("Ціна: ");
     int cost = scanner.nextInt();
     System.out.println("Кількість: ");
     int htot = scanner.nextInt();
     System.out.println("Товар: "+tovar+" Загальна сума: "+cost*htot+" грн (з них ПДВ 20%: "+cost*htot*0.2+" грн)\n\n");




    }

}