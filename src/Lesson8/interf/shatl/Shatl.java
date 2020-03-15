package Lesson8.interf.shatl;

public class Shatl implements IStart {

    @Override
    public boolean prestartCheckSystem() {
        int random = (int)(Math.random()*10);
        if(random>3) {
            return true;
        }else {
        return false;
        }

    }

    @Override
    public void startMotor() {
        System.out.println("Status of systems is OK! Motor is started");

    }

    @Override
    public void start() {
        System.out.println("Starting of shatl");
    }
}
