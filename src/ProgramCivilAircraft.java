package HomeWork5;

public class ProgramCivilAircraft {
    public static void main(String[] args) {
        CivilAircraft airplane = new CivilAircraft("Ty-154M",32630,935,59000,
                37.55,2200,175,false);
        airplane.passengerQuantity();
        airplane.calculationOfPowerInKilowatts();
        airplane.displayInfo();
    }
}
