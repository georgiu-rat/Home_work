package semester1.practice08;

public class BaseVehicle {
    private String brand;
    private int year;
    public BaseVehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;}
        public String getBrand() {
            return brand;}
        public void setBrand(String brand) {
            this.brand = brand;}
        public int getYear() {
            return year;}
        public void setYear(int year) {
            this.year = year;}
        @Override
        public String toString() {
            return "BaseVehicle{brand='" + brand + "', year=" + year + "}";}
    }
    class MotorCar extends BaseVehicle {
        private int horsePower;
        private int doorsCount;
        public MotorCar(String brand, int year, int horsePower, int doorsCount) {
            super(brand, year);
            this.horsePower = horsePower;
            this.doorsCount = doorsCount;}
        public int getHorsePower() {
            return horsePower;}
        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;}
        public int getDoorsCount() {
            return doorsCount;}
        public void setDoorsCount(int doorsCount) {
            this.doorsCount = doorsCount;}
        @Override
        public String toString() {
            return super.toString() + ", MotorCar{horsePower=" + horsePower + ", doorsCount=" + doorsCount + "}";}
    }
    class ElectricCar extends MotorCar {
        private double batteryCapacityKWh;
        private int rangeKm;
        public ElectricCar(String brand, int year, int horsePower, int doorsCount, double batteryCapacityKWh, int rangeKm) {
            super(brand, year, horsePower, doorsCount);
            this.batteryCapacityKWh = batteryCapacityKWh;
            this.rangeKm = rangeKm;
        }
        public double getBatteryCapacityKWh() {
            return batteryCapacityKWh;
        }
        public void setBatteryCapacityKWh(double batteryCapacityKWh) {
            this.batteryCapacityKWh = batteryCapacityKWh;
        }
        public int getRangeKm() {
            return rangeKm;
        }
        public void setRangeKm(int rangeKm) {
            this.rangeKm = rangeKm;
        }
        @Override
        public String toString() {
            return super.toString() + ", ElectricCar{batteryCapacityKWh=" + batteryCapacityKWh + ", rangeKm=" + rangeKm + "}";
        }
    }