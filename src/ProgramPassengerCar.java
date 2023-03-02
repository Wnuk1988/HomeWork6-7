package HomeWork5;

public class ProgramPassengerCar {
    public static void main(String[] args) {

        PassengerCar car = new PassengerCar("BMW 320d", 150, 216, 1915, 4,
                5.5, "Седан", 4);
        car.welcome();
        car.allTheWay();
        car.calculationOfPowerInKilowatts();
        car.displayInfo();
        car.infoAllTheWay();
    }
}
