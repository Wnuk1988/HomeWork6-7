public class FreightCar extends Ground {
    private double loadCapacity; // Грузоподемность(т)
    private double powerInKilowatts; // Мощность(кВт)

    public FreightCar(String brand, double power, int maximumSpeed, int weight,
                      int numberOfWheels, double fuelConsumption, double loadCapacity) {
        super(brand, power, maximumSpeed, weight, numberOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
        this.powerInKilowatts = calculationOfPowerInKilowatts(power);
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void cargo(int clientWeight) {
        if (loadCapacity >= clientWeight) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
    private double calculationOfPowerInKilowatts(double power) {
        powerInKilowatts = power * 0.74;
        return powerInKilowatts;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Грузоподемность: %.1f тонн\t Мощность: %.1f (кВт)\n", loadCapacity,powerInKilowatts);
    }
}
