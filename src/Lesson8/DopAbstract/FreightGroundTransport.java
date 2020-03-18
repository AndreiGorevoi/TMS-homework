package Lesson8.DopAbstract;

public class FreightGroundTransport extends GroundTransport {

    private double carrying; // в тоннах

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    public double getCarrying() {
        return carrying;
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
        return super.toString()+"FreightGroundTransport{" +
                "carrying=" + carrying +
                '}';
    }
}
