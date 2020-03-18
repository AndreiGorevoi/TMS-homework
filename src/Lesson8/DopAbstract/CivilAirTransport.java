package Lesson8.DopAbstract;

public class CivilAirTransport extends AirTransport {
    private int maxNumbersOfPassengers;
    private Boolean isBusiness;

    public int getMaxNumbersOfPassengers() {
        return maxNumbersOfPassengers;
    }

    public Boolean getBusiness() {
        return isBusiness;
    }

    public void setMaxNumbersOfPassengers(int maxNumbersOfPassengers) {
        this.maxNumbersOfPassengers = maxNumbersOfPassengers;
    }

    public void setBusiness(Boolean business) {
        isBusiness = business;
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
                ", wingsSpan=" + +getWingsSpan()+
                ", spaceForTakeoff=" + getSpaceForTakeoff() +
                ", power=" + getPower() +
                ", maxSpeed=" + getMaxSpeed() +
                ", weight=" + getWeight() +
                ", model='" + getModel()  +
                ", power(kV)= " + powerCalc()+'\''+
                '}';
    }
}
