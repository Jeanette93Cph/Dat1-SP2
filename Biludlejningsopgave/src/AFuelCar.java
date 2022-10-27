
//This class extends from ACar
//It is the over-class of GasolineCar and DieselCar

public abstract class AFuelCar extends ACar
{
    public int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }


    // should return “Gasoline” or “Diesel”
    public abstract String getFuelType();


    // should return how many kilometres the car can drive on 1 litre of fuel
    public abstract int getKmPrLitre();


    //from interface Car
    public abstract int getRegistrationFee();

    @Override
    public String toString()
    {
        return "AFuelCar{" +
                "kmPrLitre=" + kmPrLitre + super.toString() +
                '}';
    }
}