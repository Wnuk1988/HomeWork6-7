public class Ground extends Transport {
    private int numberOfWheels; // Количество колес
    private double fuelConsumption; // Расход топлива (л/100км)

    public Ground(String brand, double power, int maximumSpeed, int weight, int numberOfWheels, double fuelConsumption) {
        super(brand, power, maximumSpeed, weight);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Количество колес: %d штук\t Расход топлива: %.1f (л/100км)\t", numberOfWheels, fuelConsumption);
    }
}

