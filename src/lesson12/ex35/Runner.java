package lesson12.ex35;

import java.io.*;
import java.util.ArrayList;
/*Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.*/
public class Runner {
    public static void main(String[] args) throws Exception {
        File filePath = new File("src/lesson12/ex35/file.txt");
        ArrayList<Integer> arrayList = new ArrayList<>(20);
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath));
            DataInputStream dis = new DataInputStream(new FileInputStream(filePath))){
            for (int i = 0; i <20 ; i++) {
                dos.writeInt((int)(Math.random()*100));
            }
            int res = dis.readInt();
            while (true){
                arrayList.add(res);
                try {
                    res=dis.readInt();
                }catch (EOFException e){
                    break;
                }
            }

        }

        System.out.println(arrayList);
        int sum = 0;
        for (Integer a:arrayList) {
            sum+=a;
        }
        System.out.println((double) ((sum)/arrayList.size()));
    }
}
