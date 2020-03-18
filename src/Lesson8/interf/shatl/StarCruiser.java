package Lesson8.interf.shatl;

public class StarCruiser implements IStart{
    private int numOfMotors;

    public StarCruiser(int numOfMotors){
        this.numOfMotors=numOfMotors;
    }
    @Override
    public boolean prestartCheckSystem() {
     if (numOfMotors<6){
         return false;
     }else {
         return true;
     }
    }

    @Override
    public void startMotor() {
        System.out.println("Status of systems is OK! Motor is started");
    }

    @Override
    public void start() {
        System.out.println("Starting of cruiser");
    }
}
