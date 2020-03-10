package lesson6;

public class Dop2 {
    /*Заменить все вхождения символа стоящего в позиции 3 на символ стоящий в позиции 0*/
    public static void main(String[] args) {
        String str = "Бежал Вася по шоссе и ссосал он карамель";
        String subString;
        subString = str.replace(str.charAt(3),str.charAt(0));
        System.out.println(subString);
    }
}
