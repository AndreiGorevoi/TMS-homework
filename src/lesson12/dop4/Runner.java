package lesson12.dop4;

import java.io.*;

public class Runner {
    /*4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
сериализации произвести обратный процесс
*/
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/lesson12/dop4/auto.dat"))) {
            Auto auto = new Auto("Mithubishi",220,65000);
            oos.writeObject(auto);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/lesson12/dop4/auto.dat"))) {
            Auto auto2 = (Auto)ois.readObject();
            System.out.println(auto2);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
