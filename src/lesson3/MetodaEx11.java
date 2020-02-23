package homework3;

public class MetodaEx11 {
    /*Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.*/
    public static void main(String[] args) {
        int number = 102;
        int n=0; //счетчик;
        for (int i = 2; i <Math.sqrt(number) ; i++) {
            if(number%i==0){
                n++;
            }
        }
        if(n==0){
            System.out.println("Ваше число -простое!");
        } else {
            System.out.println("Ваше число делится еще на " + n + " числа без остатка! =)");
        }
    }
}
