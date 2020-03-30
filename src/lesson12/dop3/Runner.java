package lesson12.dop3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/*) Проверка на цензуру:
Создаете 2 файла.
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
определите сами, хотите каждое слово на новой строке, хотите через запятую
разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
встретилось ни одного недопустимого слова, то выводите сообщение о том что
текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
сообщение, кол-во предложений не прошедших проверку и сами предложения
подлежащие исправлению.
*/
public class Runner {
    public static void main(String[] args) {
        String myText = "";
        ArrayList<String> censureList = new ArrayList<>();
        TextScanner textScanner = new TextScanner();

       try(BufferedReader br = new BufferedReader(new FileReader("src/lesson12/dop3/text.txt"));
       BufferedReader br2 = new BufferedReader(new FileReader("src/lesson12/dop3/censure.txt"))) {
           int a = br.read();
           while (a!=-1){
               myText+=(char)a;
               a=br.read();
           }

           String result=br2.readLine();
           while (result!=null){
               censureList.add(result);
               result=br2.readLine();
           }

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }


       textScanner.result(myText,censureList);

    }
}
