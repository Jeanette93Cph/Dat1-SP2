
// This class implements the interface Car
//It is the over-class of AFuelCar and ElectricCar

public abstract class ACar implements Car
{

    public String registrationNumber;

    //make sense to be final
    public String make;

    //make sense to be final
    public String model;

    //make sense to be final
    public int numberOfDoors;

    public ACar(String registrationNumber,String make, String model, int numberOfDoors)
    {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }


    //from interface Car
    public abstract int getRegistrationFee();

    //The number on the number plate. From Interface Car
    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    // The make of the car e.g. Audi. From Interface Car
    public String getMake()
    {
        return  make;
    }

    // The model of the car e.g. A6. From Interface Car
    public String getModel()
    {
        return model;
    }

    // The number of doors. From Interface Car
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }


    @Override
    public String toString()
    {
        return "ACar{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
