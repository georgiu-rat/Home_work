public class Bloc5 {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Катети: "+ a +" та "+b+". Гіпотенуза: "+c+"\n\n");

        double radius = 5.0;
        double L = 2*Math.PI*radius;
        double S = Math.PI*Math.pow(radius, 2);
        System.out.println("Радіус: 5.0\nДовжина кола: "+ L +"\nПлоща круга:"+ S +"\n\n");

        double dayTemp = 18.5;
        double nightTemp = -3.2;
        System.out.println(Math.abs(dayTemp - nightTemp));
        System.out.println(Math.max(dayTemp, nightTemp));
        System.out.println(Math.min(dayTemp, nightTemp));
        System.out.println("\n\n");

        double num = 5.67;
        System.out.println(Math.round(num)+ "\n" +Math.ceil(num)+ "\n" +Math.floor(num)+ "\n\n");

        double a1 = 1.0;
        double b1 = -7.0;
        double c1 = 10.0;
        double d = Math.pow(b1, 2) - 4 * a1 * c1;
        double x1 = ((-b1+Math.sqrt(d))/(2*a1));
        double x2 = ((-b1-Math.sqrt(d))/(2*a1));
        System.out.println("Дискримінант D = "+d+" \nКорінь x1 = "+ x1 +"\nКорінь x2 = "+ x2 +"\n\n");

        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Випало на кубику: "+dice + "\n\n");

        int min = -10;
        int max = 35;
        int randomTemp = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Погода на завтра: "+randomTemp + "\n\n");


        double P = 10_000.0;
        double r = 12;
        int t = 3;
        double S1 = P*Math.pow(1+(r/100), t);
        double n = (S1-P);
        System.out.println("+------------------------------------+\n" +
                           "|     ДЕПОЗИТНИЙ КАЛЬКУЛЬАТОР        |\n" +
                           "+------------------------------------+\n" +
                           "Початкова сума: "+ P +" грн\n" +
                           "Термін: "+ r +" роки під "+ r +"% річних\n" +
                           "Підсумкова сума: "+ S1 +" грн\n" +
                           "Чистий прибуток: "+ n +" грн\n" +
                           "+------------------------------------+\n");
    }
}
