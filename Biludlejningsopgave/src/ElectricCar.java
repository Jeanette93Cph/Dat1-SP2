
//This class extends from ACar

public class ElectricCar extends ACar
{

    int batteryCapacity;
    int maxRange;

    int WhPrKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, int batteryCapacity, int maxRange, int WhPrKm)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange =  maxRange;
        this.WhPrKm = getWhPrKm();
    }


    //constructor



    // returns the battery capacity in kilowatt hours
    public int getBatteryCapacityKWh()
    {
        return batteryCapacity;
    }

    // returns the maximum range in kilometres.
    public int getMaxRangeKm()
    {
        return maxRange;
    }

    // returns the power consumption in watt hours per driven kilometre.
    public int getWhPrKm()
    {
        int WhPrKm = (batteryCapacity*1000) / maxRange;
        return WhPrKm;
    }



    //from interface Car

    @Override
    public int getRegistrationFee()
    {
        int fee;

        int kmPrLitre = (int) (getWhPrKm() / 91.25 / 100);

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
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", maxRange=" + maxRange +
                ", WhPrKm=" + WhPrKm +
                '}' +super.toString();
    }
}
