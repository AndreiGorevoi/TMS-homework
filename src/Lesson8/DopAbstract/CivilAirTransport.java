package Lesson8.DopAbstract;

public class CivilAirTransport extends AirTransport {
    int maxNumbersOfPassengers;
    Boolean isBusiness;

    private double powerCalc(){
        double power = (double)this.power*0.74;
        return power;
    }

    public void testNumOfPassengers(int numbersOfPassengers){
        if (maxNumbersOfPassengers>=numbersOfPassengers){
            System.out.println("airplane is loaded");
        }else {
            System.out.println("you need bigger airplane");
        }

    }

    @Override
    public String toString() {
        return "CivilAirTransport{" +
                "maxNumbersOfPassengers=" + maxNumbersOfPassengers +
                ", isBusiness=" + isBusiness +
                ", wingsSpan=" + wingsSpan +
                ", spaceForTakeoff=" + spaceForTakeoff +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model  +
                ", power(kV)= " + powerCalc()+'\''+
                '}';
    }
}
