package Lesson8.interf.wear.shoes;

public class MarkoShoes implements IShoes {

    @Override
    public void getDress() {
        System.out.println("Marko shoes is got dressed ");
    }

    @Override
    public void getUndress() {
        System.out.println("Marko shoes is got undressed ");
    }
}
