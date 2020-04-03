package lesson12.dop2;

import java.io.*;
/*2)Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.

Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false

В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл
*/
public class Runner {
    public static void main(String[] args) {
        File file = new File("src/lesson12/dop2/text.txt");
        String stringStr="";
        String finalString="";
        TextFormater textFormater = new TextFormater();

        try(FileReader fr = new FileReader(file)) {
            int a = fr.read();
            while (a!=-1){
                stringStr+=(char)a;
                a=fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Разбивка текста на предложения
        String[] strArray = stringStr.split("[\\.\\!\\?][\\s]?");
        for (String sentence:strArray) {
            if(textFormater.getNumOfWords(sentence)>2&& textFormater.getNumOfWords(sentence)<6){
                finalString+=sentence+".";
            }else if((textFormater.getNumOfWords(sentence)<3|| textFormater.getNumOfWords(sentence)>5)
                    && textFormater.isTherePolindrom(sentence)){
                finalString+=sentence+".";
            }
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/lesson12/dop2/newText.txt"))) {
            bw.write(finalString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
