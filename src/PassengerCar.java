import java.util.Scanner;

public class PassengerCar extends Ground {
    private String bodyType; // Тип кузова
    private int numberOfPassengers; // Количество пассажиров
    private double powerInKilowatts; // Мощность(кВт)
    private double spentFuel; // Израсходаванное топливо(л)

    public PassengerCar(String brand, double power, int maximumSpeed, int weight, int numberOfWheels,
                        double fuelConsumption, String bodyType, int numberOfPassengers) {
        super(brand, power, maximumSpeed, weight, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
        this.powerInKilowatts = calculationOfPowerInKilowatts(power);
    }

    private double GetTimeFromUser() {
        Scanner user;
        boolean isCorrect = false;
        double time = 0;
        while (!isCorrect) {
            user = new Scanner(System.in);
            System.out.println("Введите время в пути:");
            if (user.hasNextDouble()) {
                time = (user.nextDouble());
                isCorrect = true;
            } else {
                System.out.println("Вы ввели не корректное время.");
            }
        }
        return time;
    }

    private double GetMaxDistance(double time) {
        double way = time * getMaximumSpeed();
        return way;
    }

    private double calculationOfPowerInKilowatts(double power) {
        powerInKilowatts = power * 0.74;
        return powerInKilowatts;
    }

    private double GetTotalFuelConsumption(double time) {
        spentFuel = (super.getMaximumSpeed() * time * super.getFuelConsumption()) / 100;
        return spentFuel;
    }

    public void infoAllTheWay() {
        double time = GetTimeFromUser();
        double way = GetMaxDistance(time);
        double totalFuelConsumption = GetTotalFuelConsumption(time);
        System.out.printf("За время %.1f ч, автомобиль %s двигаясь с максимальной скоростью %d км/ч проедет %.1f км" +
                " и израсходует %.1f литров топлива.", time, super.getBrand(), super.getMaximumSpeed(), way, totalFuelConsumption);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Тип кузова: %s\t Количество пассажиров: %d\t Мощность: %.1f (кВт)\n\n",
                bodyType, numberOfPassengers, powerInKilowatts);
    }
}
