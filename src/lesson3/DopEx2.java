package homework3;

public class DopEx2 {
    /*Одноклеточная амеба каждые 3 часа делится на 2 клетки.
     Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/
    public static void main(String[] args) {
        int numberOfAmebs = 1;
        for (int i = 3; i <25 ; i+=3) {
            numberOfAmebs*=2;
            System.out.println("After " + i + " hours: " + numberOfAmebs);
        }
    }
}
