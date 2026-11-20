package semester1.practice08;

public class Vehicle {
    protected String brand;
    protected int maxSpeed;
    protected double fuelTankCapacity;

    Vehicle(String brand, int maxSpeed, double fuelTankCapacity) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.fuelTankCapacity = fuelTankCapacity;

    }
    @Override
    public String toString() {
        return String.format("Бренд: %s | Макс. швидкість: %d км/ч | Бак: %.1f л",
                brand, maxSpeed, fuelTankCapacity);}


}
class PassengerCar extends Vehicle{
    private int passengerSeats;
    PassengerCar(int passengerSeats,String brand,int maxSpeed,double fuelTankCapacity){
        super(brand,maxSpeed,fuelTankCapacity);
        this.passengerSeats = passengerSeats;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" | Пассажирских місць: %d", passengerSeats);
    }
}
class CargoTruck extends Vehicle{
    CargoTruck(double maxLoadTons, String brand, int maxSpeed, double fuelTankCapacity) {
        super(brand, maxSpeed, fuelTankCapacity);
        this.maxLoadTons = maxLoadTons;
    }    private double maxLoadTons;

    public double getFuelConsumptionFullLoad() {
        double baseConsumption = 15.0;
        return baseConsumption + (maxLoadTons * 2.0);
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" | Вантажопідйомність: %.1f т | Витрата при повному завантаженні: %.1f л/100км",
                maxLoadTons, getFuelConsumptionFullLoad());
    }
}
