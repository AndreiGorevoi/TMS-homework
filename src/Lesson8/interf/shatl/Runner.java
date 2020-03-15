package Lesson8.interf.shatl;

public class Runner {
    public static void main(String[] args) {
    IStart shatl = new Shatl();
    IStart creiser = new StarCruiser(10);
    IStart sputnik = new Sputnik(2150);
    Cosmodrom cosmodrom = new Cosmodrom();
    cosmodrom.start(shatl);
    cosmodrom.start(creiser);
    cosmodrom.start(sputnik);

    }


}
