package Lesson8.MetEx26;

public class Runner {
    public static void main(String[] args) {
        Appliances cofM1 = new CoffeMaker(2000,"Norway","DeLongi 300", 60);
        cofM1.getComeFrom();
        cofM1.powerOn();
        System.out.println(cofM1);
        Appliances cofM2 = new CoffeMakerWhitCapuchinator(3500,"Norway","DeLongi VS-500",
                120,"HandType capuchinator");
        cofM2.getComeFrom();
        cofM2.powerOn();
        System.out.println(cofM2);
    }
}
