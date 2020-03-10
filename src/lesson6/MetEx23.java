package lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetEx23 {
    /*Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
которых есть параметры, например <p id=”p1”>, и замену их на простые теги
абзацев <p>.*/
    public static void main(String[] args) {
        String str = "<p>Пример абзаца без атрибутов</p>\n" +
                "<p class=\"my_parag\">Пример абзаца с атрибутом class</p>\n" +
                "<p id=\"my_parag1\">Пример абзаца с атрибутом id</p>";
        Pattern pattern = Pattern.compile("<p>|<p.+?>");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            str = str.replace(matcher.group(),"<p>");
        }
        System.out.println(str);
    }

}
