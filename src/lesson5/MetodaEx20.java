package lesson5;

import java.util.regex.Pattern;

public class MetodaEx20 {
    /*Имеется строка с текстом. Вывести текст, составленный из последних букв
    всех слов.*/
    public static void main(String[] args) {
        String str = "  Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.  ";
        char symbol;
        str= str.trim();
        // Второй метод через split
        for (String retval: str.split(" ")) {
                char temp = retval.charAt(retval.length()-1);
            if (temp!='.' && temp!='!' && temp!='?' && temp!='-' && temp!=';' && temp!=':'&& temp!=',') {
                System.out.print(temp);
            }else {
                System.out.print(retval.charAt(retval.length()-2));
            }
        }

       /* for (int i = 0; i <str.length() ; i++) {
            symbol=str.charAt(i);
           if(symbol==' ' && (str.charAt(i-1)!='.'&& str.charAt(i-1)!=',' && str.charAt(i-1)!=';' && str.charAt(i-1)!=':'
            && str.charAt(i-1)!='?' && str.charAt(i-1)!='!' && str.charAt(i-1)!='-')){
               strOfLastChars+=str.charAt(i-1);
           }
            if(symbol=='.' || symbol=='!' || symbol=='?' || symbol=='-' ||symbol==';' || symbol==':'){
               strOfLastChars+=str.charAt(i-1);
           }
        }*/

    }
}
