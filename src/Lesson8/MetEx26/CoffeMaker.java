package Lesson8.MetEx26;

public class CoffeMaker extends Appliances {
    private int volumeOfTurka;

    public int getVolumeOfTurka() {
        return volumeOfTurka;
    }

    public void setVolumeOfTurka(int volumeOfTurka) {
        this.volumeOfTurka = volumeOfTurka;
    }

    public CoffeMaker(int power, String comeFrom, String model, int volumeOfTurka){
        this.volumeOfTurka=volumeOfTurka;
       setPower(power);
       setComeFrom(comeFrom);
       setModel(model);
    }
    @Override
    void powerOn() {
        System.out.println("Bzhhhh");
    }

    @Override
    void getComeFrom() {
        System.out.println("Made in " + getcomeFrom());

    }

    @Override
    public String toString() {
        return "CoffeMaker{" +
                "volumeOfTurka=" + volumeOfTurka +
                ", power=" + getPower() +
                ", comeFrom='" + getcomeFrom() + '\'' +
                ", model='" + getModel() + '\'' +
                '}';
    }
}
