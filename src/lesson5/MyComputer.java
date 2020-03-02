package lesson5;

public class MyComputer {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Intel i-core 5","4 GB DDR3","SSD 240 GB");
        comp1.turnOn();
        if (comp1.statusOfLife==1){
            comp1.turnOff();
        }
        if (comp1.statusOfLife==1) {
            comp1.turnOn();
        }
        if (comp1.statusOfLife==1) {
            comp1.turnOff();
        }
    }
}
