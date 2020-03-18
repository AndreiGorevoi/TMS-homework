package Lesson8.DopAbstract;

public class GroundTransport extends Transport {
   protected int numbersOfWheels;
    protected double fuelConsumption; // л/100км.

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

    @Override
    public String toString() {
        return super.toString() + "GroundTransport{" +
                "numbersOfWheels=" + numbersOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
