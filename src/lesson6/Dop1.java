package lesson6;

public class Dop1 {
    /* Вырезать подстроку из строки начиная с первого вхождения символа на произвольной позиции
    до последнего вхождения другого символа на произвольной позиции.
    Первый символ должен быть выбран рандомно из первой половины предложения, второй - из второй.
    Если символы совпадают, генерировать пары, пока символы не будут различны.
     */
    public static void main(String[] args) {
        String str = "Шел Вася по шоссе и ссосал он сушку";
        String subString="";
        int poz1 = 0;
        int poz2 = 0;
        while (poz1==poz2){
            poz1 = (int) (Math.random()*((str.length()/2)+1));
            poz2 = (int) (18+Math.random()*((str.length()/2)+1));;
    }
        subString= str.substring(poz1,poz2);
        System.out.println(poz1 + " " + poz2);
        System.out.println(subString);

    }
}
