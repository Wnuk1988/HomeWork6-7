package HomeWork5;

public class CivilAircraft extends Air {
    private int numberOfPassengers; // Количество пассажиров
    private boolean businessPlaces; // Наличие бизнес класса (true/false)
    private double powerInKilowatts; // Мощность(кВт)

    public CivilAircraft(String brand, int power, int maximumSpeed, int weight, double wingspan, int minRunwayLengths,
                         int numberOfPassengers, boolean businessPlaces) {
        super(brand, power, maximumSpeed, weight, wingspan, minRunwayLengths);
        this.numberOfPassengers = numberOfPassengers;
        this.businessPlaces = businessPlaces;
    }

    public void passengerQuantity() {
        if (numberOfPassengers <= 175) {
            System.out.println("Самолет загружен.");
        } else {
            System.out.println("Вам нужен самолет побольше.");
        }
    }
    public double calculationOfPowerInKilowatts() {
        powerInKilowatts = getPower() * 0.74;
        return powerInKilowatts;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Количество пассажиров: %d\t Наличие бизнес класса: %b\t Мощность: %.1f (кВт)\n",
                numberOfPassengers, businessPlaces,powerInKilowatts);
    }
}
