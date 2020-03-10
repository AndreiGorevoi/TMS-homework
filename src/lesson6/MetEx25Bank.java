package lesson6;

public class MetEx25Bank {
    public static void main(String[] args) {
        MetEx25 bank1 = new MetEx25(45,15,4);

        bank1.getMoney(3000);
        System.out.println(bank1);
        bank1.getMoney(10070);
        System.out.println(bank1);
        bank1.getMoney(2540);
        System.out.println(bank1);

        bank1.push20(20);
        System.out.println(bank1);
    }
}
