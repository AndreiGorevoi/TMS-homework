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
                for (Map.Entry<String,Integer> item:hashMap.entrySet()) {
                    if(item.getKey().equals(strArray[i])){
                        hashMap.put(strArray[i],item.getValue()+1);
                    }
                }
            }
        }
        System.out.println(hashMap);
        System.out.println(hashMap.keySet());
        }
        
        

      /*  ArrayList <String> arrayList = new ArrayList<>();

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
        }*/





    }

