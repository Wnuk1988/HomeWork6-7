public class Transport {
    private double power; // Мощность(в лошадиных силах)
    private int maximumSpeed; // Максимальная скорость(км/ч)
    private int weight; // Масса(кг)
    private String brand; // Марка

    public Transport(String brand, double power, int maximumSpeed, int weight) {
        this.brand = brand;
        this.power = power;
        this.maximumSpeed = maximumSpeed;
        this.weight = weight; //
    }

    public String getBrand() {
        return brand;
    }

    public double getPower() {
        return power;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void displayInfo() {
        System.out.printf("Марка: %s\t Мощность: %.1f (л/с)\t Максимальная скорость: %d (км/ч)\t Вес: %d (кг)\n", brand, power, maximumSpeed, weight);
    }
}
