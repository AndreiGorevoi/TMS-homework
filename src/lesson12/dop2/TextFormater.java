package lesson12.dop2;

public class TextFormater {

    public int getNumOfWords(String s){
        String[] words = s.split("\\s*(\\s|,|!|\\.)\\s*");
        return words.length;
    }

    public boolean isTherePolindrom(String s){
        boolean result=false;
        s=s.toLowerCase();
        String[] words = s.split("\\s*(\\s|,|!|\\.)\\s*");
        for (String word: words) {
            String reverse="";
            for (int i =word.length()-1; i>-1 ; i--) {
                reverse+=word.charAt(i);
            }
            if(word.equals(reverse)&& word.length()>1){
                result=true;
            }
        }
        return result;
    }
}
