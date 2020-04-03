package lesson12.dop1;

import java.io.*;
import java.util.ArrayList;
/*1)В исходном файле находятся слова, каждое слово на новой стороке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы
*/
public class polindromi {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> reversedArrayList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("src/lesson12/dop1/startFile.txt"))) {
            String res = br.readLine();
            while (res!=null){
                arrayList.add(res);
                res=br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String a:arrayList) {
            StringBuffer reverse = new StringBuffer(a);
            reverse.reverse();
            if(a.equalsIgnoreCase(String.valueOf(reverse))){
                reversedArrayList.add(a);
            }
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/lesson12/dop1/endFile.txt"))) {
            for (String a: reversedArrayList) {
                bw.write(a+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
