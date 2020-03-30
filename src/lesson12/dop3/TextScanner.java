package lesson12.dop3;

import java.util.ArrayList;

public class TextScanner {

    public boolean isThereBadWord(String text, ArrayList<String> censureList){
        boolean result=false;
        text=text.toLowerCase();
        for (String badWord: censureList) {
           badWord=badWord.toLowerCase();
            if(text.contains(badWord)){
                result=true;
            }
        }
        return result;
    }

    public void result(String text, ArrayList<String> censureList){
        if(isThereBadWord(text,censureList)){
            int numOfBadWords=0;
            System.out.println("text hasn't checked out");
            //разбивка текста на предложения
            String [] arrayText = text.split("[\\.\\!\\?][\\s]?");
           // проверка на количество цензуры и вывод предложений с цензурой
            for (String sentence: arrayText) {
                boolean isThereBadWord = false;
                for (String badWord: censureList) {
                    badWord=badWord.toLowerCase();
                    if(sentence.contains(badWord)){
                        numOfBadWords++;
                        isThereBadWord=true;
                    }
                }
                if(isThereBadWord){
                    System.out.println("you ought to create the sentence: " + sentence);
                }
            }
            System.out.println("num of bad words: " +numOfBadWords);
        }else {
            System.out.println("text has been checked out");
        }
    }
}
