package lesson5;

import java.util.Scanner;

public class Computer {
    String cpu;
    String ram;
    String hdd;
    int lifeCycles=0;
    int statusOfLife = 1;

    public Computer(){
        cpu = "Intel Celeron J1900 with 4 core and 2000 frequency ";
        ram = "DDR3 4GB";
        hdd = "SSD 120 GB";
        lifeCycles = 9999;

    }

    public Computer(String cpu, String ram, String hdd){
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void getParammetrs(){
        System.out.println("Your parameters are:  ");
        System.out.println("CPU- " + cpu);
        System.out.println("RAM- " + ram);
        System.out.println("HDD- " + hdd);
        System.out.println("________________________________");
    }

    public  void turnOn(){
        if (statusOfLife==1 && lifeCycles<=2) {
            System.out.println("Starting...");
            int randomNumber = (int) Math.round(Math.random());
            Scanner sc = new Scanner(System.in);
            System.out.println("Game is starting, enter 0 or 1");
            String choiceOfUser = sc.nextLine();
            if (randomNumber == Integer.parseInt(choiceOfUser)) {
                System.out.println("Sound of starting");
                System.out.println("________________________________");
            } else {
                statusOfLife =0;
                System.out.println("Smell of smoke");
                System.out.println("Youre lifeCycles = " + lifeCycles);
            }
        }else {
            System.out.println("Your computer has died");

        }

    }
    public void turnOff(){
        if(statusOfLife==1 && lifeCycles<=2){
            System.out.println("Shutdown...");
            int randomNumber = (int) Math.round(Math.random());
            Scanner sc = new Scanner(System.in);
            System.out.println("Game is starting, enter 0 or 1");
            String choiceOfUser = sc.nextLine();
            if(randomNumber== Integer.parseInt(choiceOfUser)){
                System.out.println("Success exit");
                System.out.println("________________________________");
                lifeCycles++;
            }else {
                statusOfLife=0;
                System.out.println("Smell of smoke");
                System.out.println("Youre lifeCycles = " + lifeCycles);
            }
        }else {
            System.out.println("Your computer has died");
        }
    }
}
