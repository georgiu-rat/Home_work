package semester1.dota2;

public class DotaTest {
    public static void main(String[] args) {
        System.out.println("\n\nЗавдання 25: Трирівнева ієрархія Dota 2: Hero $\\to$ AttributeHero $\\to$ ConcreteHero");
        AlchemistHero alchemist = new AlchemistHero("Alchemist", 200, 25, 500);
        System.out.println(alchemist);
        System.out.println("Максимальне HP: " + alchemist.getMaxHp());
        alchemist.chemicalRage();
    }
}
