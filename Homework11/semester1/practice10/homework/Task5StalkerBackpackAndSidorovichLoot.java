package semester1.practice10.homework;

import java.util.ArrayList;
import java.util.Iterator;

import static semester1.practice10.homework.Artifact.MAX_SAFE_RADIATION;

public class Task5StalkerBackpackAndSidorovichLoot {
    public static void main(String[] args) {
        var backpack = new ArrayList<Artifact>();
        backpack.add(new Artifact("риба", 5, 12.5));
        backpack.add(new Artifact("медуза", 34, 62.5));
        backpack.add(new Artifact("бонк", 100, 1.0));
        backpack.add(new Artifact("уран", 160, 145.6));
        backpack.add(new Artifact("риба", 5, 12.5));
        backpack.add(new Artifact("гриб", 5, 1.5));
        backpack.add(new Artifact("метрвий слон", 0, 10.5));
        backpack.add(new Artifact("енерго блок", 50000, 0.5));
        System.out.println(backpack.size());
        for (Artifact item : backpack) {
            System.out.println(item);
        }
        System.out.println();

        Iterator<Artifact> iterator = backpack.iterator();
        while (iterator.hasNext()) {
            Artifact current = iterator.next();
            if (current.getRadiationLevel() > MAX_SAFE_RADIATION || current.getCostKarbovanets() <= 0) {
                System.out.println("[Iterator.remove] Викинуто небезпечну пустушку: "
                        + current.getName() + " (Радіація: " + current.getRadiationLevel() + " мкЗв/год)");
                iterator.remove();
            }


        }
        System.out.println();
        System.out.println(backpack.size());
        for (Artifact item : backpack) {
            System.out.println(item);
        }
        int totalCost = 0;
        for (Artifact item : backpack) {
            totalCost += item.getCostKarbovanets();
        }
        ArrayList<Artifact> leadSpecialContainer = new ArrayList<>();
        ArrayList<Artifact> standardBeltContainer = new ArrayList<>();
        for (Artifact item : backpack) {
            if (item.getCostKarbovanets() >= 15000) {
                leadSpecialContainer.add(item);
            } else {
                standardBeltContainer.add(item);
            }
        }
        for (int i = 0; i < backpack.size() - 1; i++) {
            for (int j = 0; j < backpack.size() - i - 1; j++) {
                if (backpack.get(j).getCostKarbovanets() < backpack.get(j + 1).getCostKarbovanets()) {
                    Artifact temp = backpack.get(j);
                    backpack.set(j, backpack.get(j + 1));
                    backpack.set(j + 1, temp);
                }
            }
        }
        System.out.println();
        System.out.println(backpack.size());
        for (Artifact item : backpack) {
            System.out.println(item);
        }
        if (!backpack.isEmpty()) {
            Artifact topArtifact = backpack.get(0);
            System.out.println("найдорожчий артефакт: " + topArtifact.getName() + " — " + topArtifact.getCostKarbovanets() + " крб");
        }
        System.out.println("загальна сума "+totalCost);
    }
}
