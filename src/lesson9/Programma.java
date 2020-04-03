package lesson9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Programma {
    public static void runPrivateClass(MyService myService) {
        try {
            Method method = myService.getClass().getDeclaredMethod("thisClassInfo");
            method.setAccessible(true);
            method.invoke(myService);
        } catch (Exception e) {
            System.out.println("not found method");
        }

    }

    public static void main(String[] args) {
        MyService myService = new MyService();
        if (myService.getClass().isAnnotationPresent(Version.class)) {
            try {
                Class clazz = Class.forName(MyService.class.getName());
                Class[] params = {String.class, boolean.class, String.class};
                myService = (MyService) clazz.getConstructor(params).newInstance("Android", true, "eu");
                runPrivateClass(myService);
            } catch (Exception e) {
                System.out.println("class not found");
            }
        } else {
            System.out.println("Annotation is absent");
        }
    }


}

