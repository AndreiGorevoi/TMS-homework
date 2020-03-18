package Lesson8.DopAbstract;

public class MilitaryAirTransport extends AirTransport {
    private Boolean isBailout;
    private int numsOfRockets;

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
        return super.toString()+"MilitaryAirTransport{" +
                "isBailout=" + isBailout +
                ", numsOfRockets=" + numsOfRockets +
                '}';
    }
}
