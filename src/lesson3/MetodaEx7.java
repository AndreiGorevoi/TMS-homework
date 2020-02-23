package homework3;

public class MetodaEx7 {
    public static void main(String[] args) {
        double a=3.0, b=4.0, r=2.4;
        if (a>0 && b>0 && r>0){
            if(r>= (Math.sqrt(a*a+b*b)/2)){
                System.out.println("Данной окружностью можно закрыть отверстие");
            } else {
                System.out.println("Нужна картонка побольше!");
            }
        }else {
            System.out.println("Сторона или радиус не может быть меньше или равен 0!");
        }
    }

}
