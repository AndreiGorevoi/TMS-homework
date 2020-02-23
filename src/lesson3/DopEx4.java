package homework3;

public class DopEx4 {
    public static void main(String[] args) {
        //Произведение а на б без оператора умножения
        int a=5;
        int b=10;
        int schet=1;
        double mult=0;

        while (schet<=b){
            mult+=a;
            schet++;
        }
        System.out.println(mult);
    }
}
