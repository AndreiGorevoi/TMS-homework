package homework3;

public class MetodaEx6 {
    public static void main(String[] args) {
        int number = -582;
//        проверка на трехзначность
        if((number>99 && number<1000) || (number<-99 && number>-1000)){
            System.out.println("Ваше число - трехзначное");
        } else {
            System.out.println("Ваше число - не трехзначное");
        }
        // проверка на последнее число
        if(number%10==7){
            System.out.println("Последняя цифра вашего числа - 7");
        } else {
            System.out.println("Последняя цифра вашего числа - " + Math.abs(number%10) );
        }
//        проверка на четность
        if(number%2==0){
            System.out.println("Ваше число четное");
        }else {
            System.out.println("Ваше число нечетное");
        }

    }
}
