package lesson10.shop;

import java.util.ArrayList;
import java.util.Iterator;

/*Создать класс Магазин, поля:
•Список товаров (изначально пустой)
методы:
•добавить товар(принимает объект товара и добавляет его в список
товаров). При попытке добавить товар с id уже существующем в списке,
вставка производится не должна
•получить все товары(метод ВОЗВРАЩАЕТ список всех товаров в
магазине)
•удалить товар (метод принимает id товара и удаляет из списка товар с
соответствующим id)
•редактировать товар(принимает объект товара и редактирует им список
товаров)
*/
public class Shop {
   private ArrayList<Item> storage = new ArrayList<>();

    //добавление товара
    public void setItem(Item item) {

      boolean alreadyIs = false;
        for (Item a:storage) {
            if(a.getId()== item.getId()){
                alreadyIs=true;
            }
        }
        if(alreadyIs==false){
            storage.add(item);
        }
    }

    //Получить весь список товаров
    public ArrayList getAllItems(){
        return storage;
    }

    public void deleteItem(int id){
        Item itemForDelete = null;
        for (Item a:storage) {
            if(a.getId()==id){
                itemForDelete=a;
            }
        }
        if(itemForDelete==null){
            System.out.println("Item whith id: "+id+" hasn't been found");
        }else {
            storage.remove(itemForDelete);
        }

    }

    @Override
    public String toString() {
        String result ="";
        for (Item a: storage) {
            result += "| Name: " + a.getName() +" price:"+a.getPrice() + " id:" + a.getId()+ "| ";
        }
        return result;

    }
}
