package Lesson8.DopAbstract;

public class FreightGroundTransport extends GroundTransport {
    double carrying; // в тоннах

    private double powerCalc(){
        double power = (double)this.power*0.74;
        return power;
    }

    public void testCarrying(double cargo){
        if(carrying>=cargo){
            System.out.println("truck is loaded");
        }else {
            System.out.println("you need bigger truck");
        }
    }

    @Override
    public String toString() {
        return "FreightGroundTransport{" +
                "carrying=" + carrying +
                ", numbersOfWheels=" + numbersOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model  +
                ", power(kV)= " + powerCalc()+'\''+
                '}';
    }
}
