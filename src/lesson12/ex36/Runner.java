package lesson12.ex36;

import java.io.File;
/*
Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
должны быть распечатаны отдельно.*/
public class Runner {
    public static void main(String[] args) {
        File file = new File("c:/andrew/");
       if(file.isDirectory()){
           System.out.println(file.getName());
           File[] file1 = file.listFiles();
           for (int i = 0; i <file1.length ; i++) {
               if(file1[i].isDirectory()){
                   System.out.println("\t"+file1[i].getName());
                   File[] file2= file1[i].listFiles();
                   for (int j = 0; j <file2.length ; j++) {
                       System.out.println("\t\t"+file2[j].getName());
                   }
               }else {
                   System.out.println("\t"+file1[i].getName());
               }
           }
       }else {
           System.out.println(file.getName());
       }
    }
}
