package lesson10.ex28;

public class Runner {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.add(1);
        box1.add(2);
        box1.add(3);
       int x = box1.get(1);
    }
}
