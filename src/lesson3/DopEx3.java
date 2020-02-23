package homework3;

public class DopEx3 {
    /*3)Вычислить: 1+2+4+8+...+2564)
    Составьте программу, вычисляющую A*B, не пользуясь операциейумножения*/

    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <2565 ; i*=2) {
            sum+=i;
        }
        System.out.println(sum);

    }
}
