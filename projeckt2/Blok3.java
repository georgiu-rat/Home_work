public class Blok3 {
    public static void main(String[] args) {
        int number = 19;
        int remainder = number % 2;
        System.out.println("Число "+ number +" при діленні на 2 дає остачу:" + remainder + "\n\n");

        int totalSeconds = 385;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        System.out.println(totalSeconds+ " секунд"+" = "+minutes+" хв "+seconds+" сек\n\n");

        int n = 47;
        int ten = n / 10;;
        int one = n % 10;;
        System.out.println("Число:" + 47 + "." + " десятки " +ten+", Одиниці: "+one+". Сума цифр: " + (ten+one)+"\n\n");

        int score = 100;
        score += 50;
        System.out.println("Після додавання: "+ score);
        score -= 20;
        System.out.println("Після віднімання: " + score);
        score *= 2;
        System.out.println("Після множення: " + score);
        score /= 4;
        System.out.println("Після ділення: " + score + "\n\n");

        int counter1 = 5;
        System.out.println(counter1++);
        System.out.println(counter1);
        System.out.println();
        int counter2 = 5;
        System.out.println(++counter2);
        System.out.println(counter2);

        int grade1 = 4;
        int grade2 = 5;
        int grade3 = 4;
        System.out.println("Середній бал:"+ (grade1 + grade2 + grade3)/3.0 +"\n\n");

        double celsius = 25.0;
        double  F = celsius*(1.8)+32;
        double  K = celsius + 273.15;
        System.out.println(celsius + "=" + F);
        System.out.println(celsius + "=" + K+"\n\n");



    }
}
