package Lesson8.by.teachmeskills.robot.heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price){
        this.price=price;

    }
    @Override
    public void speek() {
        System.out.println("Говорит голова samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
