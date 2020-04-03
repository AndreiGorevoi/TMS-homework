package lesson12.ex33;

import java.io.*;
import java.lang.reflect.Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.*/
public class Runner {
    public static void main(String[] args) {
        File file = new File("src/lesson12/ex33/text.txt");
        String result="";
        int numOfWords=0;
        int numOfMark=0;
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String write=br.readLine();
            while (write!=null){
                result +=write;
                write=br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] chars = new char[result.length()];
        result.getChars(0,result.length(),chars,0);
        //подсчет знаков
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]==',' || chars[i]=='.' ||chars[i]=='-' || chars[i]=='!' || chars[i]=='?'){
                numOfMark++;
            }
        }
        //подсчет слов
        Pattern pattern = Pattern.compile("\\s*(\\s|,|!|-|\\.)\\s*");
        Matcher matcher =pattern.matcher(result);

        while (matcher.find()){
            numOfWords++;
        }
        System.out.println(numOfMark);
        System.out.println(numOfWords);
    }
}
