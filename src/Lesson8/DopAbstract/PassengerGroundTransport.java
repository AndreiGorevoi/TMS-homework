package Lesson8.DopAbstract;

public class PassengerGroundTransport extends GroundTransport {
    private String typeOfBody;
    private int maxNumbersOfPassengers;

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getMaxNumbersOfPassengers() {
        return maxNumbersOfPassengers;
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public void setMaxNumbersOfPassengers(int maxNumbersOfPassengers) {
        this.maxNumbersOfPassengers = maxNumbersOfPassengers;
    }

    public void tripOfCar(double h){
        double s = h*getMaxSpeed();
        System.out.println("In " + h + "h, auto " + getModel() + " will pass " + s + "km with max speed: "
                + getMaxSpeed()+ "km/h and spend "+ calcFuelConsumption(s) +"l of fuels");
    }

    private double calcFuelConsumption(double s){
        double fuelIsSpent = (s/100)*getFuelConsumption() ;
        fuelIsSpent*=100;
        int temp = (int) Math.round(fuelIsSpent);
        fuelIsSpent=(double) temp/100;
        return fuelIsSpent;
    }

    @Override
    public String toString() {
        return "PassengerGroundTransport{" +
                "typeOfBody='" + typeOfBody + '\'' +
                ", maxNumbersOfPassengers=" + maxNumbersOfPassengers +
                ", numbersOfWheels=" + getNumbersOfWheels() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", power=" + getPower() +
                ", maxSpeed=" + getMaxSpeed() +
                ", weight=" + getWeight() +
                ", model='" + getModel()  +
                ", power (kV)="+ powerCalc()+ '\''+
                '}';
    }
}
