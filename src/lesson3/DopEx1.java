package homework3;


public class DopEx1 {
    /*1)Начав тренировки, спортсмен в первый день пробежал 10 км.
    Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
    Какойсуммарный путь пробежит спортсмен за 7 дней?*/
    public static void main(String[] args) {
        double startDistance = 10.0;
        double sumDistance=10.0;
        for (int i = 0; i <8 ; i++) {
            startDistance+=startDistance*0.1;
            sumDistance+=startDistance;
        }
        System.out.println("Finish distance is "+ (int)sumDistance);
    }
}
