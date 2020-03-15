package Lesson8.MetEx26;

public class CoffeMakerWhitCapuchinator extends CoffeMaker {
    String typeOfCapuchinator;
    public CoffeMakerWhitCapuchinator(int power, String comeFrom, String model,
                                      int volumeOfTurka,String typeOfCapuchinator){
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
                ", volumeOfTurka=" + volumeOfTurka +
                ", power=" + power +
                ", comeFrom='" + comeFrom + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
