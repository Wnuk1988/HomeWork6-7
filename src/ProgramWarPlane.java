public class ProgramWarPlane {
    public static void main(String[] args) {
        WarPlane warPlane = new WarPlane("Су-35",38600,2500,34500,14.75,
                100,true,20);
        warPlane.shot();
        warPlane.ejection();
        warPlane.calculationOfPowerInKilowatts();
        warPlane.displayInfo();
    }
}
