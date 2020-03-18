package Lesson8.interf.wear.pants;

public class KotonPants implements IPants {
    public void getDress() {
        System.out.println("Koton pants is got dressed ");
    }

    @Override
    public void getUndress() {
        System.out.println("Koton pants is got undressed ");
    }
}
