package HomeWork5;

public class FreightCar extends Ground {
    private double loadCapacity; // Грузоподемность(т)
    private double powerInKilowatts; // Мощность(кВт)

    public FreightCar(String brand, double power, int maximumSpeed, int weight,
                      int numberOfWheels, double fuelConsumption, double loadCapacity) {
        super(brand, power, maximumSpeed, weight, numberOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void cargo() {
        if (loadCapacity <= 10) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
    public double calculationOfPowerInKilowatts() {
        powerInKilowatts = getPower() * 0.74;
        return powerInKilowatts;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Грузоподемность: %.1f тонн\t Мощность: %.1f (кВт)\n", loadCapacity,powerInKilowatts);
    }
}
