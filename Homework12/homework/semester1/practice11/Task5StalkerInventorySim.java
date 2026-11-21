package Homework12.homework.semester1.practice11;

import java.util.*;

public class Task5StalkerInventorySim {
    public static void main(String[] args){
        Stalker skif = new Stalker("Скіф");
        System.out.println("Сталкер: " + skif.getCallSign() + " | Максимум слотів на поясі: 4\n");
        System.out.println("--- 1. Пояс артефактів (HashSet) ---");
        Artifact medusa = new Artifact("ART-1", "Медуза", 0.4, -2.0, 15);
        Artifact soul = new Artifact("ART-2", "Душа", 0.5, 3.5, 25);
        Artifact medusaDup = new Artifact("ART-1", "Медуза", 0.4, -2.0, 15);
        Artifact compass = new Artifact("ART-3", "Компас", 0.6, 2.5, 40);
        printEquip(skif, medusa);
        printEquip(skif, soul);
        printEquip(skif, medusaDup);
        printEquip(skif, compass);
        Medkit regularMedkit = new Medkit("MED-1", "Звичайна аптечка", 0.3, 1);
        regularMedkit.use();
        Medkit armyMedkit = new Medkit("MED-2", "Армійська аптечка", 0.4, 2);
        Detector echoDetector = new Detector("DET-1", "Детектор Відгук", 0.5, 0);
        Detector velesDetector = new Detector("DET-2", "Детектор Велес", 0.7, 85);
        skif.addToBackpack(regularMedkit);
        skif.addToBackpack(armyMedkit);
        skif.addToBackpack(echoDetector);
        skif.addToBackpack(velesDetector);
        int removed = skif.cleanBackpack();
        System.out.printf("  Підсумок ревізії: видалено %d предмети, у рюкзаку залишилось %d.%n%n",
                removed, skif.getInventoryCopy().size());
        System.out.printf("  • Пояс: %d артефакти | Сумарний захист: %d%% | Радіація: %+.2f мЗв/хв%n",
                skif.getArtifactBeltCopy().size(), skif.getTotalProtection(), skif.getNetRadiation());
        System.out.printf("  • Загальна вага спорядження: %.2f кг%n%n", skif.getTotalWeightKg());
        skif.addVisitedLocations(Arrays.asList("Залісся", "Кордон", "Звалище", "Янтар"));
        HashSet<String> allyLocations = new HashSet<>(Arrays.asList("Залісся", "Янтар", "Росток", "Прип'ять"));
        System.out.printf("  Локації Скіфа [%d]:          %s%n",
                skif.getVisitedLocationsCopy().size(), skif.getVisitedLocationsCopy());
        System.out.printf("  Локації союзника [%d]:       %s%n",
                allyLocations.size(), allyLocations);
        System.out.printf("  Спільні локації (A ∩ B):    %s%n", skif.getCommonLocations(allyLocations));
        System.out.printf("  Нові цілі розвідки (B \\ A): %s%n", skif.getNewLocationsFromAlly(allyLocations));
    }



    private static void printEquip(Stalker stalker, Artifact art) {
        if (stalker.equipArtifact(art)) {
            System.out.println("Надіто: " + art.getName());
        } else {
            System.out.println("Відхилено: " + art.getName());
        }
    }
    static abstract class ZoneItem {
        private final String id;
        private final String name;
        private final double weightKg;

         ZoneItem(String id, String name, double weightKg) {
            this.id = id;
            this.name = name;
            this.weightKg = weightKg;
            if (weightKg <= 0) {
                throw new IllegalArgumentException("Вага предмета має бути більшою за 0");
            }
        }

        public abstract String getItemType();

        public abstract boolean isUsable();

        public double getWeightKg() {
            return weightKg;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof ZoneItem other)) {
                return false;
            }
            return Objects.equals(this.id, other.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    static class Artifact extends ZoneItem {
        private final double radiation;
        private final int protection;

        Artifact(String id, String name, double weightKg, double radiation, int protection) {
            super(id, name, weightKg);
            this.radiation = radiation;
            this.protection = protection;
        }

        public double getRadiation() {
            return radiation;
        }

        public int getProtection() {
            return protection;
        }

        public String getItemType() {
            return "Артефакт";
        }

        public boolean isUsable() {
            return true;
        }
    }

    static class Medkit extends ZoneItem {
        private int usesLeft;

        Medkit(String id, String name, double weightKg, int usesLeft) {
            super(id, name, weightKg);
            this.usesLeft = usesLeft;
        }

        public int getUsesLeft() {
            return usesLeft;
        }

        public String getItemType() {
            return "Аптечка";
        }

        public boolean isUsable() {
            if (usesLeft > 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean use() {
            if (usesLeft > 0) {
                usesLeft--;
                return true;
            } else {
                return false;
            }
        }}
        static class Detector extends ZoneItem {
            private final int batteryPercent;

            Detector(String id, String name, double weightKg, int batteryPercent) {
                super(id, name, weightKg);
                this.batteryPercent = batteryPercent;
            }

            public int getBatteryPercent() {
                return batteryPercent;
            }

            public String getItemType() {
                return "Детектор";
            }

            public boolean isUsable() {
                if (batteryPercent > 0) {
                    return true;
                } else {
                    return false;
                }
            }
    }
    static class Stalker{
        private final String callSign;
        Stalker(String callSign){
            this.callSign=callSign;
        }
        public String getCallSign(){
            return callSign;
        }
        private final List<ZoneItem> inventory = new ArrayList<>();
        private final HashSet<Artifact> artifactBelt = new HashSet<>();
        private final HashSet<String> visitedLocations = new HashSet<>();
        public void addToBackpack(ZoneItem item) {
            if (item != null) {
                inventory.add(item);
            }
        }
        public boolean equipArtifact(Artifact art) {
            if (art == null || artifactBelt.size() >= 4) {
                return false;
            }
            return artifactBelt.add(art);
        }
        public int cleanBackpack() {
            int removed = 0;
            Iterator<ZoneItem> it = inventory.iterator();
            while (it.hasNext()) {
                ZoneItem item = it.next();
                if (!item.isUsable()) {
                    it.remove();
                    if (item instanceof Medkit medkit) {
                        System.out.println("Викинуто [" + item.getItemType() + "]: " + item.getName()
                                + " (непридатна: " + medkit.getUsesLeft() + " зарядів)");
                    } else if (item instanceof Detector detector) {
                        System.out.println("Викинуто [" + item.getItemType() + "]: " + item.getName()
                                + " (непридатний: батарея " + detector.getBatteryPercent() + "%)");
                    } else {
                        System.out.println("Викинуто [" + item.getItemType() + "]: " + item.getName());
                    }
                    removed++;
                }
            }
            return removed;
        }





        public double getTotalWeightKg() {
            double total = 0.0;
            for (Artifact art : artifactBelt) {
                total += art.getWeightKg();
            }
            for (ZoneItem item : inventory) {
                total += item.getWeightKg();
            }
            return total;
        }
        public double getNetRadiation() {
            double sum = 0.0;
            for (Artifact art : artifactBelt) {
                sum += art.getRadiation();
            }
            return sum;
        }
        public int getTotalProtection() {
            int sum = 0;
            for (Artifact art : artifactBelt) {
                sum += art.getProtection();
            }
            return sum;
        }
        public void addVisitedLocations(Collection<String> locations) {
            if (locations != null) {
                visitedLocations.addAll(locations);
            }
        }
        public HashSet<Artifact> getArtifactBeltCopy() {
            return new HashSet<>(artifactBelt);
        }
        public ArrayList<ZoneItem> getInventoryCopy() {
            return new ArrayList<>(inventory);
        }
        public HashSet<String> getVisitedLocationsCopy() {
            return new HashSet<>(visitedLocations);
        }
        public HashSet<String> getCommonLocations(HashSet<String> allyLocations) {
            HashSet<String> result = new HashSet<>(visitedLocations);
            if (allyLocations == null) {
                result.clear();
                return result;
            }
            result.retainAll(allyLocations);
            return result;
        }
        public HashSet<String> getNewLocationsFromAlly(HashSet<String> allyLocations) {
            if (allyLocations == null) {
                return new HashSet<>();
            }
            HashSet<String> result = new HashSet<>(allyLocations);
            result.removeAll(visitedLocations);
            return result;
        }
    }
}
