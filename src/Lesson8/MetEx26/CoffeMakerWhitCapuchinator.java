package Lesson8.MetEx26;

public class CoffeMakerWhitCapuchinator extends CoffeMaker {
    private String typeOfCapuchinator;

    public void setTypeOfCapuchinator(String typeOfCapuchinator) {
        this.typeOfCapuchinator = typeOfCapuchinator;
    }

    public String getTypeOfCapuchinator() {
        return typeOfCapuchinator;
    }

    public CoffeMakerWhitCapuchinator(int power, String comeFrom, String model,
                                      int volumeOfTurka, String typeOfCapuchinator){
        super(power,comeFrom,model,volumeOfTurka);
        this.typeOfCapuchinator=typeOfCapuchinator;
    }

    @Override
    public void powerOn(){
        System.out.println("bzhzhzhzh and bulk bulk");
    }

    @Override
    public String toString() {
        return "CoffeMakerWhitCapuchinator{" +
                "typeOfCapuchinator='" + typeOfCapuchinator + '\'' +
                ", volumeOfTurka=" + getVolumeOfTurka() +
                ", power=" + getPower() +
                ", comeFrom='" + getcomeFrom() + '\'' +
                ", model='" + getModel() + '\'' +
                '}';
    }
}
