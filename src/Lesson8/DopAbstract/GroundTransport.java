package Lesson8.DopAbstract;

public class GroundTransport extends Transport {
   private int numbersOfWheels;
    private double fuelConsumption; // л/100км.

    public int getNumbersOfWheels() {
        return numbersOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setNumbersOfWheels(int numbersOfWheels) {
        this.numbersOfWheels = numbersOfWheels;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
