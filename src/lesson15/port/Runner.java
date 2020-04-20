package lesson15.port;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Port westPort = new Port(100);
        // заполнение порта грузами
        List<Box> boxList = new ArrayList<>();
        for (int i = 0; i <50 ; i++) {
            Box box = new Box();
            boxList.add(box);
        }
        westPort.setStock(boxList);
        boxList.clear();
        // заполнение порта грузами
        Port eastPort = new Port(200);
        for (int i = 0; i <50 ; i++) {
            Box box = new Box();
            boxList.add(box);
        }
        eastPort.setStock(boxList);

        Ship verginia = new Ship(10);
        Ship carolina = new Ship(5);
        Ship catrina = new Ship(5);

        Thread thread1 = new Thread(()->{
            //загрузка в западном порт
            try {
                westPort.lockPort();
                System.out.println("Verginia charging in west....");
                verginia.chargeBoxes(5, westPort);
                Thread.sleep(10000);
                System.out.println("Verginia stoped charging in west");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                westPort.unLockPort();
            }

            //загрузка в восточном порту
            try {
            eastPort.lockPort();
                System.out.println("Verginia charging east....");
                verginia.chargeBoxes(5,eastPort);
                Thread.sleep(10000);
                System.out.println("Verginia stoped charging in east");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                eastPort.unLockPort();
            }
        });
        thread1.setName("Verginia");

        Thread thread2 = new Thread(()->{
            //загрузка в восточном порту
            try {
                eastPort.lockPort();
                System.out.println("Carolina charging in east....");
                carolina.chargeBoxes(5,eastPort);
                Thread.sleep(2000);
                System.out.println("Carolina stoped charging in east");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                eastPort.unLockPort();
            }

            //выгрузка в запордном порту
            try {
                westPort.lockPort();
                System.out.println("Carolina discharging in west ....");
                carolina.disChargeBoxes(5,westPort);
                Thread.sleep(2500);
                System.out.println("Carolina stoped discharging in west");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                    westPort.unLockPort();
                }
        });
        thread2.setName("Carolina");

        Thread thread3 = new Thread(()->{
            //загрузка в восточном порту
            try {
                eastPort.lockPort();
                System.out.println("Catrina charging in east....");
                catrina.chargeBoxes(2, eastPort);
                Thread.sleep(1000);
                System.out.println("Catrina stoped charging in east");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                eastPort.unLockPort();
            }

            // в запордном порту
            try {
                westPort.lockPort();
                System.out.println("Catrina charging in west....");
                catrina.chargeBoxes(3,eastPort);
                Thread.sleep(1100);
                System.out.println("Catring stoped charging in west");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                westPort.unLockPort();
            }

    });
        thread3.setName("Catrina");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Ports has been closed");
}
}

