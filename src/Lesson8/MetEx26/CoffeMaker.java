package Lesson8.MetEx26;

public class CoffeMaker extends Appliances {
    protected int volumeOfTurka;

    public int getVolumeOfTurka() {
        return volumeOfTurka;
    }

    public void setVolumeOfTurka(int volumeOfTurka) {
        this.volumeOfTurka = volumeOfTurka;
    }

    public CoffeMaker(int power, String comeFrom, String model, int volumeOfTurka){
        this.volumeOfTurka=volumeOfTurka;
       this.power=power;
       this.comeFrom=comeFrom;
       this.model=model;
    }
    @Override
    void powerOn() {
        System.out.println("Bzhhhh");
    }

    @Override
    void getComeFrom() {
        System.out.println("Made in " + comeFrom);

    }

    @Override
    public String toString() {
        return "CoffeMaker{" +
                "volumeOfTurka=" + volumeOfTurka +
                ", power=" + power +
                ", comeFrom='" + comeFrom + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
