public class Blok2 {
    public static void main(String[] args){
        int firstNumber =5;
        double userWeight = 72.5;
        String userCity = "Kyiv";
        boolean isValidUser = true;
        System.out.println(firstNumber + "," + userWeight + "," + userCity + "," + isValidUser + "\n\n");

        String firstName = "Тарас";
        String lastName = "Шевченко";
        int age = 47;
        System.out.println("Мене звати " + firstName + lastName + ", мені" + age + " років\n\n");

        int a = 10;
        int b = 20;
        System.out.println("Сума без дужок: " +  a + b); // це скелюваня
        System.out.println("Сума з дужками: " + (a + b) + "\n\n"); // а це додаваня

        String login = "ivan.petrenko";
        String domain = "gmail.com";
        String role = "student";
        System.out.println("Користувач " + login+"(роль: "+role+") має пошту: "+ login + "@" + domain + "\n\n");

        String productName = "Ноутбук";
        int quantity = 2;
        double pricePerUnit = 24500.50;
        System.out.println("ЧЕК:\nТовар:" + productName +"\nКількість:" + quantity + " шт\nЦіна:" + pricePerUnit +"грн\n\n");

        String currency = " UAH";
        int moey = 1500;
        int cent = 75;
        System.out.println("Поточний баланс: "+moey+","+cent+currency + "\n\n");

        String protocol = "https://";
        String host = "api.example.com";
        String endpoint = "/users";
        int userId = 42;
        System.out.println("Запит відправлено на: "+protocol+host+endpoint+userId + "\n\n");

        String language = "Java";
        int level = 1;
        boolean isReady = true;
        System.out.println(""+language + " | рівень " +level + " | " + "Готовність до практики: " + isReady + "\n\n");

    }
}
