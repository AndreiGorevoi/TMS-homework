package Lesson8.DopAbstract;

public class MilitaryAirTransport extends AirTransport {
    private Boolean isBailout;

    public Boolean getBailout() {
        return isBailout;
    }

    public int getNumsOfRockets() {
        return numsOfRockets;
    }

    public void setBailout(Boolean bailout) {
        isBailout = bailout;
    }

    public void setNumsOfRockets(int numsOfRockets) {
        this.numsOfRockets = numsOfRockets;
    }

    private int numsOfRockets;

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
                ", wingsSpan=" + getWingsSpan()  +
                ", spaceForTakeoff=" + getSpaceForTakeoff()  +
                ", power=" + powerCalc() +
                ", maxSpeed=" + getMaxSpeed() +
                ", weight=" + getWeight() +
                ", model='" + getModel()  +
                ", power(kV)= " + powerCalc()+'\''+
                '}';
    }
}
