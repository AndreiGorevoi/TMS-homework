package homework3;

public class MetodaEx9 {
    public static void main(String[] args) {
        double mul = 1;
        double avarageMult = 0;
        int x = (int) (Math.random()*20);
        int n=0; // Счетчик итераций;

        while (x!=0){
            mul*=x;
            n++;
            x = (int) (Math.random()*20);
        }

        if(n!=0){
            avarageMult=mul/n;
        }
        System.out.println("Факториал чисел:" + mul);
        System.out.println("среднее:" + avarageMult);
    }
}
