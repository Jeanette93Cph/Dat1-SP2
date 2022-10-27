
//This class extends from AFuelCar

public class DieselCar extends AFuelCar
{

    public boolean particleFilter;


    //constructor
    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    // does the car have a particle filter
    public boolean hasParticleFilter()
    {
        return particleFilter;
    }


    // from AFuelCar
    @Override
    public String getFuelType()
    {
        return "Diesel";
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
        int fee = 0;

        // man behøver ikke at skrive particleFilter == true. når man blot skriver particleFilter betyder det samme.
        if(particleFilter)
        {
            fee += 1000;
        }

        if(kmPrLitre >= 20 && kmPrLitre <= 50)
        {
            fee = 330 + 130;
            return fee;
        }
        if(kmPrLitre >= 15 && kmPrLitre <= 20)
        {
            fee = 1050 + 1390;
            return fee;
        }
        if(kmPrLitre >= 10 && kmPrLitre <= 15)
        {
            fee = 2340 + 1850;
            return fee;
        }
        if(kmPrLitre >= 5 && kmPrLitre <= 10)
        {
            fee = 5500 + 2770;
            return fee;
        }
        if(kmPrLitre >= 1 && kmPrLitre <= 5)
        {
            fee = 10470 + 15260;
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
        return "DieselCar{" +
                "particleFilter=" + particleFilter +
                '}' + super.toString();
    }
}
