package homework3;

public class MetodaEx10 {
    /*Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию)*/
    public static void main(String[] args) {
        double fact=1;
        int number=10;
        while (number<=15){
            fact*=number;
            number++;
        }
        System.out.println(fact);
    }
}
