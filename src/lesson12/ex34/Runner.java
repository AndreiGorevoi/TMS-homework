package lesson12.ex34;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.*/
public class Runner {
    public static void main(String[] args) {
        File filePath = new File("src/lesson12/ex34/text.txt");
        String result="";
        double sumOfNums=0;
        String stringWhitoutReply="";

        try(FileReader fis = new FileReader(filePath)) {
             int a=fis.read();
             while (a!=-1){
                 result+=""+(char)a;
                 a=fis.read();
             }
            System.out.println(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        ArrayList<Double> arrayList = new ArrayList<>();
        ArrayList<Double> arrayListWithoutReply = new ArrayList<>();
        // подсчет суммы и вывод числе
        Pattern pattern = Pattern.compile("-?[0-9]+");
        Matcher matcher = pattern.matcher(result);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
            arrayList.add(Double.valueOf(matcher.group()));
        }
        System.out.println();
        for (Double a: arrayList) {
            sumOfNums+=a;
        }
        System.out.println(sumOfNums);
        //удаление повторений
        for (Double a:arrayList) {
            if((arrayListWithoutReply.indexOf(a))<0){
                arrayListWithoutReply.add(a);
            }
        }
        System.out.println(arrayListWithoutReply);
    }
}
