public class WarPlane extends Air {
    private boolean ejectionSystem; // Наличие системы катапультирования(true/false)
    private int numberOfMissiles; // Количество ракет на борту
    private double powerInKilowatts; // Мощность(кВт)


    public WarPlane(String brand, int power, int maximumSpeed, int weight, double wingspan, int minRunwayLengths,
                    boolean ejectionSystem, int numberOfMissiles) {
        super(brand, power, maximumSpeed, weight, wingspan, minRunwayLengths);
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissiles = numberOfMissiles;
    }

    public void shot() {
        if (numberOfMissiles > 0) {
            System.out.println("Ракета пошла!");
        } else {
            System.out.println("Боеприпасы отсутствуют!");
        }
    }

    public void ejection() {
        if (true) {
            System.out.println("Катапультирование прошло успешно!");
        } else {
            System.out.println("У Вас нет такой системы!!!");
        }
    }

    public double calculationOfPowerInKilowatts() {
        powerInKilowatts = getPower() * 0.74;
        return powerInKilowatts;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Наличие системы катапультирования: %b\t" +
                " Количество ракет на борту: %d штук\t Мощность: %.1f (кВт)\n",
                ejectionSystem, numberOfMissiles, powerInKilowatts);
    }
}
