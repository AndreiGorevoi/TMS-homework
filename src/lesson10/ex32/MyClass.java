package lesson10.ex32;

import java.util.HashMap;
import java.util.Map;

public class MyClass {
    /*Имеется текст. Следует составить для него частотный словарь.*/
    public static void main(String[] args) {
        String str = "Базовым Андрей базовым. Является Базовым является Является! Андрей Андрей,базовым";
        str=str.toLowerCase();
        int value =1;
        Map<String,Integer> hashMap = new HashMap();

        String[] strArray= str.split("\\s*(\\s|,|!|-|\\.)\\s*");

        for (int i = 0; i <strArray.length ; i++) {
            if(!hashMap.containsKey(strArray[i])){
                hashMap.put(strArray[i],value);
            }else {
                Integer old = hashMap.get(strArray[i]);
                hashMap.put(strArray[i],++old);
            }
        }
        System.out.println(hashMap);
        System.out.println(hashMap.keySet());
        }

    }

