package Lesson8.DopAbstract;

public class PassengerGroundTransport extends GroundTransport {
    String typeOfBody;
    int maxNumbersOfPassengers;

    private double powerCalc(){
        double power = (double)this.power*0.74;
        return power;
    }

    public void tripOfCar(double h){
        double s = h*maxSpeed;
        System.out.println("In " + h + "h, auto " + model + " will pass " + s + "km with max speed: "
                + maxSpeed+ "km/h and spend "+ calcFuelConsumption(s) +"l of fuels");
    }

    private double calcFuelConsumption(double s){
        double fuelIsSpent = (s/100)*fuelConsumption ;
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
                ", numbersOfWheels=" + numbersOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model  +
                ", power (kV)="+ powerCalc()+ '\''+
                '}';
    }
}
