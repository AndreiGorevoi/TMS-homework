package homework3;

public class MetodaEx12 {
    public static void main(String[] args) {
        /*Найдите сумму первых n целых чисел, которые делятся на 3.*/
       int n=0;
       int sum=0;
        for (int i = 3; n <=20 ; i+=3) {
            sum+=i;
            n++;
        }
        System.out.println("Сумма первых " + n + " чисел которые делятеся на 3 = " + sum);
    }
}
