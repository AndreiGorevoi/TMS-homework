package lesson5;

import java.util.regex.Pattern;

public class MetodaEx20 {
    /*Имеется строка с текстом. Вывести текст, составленный из последних букв
    всех слов.*/
    public static void main(String[] args) {
        String str = "  Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.  ";
        char symbol;
        str= str.trim();
        // Метод через split
        String [] strArr = str.split("\\s*(\\s|,|\\||!|\\.)\\s*");
        for (int i = 0; i <strArr.length ; i++) {
            System.out.print(strArr[i].charAt(strArr[i].length()-1));
        }

    }
}
