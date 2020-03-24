package lesson10.ex30;

import java.util.ArrayList;
import java.util.HashSet;

public class MyClass {
    /*Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.*/
  /*  public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i <20 ; i++) {
            hashSet.add((int)(Math.random()*100));
        }
        System.out.println(hashSet);
    }*/
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(21);
        ArrayList<Integer> newArrayList = new ArrayList<>(20);

        for (int i = 0; i <21 ; i++) {
            int grade = (int)(Math.random()*10);
            arrayList.add(grade);
        }

        System.out.println(arrayList);

        for (Integer a: arrayList) {
            if(newArrayList.indexOf((Object) a)<0){
                newArrayList.add(a);
            }

        }
        System.out.println(newArrayList);


    }
}
