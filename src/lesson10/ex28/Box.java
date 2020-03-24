package lesson10.ex28;


import java.util.ArrayList;
import java.util.List;
/*Написать класс, который умеет хранить в себе массив любых типов данных (int, long
etc.). Реализовать метод get(int index), который возвращает любой элемент
массива по индексу.*/
public class Box<T> {
    ArrayList<T> arrayList;

    public Box(){
        arrayList=new ArrayList<>();
    }

}
