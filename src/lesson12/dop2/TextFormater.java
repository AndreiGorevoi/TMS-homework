package lesson12.dop2;

public class TextFormater {

    public int getNumOfWords(String s){
        String[] words = s.split("\\s*(\\s|,|!|\\.)\\s*");
        return words.length;
    }

    public boolean isTherePolindrom(String s){
        boolean result=false;
        String[] words = s.split("\\s*(\\s|,|!|\\.)\\s*");
        for (String word: words) {
            StringBuffer reverse= new StringBuffer(word);
            reverse.reverse();
            if(word.equalsIgnoreCase(String.valueOf(reverse))&& word.length()>1){
                result=true;
            }
        }
        return result;
    }
}
