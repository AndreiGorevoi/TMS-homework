package lesson5;

public class MetodaEx20 {
    public static void main(String[] args) {
        String str = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";
        char symbol;
        str= str.trim();
        String strOfLastChars = "";

        for (int i = 0; i <str.length() ; i++) {
            symbol=str.charAt(i);
           if(symbol==' ' && (str.charAt(i-1)!='.'&& str.charAt(i-1)!=',' && str.charAt(i-1)!=';' && str.charAt(i-1)!=':'
            && str.charAt(i-1)!='?' && str.charAt(i-1)!='!' && str.charAt(i-1)!='-')){
               strOfLastChars+=str.charAt(i-1);
           }
            if(symbol=='.' || symbol=='!' || symbol=='?' || symbol=='-' ||symbol==';' || symbol==':'){
               strOfLastChars+=str.charAt(i-1);
           }
        }
        System.out.println(strOfLastChars);
    }
}
