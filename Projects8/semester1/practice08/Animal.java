package semester1.practice08;

public class Animal {
    private String name;
    private int age;
    private double weight;
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age >= 0 ? age : 0;
        this.weight = weight >= 0.0 ? weight : 1.0;}
    public String getName() {
        return name;
    }
}
class Dog extends Animal{
    private String breed;
    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }
    public String fetchStick() {
        return getName() + " приніс палицю!";
    }
}
class Cat extends Animal{
    boolean isIndoor;
    public Cat(String name, int age, double weight, boolean isIndoor) {
        super(name, age, weight);
        this.isIndoor = isIndoor;
    }
    public String purr() {
        return getName() + " каже: Мур-мур...";
    }
}
