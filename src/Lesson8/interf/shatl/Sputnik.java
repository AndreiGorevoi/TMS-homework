package Lesson8.interf.shatl;

public class Sputnik implements IStart {
    private int volumeOfFuel; // liter
    private final int fuelConsumption=60;// liter on 1000 km
    private double distanceOftrip;
    public Sputnik(int volumeOfFuel){
        this.volumeOfFuel=volumeOfFuel;
    }

    @Override
    public boolean prestartCheckSystem() {
        int random = (int) (Math.random()*2);
        if(random==0){
            distanceOftrip = 35000;
            if((distanceOftrip/1000)*fuelConsumption<volumeOfFuel){
                return true;
            }else {
                return false;
            }

        }else {
            distanceOftrip=65000;
        if((distanceOftrip/1000)*fuelConsumption<volumeOfFuel){
                return true;
            }else {
                return false;
            }
        }

    }

    @Override
    public void startMotor() {
        System.out.println("Status of systems is OK! Motor is started");
    }

    @Override
    public void start() {
        System.out.println("Starting of sputnik");
    }
}
