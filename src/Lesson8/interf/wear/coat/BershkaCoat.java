package Lesson8.interf.wear.coat;

public class BershkaCoat implements ICoat {
    public void getDress() {
        System.out.println("Bershka coat is got dressed ");
    }

    @Override
    public void getUndress() {
        System.out.println("Bershka coat is got undressed ");
    }
}
