package HomeWork5;

import java.util.Scanner;

public class PassengerCar extends Ground {
    private String bodyType; // Тип кузова
    private int numberOfPassengers; // Количество пассажиров
    private double powerInKilowatts; // Мощность(кВт)
    private double time; // Время(ч)
    private double way; // Пройденный путь(км)
    private double spentFuel; // Израсходаванное топливо(л)
    private boolean isCorrect = false; // Флаг проверки корректности входа
    private Scanner user; // Ввод с кансоли

    public PassengerCar(String brand, int power, int maximumSpeed, int weight, int numberOfWheels,
                        double fuelConsumption, String bodyType, int numberOfPassengers) {
        super(brand, power, maximumSpeed, weight, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }
    public double welcome() {
        while (!isCorrect) {
            user = new Scanner(System.in);
            System.out.println("Введите время в пути");
            if (user.hasNextDouble()) {
                time = (user.nextDouble());
                isCorrect = true;
            } else {
                System.out.println("Вы ввели не корректное время.");
            }

        }
        return time;
    }

    public double allTheWay() {
        way = time * getMaximumSpeed();
        return way;
    }

    public double calculationOfPowerInKilowatts() {
        powerInKilowatts = getPower() * 0.74;
        return powerInKilowatts;
    }

    private double totalFuelConsumption() {
        spentFuel = (super.getMaximumSpeed() * time * super.getFuelConsumption()) / 100;
        return spentFuel;
    }

    public void infoAllTheWay() {
        System.out.printf("За время %.1f ч, автомобиль %s двигаясь с максимальной скоростью %d км/ч проедет %.1f км" +
                " и израсходует %.1f литров топлива", time, super.getBrand(), super.getMaximumSpeed(), way, totalFuelConsumption());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Тип кузова: %s\t Количество пассажиров: %d\t Мощность: %.1f (кВт)\n\n",
                bodyType, numberOfPassengers, powerInKilowatts);
    }
}
