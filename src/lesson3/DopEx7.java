package homework3;

public class DopEx7 {
    /*Напишите программу, определяющую сумму всех нечетных чисел от 1до 99*/
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <100 ; i+=2) {
            sum+=i;
        }
        System.out.println(sum);

    }
}
