//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] heroes = {"Pudge", "Invoker", "Juggernaut", "Crystal Maiden", "Earthshaker"};
        int[] kills   = {8,  12, 10, 2,  4};
        int[] deaths  = {6,  3,  2,  9,  5};
        int[] assists = {14, 9,  8,  18, 16};
        int[] netWorth = {14500, 21200, 24800, 9800, 12300};
        int n = heroes.length;
        double[] kdaRatios = new double[n];
        double[] kpPercents = new double[n];
        int totalKills = 0;
        int totalNetWorth = 0;
        for (int i = 0; i < n; i++) {
            totalKills += kills[i];
            totalNetWorth += netWorth[i];
        }
        for (int i = 0; i < n; i++) {
            int effectiveDeaths = Math.max(1, deaths[i]);
            kdaRatios[i] = (double) (kills[i] + assists[i]) / effectiveDeaths;
            kpPercents[i] = ((double) (kills[i] + assists[i]) / totalKills) * 100;
        }
        int mvpIndex = 0;
        double maxKda = kdaRatios[0];
        for (int i = 1; i < n; i++) {
            if (kdaRatios[i] > maxKda) {
                maxKda = kdaRatios[i];
                mvpIndex = i;
            }
        }
        System.out.println("========================================================================");
        System.out.println("                       DOTA 2: POST-MATCH REPORT");
        System.out.println("========================================================================");
        System.out.printf("%-16s | %-10s | %-9s | %-9s | %s%n",
                "Герой", "K / D / A", "Net Worth", "KDA Ratio", "Kill Participation");
        System.out.println("------------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            String kdaStr = kills[i] + " / " + deaths[i] + " / " + assists[i];
            // Форматування Net Worth з комами (наприклад, 14,500)
            String netWorthStr = String.format("%,d", netWorth[i]);

            System.out.printf("%-16s | %-10s | %-9s | %-9.2f | %.2f%%%n",
                    heroes[i],
                    kdaStr,
                    netWorthStr,
                    kdaRatios[i],
                    kpPercents[i]);
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Загальна кількість вбивств команди: " + totalKills);
        System.out.printf("Сумарний Net Worth команди:          %,d золота%n", totalNetWorth);
        System.out.printf("НАЙКРАЩИЙ ГРАВЕЦЬ МАТЧУ (MVP):    %s (KDA: %.2f)%n", heroes[mvpIndex], kdaRatios[mvpIndex]);
        System.out.println("========================================================================");
    }
}