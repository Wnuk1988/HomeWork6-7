package HomeWork5;

public class ProgramFreightCar {
    public static void main(String[] args) {

        FreightCar car = new FreightCar("ГАЗон NEXT",148.9,120,3800,6,
                13.6,6.2);
        car.cargo();
        car.calculationOfPowerInKilowatts();
        car.displayInfo();
    }
}
