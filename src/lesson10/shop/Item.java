package lesson10.shop;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*Создать класс Товар, поля:
•id(целое число)
•name(строка)
•price(целое число)
*/
public class Item {
    private static int schetcik;
    private int id;
    private String name;
    private int price;


    public Item(String name, int price){
        schetcik++;
        this.name=name;
        this.price=price;
        this.id=schetcik;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
