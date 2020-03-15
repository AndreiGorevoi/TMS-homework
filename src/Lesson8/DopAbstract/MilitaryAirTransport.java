package Lesson8.DopAbstract;

public class MilitaryAirTransport extends AirTransport {
    Boolean isBailout;
    int numsOfRockets;

    private double powerCalc(){
        double power = (double)this.power*0.74;
        return power;
    }

    public void fireON(){
        if(numsOfRockets>0){
            System.out.println("rocket fired");
        }else {
            System.out.println("you have not rocket");
        }
    }

    public void bailout(){
        if(isBailout==true){
            System.out.println("vasilii fired");
        }else {
            System.out.println("soryy, but you don't have bailout");
        }
    }

    @Override
    public String toString() {
        return "MilitaryAirTransport{" +
                "isBailout=" + isBailout +
                ", numsOfRockets=" + numsOfRockets +
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
