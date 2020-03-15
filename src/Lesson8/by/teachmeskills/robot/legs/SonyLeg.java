package Lesson8.by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price){
        this.price=price;
    }
    @Override
    public void step() {
        System.out.println("Нога сделала шаг Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
