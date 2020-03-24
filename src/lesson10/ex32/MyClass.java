package lesson10.ex32;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

public class MyClass {
    /*Имеется текст. Следует составить для него частотный словарь.*/
    public static void main(String[] args) {
        String str = "Базовым классом для всех отображений является абстрактный класс AbstractMap, " +
                "который реализует большую часть методов интерфейса Map. Наиболее распространенным " +
                "классом отображений является HashMap, который реализует интерфейс Map и наследуется от " +
                "класса AbstractMap.";
        ArrayList <String> arrayList = new ArrayList<>();

        String[] str2= str.split("\\s*(\\s|,|!|-|\\.)\\s*");

        for (String strFor:str2) {
            arrayList.add((String) strFor);
        }

        Iterator iterator=arrayList.iterator();

        ArrayList <String> dictionary = new ArrayList<>();
        ArrayList <Integer> numsOfMeet = new ArrayList<>();
        while (iterator.hasNext()){
            int tempNum =0;
            String temp = (String) iterator.next();
            for (String strFor:arrayList) {
                if(strFor.equals(temp)){
                    tempNum++;
                }

            }
            if(dictionary.indexOf(temp)<0){
                dictionary.add(temp);
                numsOfMeet.add(tempNum);
            }

        }
        iterator = dictionary.iterator();
        Iterator iterator1 = numsOfMeet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " " + iterator1.next());
        }

    }
}
