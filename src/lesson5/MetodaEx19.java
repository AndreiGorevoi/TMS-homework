package lesson5;

public class MetodaEx19 {
    /*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать*/
    public static void main(String[] args) {
        String str = " My        name      is      Andrew.  I am a good man";
        char symbol;
        int n=1;
        str = str.trim();
        System.out.println(str);
        for (int i = 0; i <str.length() ; i++) {
            symbol=str.charAt(i);
            if((symbol==' ' || symbol=='-') && (str.charAt(i+1)!=' ')){
                n++;
            }
        }
        System.out.println("Your string has " + n +" words");

    }
}
