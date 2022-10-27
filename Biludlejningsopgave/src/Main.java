import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

    FleetOfCars fleetofcars = new FleetOfCars();


    Car gasolineCar = new GasolineCar("RE77788", "Audi", "Stationcar", 4, 30);

    Car dieselCar = new DieselCar("KP12345", "Volvo", "SUV", 4, 20, true);

    Car electricCar = new ElectricCar("AE66554", "Skoda", "Sportsvogn", 2, 5, 20, 30, 40);


    fleetofcars.fleet.add(gasolineCar);
    fleetofcars.fleet.add(dieselCar);
    fleetofcars.fleet.add(electricCar);



    System.out.println(fleetofcars.getTotalRegistrationFeeForFleet());
    System.out.println(fleetofcars);

    }


}