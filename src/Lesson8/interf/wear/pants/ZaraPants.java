package Lesson8.interf.wear.pants;

public class ZaraPants implements IPants {
    public void getDress() {
        System.out.println("Zara pants is got dressed ");
    }

    @Override
    public void getUndress() {
        System.out.println("Zara pants is got undressed ");
    }
}
