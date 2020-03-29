package lesson10.ex31;

import java.util.ArrayList;
import java.util.Iterator;

public class MyClass {
    /*Создать список оценок учеников с помощью ArryList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.*/
    public static void main(String[] args) {
        ArrayList<Integer> gradesOfPupil = new ArrayList<>(25);
        for (int i = 0; i <20 ; i++) {
            gradesOfPupil.add((int)(Math.random()*10));
        }
        System.out.println(gradesOfPupil);

        Iterator iterator = gradesOfPupil.iterator();
        int maxGrade=0;
        while (iterator.hasNext()){
            int temp = (int) iterator.next();
            if(temp>maxGrade){
                maxGrade=temp;
            }
        }
        System.out.println(maxGrade);
    }
}
