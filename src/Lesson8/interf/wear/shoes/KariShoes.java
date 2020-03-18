package Lesson8.interf.wear.shoes;

public class KariShoes implements IShoes {
    public void getDress() {
        System.out.println("Kari shoes is got dressed ");
    }

    @Override
    public void getUndress() {
        System.out.println("Kari shoes is got undressed ");
    }
}
