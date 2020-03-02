package lesson5;

public class MetodaEx18 {
    /*Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
общее их количество.*/
    public static void main(String[] args) {
        String str = "Строковый литерал — это последовательность символов, заключенных в двойные кавычки.";
        char symbol;
        int n=0;
        for (int i = 0; i <str.length() ; i++) {
            symbol=str.charAt(i);
            if (symbol=='—' ||symbol== '.'|| symbol==',' || symbol==';' || symbol==':' ||
                    symbol=='"' || symbol=='!' || symbol=='?' ) {
                n++;
            }
        }
        System.out.println("You have: " + n + " punctuation marks");
    }
}
