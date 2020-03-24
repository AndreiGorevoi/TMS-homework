package lesson10.shop;

import java.util.ArrayList;

public class Runner {

/*В main:
•создаем объект магазина
•создаем пару тройку товаров и добавляем эти товары в магазин
*/
    public static void main(String[] args) {
        Shop shop = new Shop();
        Item item1 = new Item("chocolate",5);
        Item item2 = new Item("meat",10);
        Item item3 = new Item("bread",3);
        Item item4 = new Item("milk",1);

        shop.setItem(item1);
        shop.setItem(item2);
        shop.setItem(item2);
        shop.setItem(item3);
        shop.setItem(item4);

    //получаем список товаров из магазина, сортируем по цене(по
        //возрастанию) и выводим в консоль.
        ArrayList <Item> sortList = shop.getAllItems();

        for (Item a: sortList) {
            System.out.print(a.getName() +" - "+ a.getPrice()+"| ");
        }
        sortList.sort((o1, o2) -> o2.getPrice()-o1.getPrice());
        System.out.println();
        for (Item a: sortList) {
            System.out.print(a.getName() +" - "+ a.getPrice()+"| ");
        }
        System.out.println();

// удаляем один товар
//•получаем список товаров из магазина, сортируем по порядку
//добавления(последние добавленные в начале) и выводим в консоль.
    shop.deleteItem(3);
    sortList = shop.getAllItems();
    sortList.sort((o1, o2) -> o1.getId()-o2.getId());

        for (Item a: sortList) {
            System.out.print(a.getName() +" - "+ a.getPrice()+"| ");
        }
        System.out.println();

        /*•редактируем один товар
•получаем список товаров и выводим в консоль
*/
        sortList.get(1).setName("New name");
        for (Item a: sortList) {
            System.out.print(a.getName() +" - "+ a.getPrice()+"| ");
        }



    }
}
