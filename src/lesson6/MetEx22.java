package lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetEx22 {
    /*Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.*/
    public static void main(String[] args) {
        String str = "This is string with 1234 0x12F2A3 and 0xF531AC1 numbers";
        Pattern pattern = Pattern.compile("0x[0-9A-F]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            String strTemp = matcher.group();
            System.out.println(strTemp);
            System.out.print(" В десятичной системе исчеслений ");
            int numTemp = Integer.parseInt(strTemp.substring(2),16);
            System.out.println(numTemp);
        }

    }
}
