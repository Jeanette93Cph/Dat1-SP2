
//This class extends from AFuelCar

public class GasolineCar extends AFuelCar
{


    //constructor
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }



    // from AFuelCar
    @Override
    public String getFuelType()
    {
        return "Gasoline";
    }

    @Override
    public int getKmPrLitre()
    {
        return kmPrLitre;
    }


    //from interface Car
    @Override
    public int getRegistrationFee()
    {
        int fee;

        if(kmPrLitre >= 20 && kmPrLitre <= 50)
        {
            fee = 330;
            return fee;
        }
        if(kmPrLitre >= 15 && kmPrLitre <= 20)
        {
            fee = 1050;
            return fee;
        }
        if(kmPrLitre >= 10 && kmPrLitre <= 15)
        {
            fee = 2340;
            return fee;
        }
        if(kmPrLitre >= 5 && kmPrLitre <= 10)
        {
            fee = 5500;
            return fee;
        }
        if(kmPrLitre >= 1 && kmPrLitre <= 5)
        {
            fee = 10470;
            return fee;
        }
        else
        {
            return 0;
        }
    }



    @Override
    public String toString()
    {
        return "Gasoline car\n" + super.toString();
    }
}
