

/**
 * The Car class tracks fuel remaining in the car as it is driven based on fuel efficiency
 * 
 * @author (selevitt) 
 * @version (12 September 2014)
 */
public class Car
{
    /** The fuel efficiency of this car measured in miles per gallon */
    private double fuelEfficiency;
    
    /** the number of gallons of fuel left in this car's tank*/
    private double fuelInTank;
    
    /**
     * Constructor for a car of the specified fuel efficiency
     */
    public Car(double fuelEfficiency )
    {
        this.fuelEfficiency = fuelEfficiency;
        fuelInTank = 0;
    }

    /**
     * Adds the specified number of gallons of fuel to this car's tank
     *
     * @pre       specified number of gallons doesn't exceed this car's tank capacity
     * @param    gallons    number of gallons of fuel to add to the car's tank
     */
    public void addGas(double gallons)
    {
        this.fuelInTank = this.fuelInTank + gallons;
    }


    /**
     * Updates the fuel in this car's tank based on the prespecified number of miles driven
     * and this cars fuel efficiency
     *
     * @pre     the specified number
     */
    public void drive(double miles)
    {
        double gallonsBurned = miles/ this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;
    }


    /**
     * Returns the number of gallons left in the cars tank
     * @return  number of gallons of fuel left in this cars tank
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }

}
