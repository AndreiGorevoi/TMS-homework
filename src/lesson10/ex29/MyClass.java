package lesson10.ex29;

import javax.jws.Oneway;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
/*Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Удалить неудовлетворительные оценки из списка.*/
public class MyClass {
    public static void main(String[] args) {
        ArrayList <Integer> gradesOfPupils = new ArrayList<>(21);
        ArrayList<Integer> badGraders = new ArrayList<>();
        for (int i = 0; i <21 ; i++) {
            int grade = (int)(Math.random()*10);
            gradesOfPupils.add(grade);
        }
        System.out.println(gradesOfPupils);
        for (int i = 0; i <4 ; i++) {
            badGraders.add(i);
        }
        gradesOfPupils.removeAll(badGraders);
        System.out.println(gradesOfPupils);
    }
}
