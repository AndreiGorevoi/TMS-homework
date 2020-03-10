package lesson6;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MetEx21 {
    /*Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения.*/
    public static void main(String[] args) {
        String string="String";
        StringBuilder stringBuilder = new StringBuilder("stringBuilder");
        StringBuffer stringBuffer = new StringBuffer("stringBuffer");
        //string
        long start = System.currentTimeMillis();

        for (int i = 0; i <500000 ; i++) {
            string+=i;
        }

        System.out.println("Время выполенеия String: " + (System.currentTimeMillis()-start)+" миллисекунд");
        //builder
        start = System.currentTimeMillis();
        for (int i = 0; i <500000 ; i++) {
            stringBuilder.append(i);
        }
        System.out.println("Время выполнения builder: " + (System.currentTimeMillis()-start)+" миллисекунд");
        //buffer
        start= System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            stringBuffer.append(i);
        }
        System.out.println("Время выполнения buffer: " + (System.currentTimeMillis()-start)+" миллисекунд");



    }

}
