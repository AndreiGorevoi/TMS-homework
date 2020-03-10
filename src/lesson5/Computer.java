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
        lifeCycles = 1;

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
            int randomNumber = (int) Math.round(Math.random());
            Scanner sc = new Scanner(System.in);
            System.out.println("0 or 1?");
            String choiceOfUser = sc.nextLine();
            if (randomNumber != Integer.parseInt(choiceOfUser)) {
                statusOfLife = 0;
            }
        }

    }
    public void turnOff(){
        if(statusOfLife==1 && lifeCycles<=2){
            int randomNumber = (int) Math.round(Math.random());
            Scanner sc = new Scanner(System.in);
            System.out.println("0 or 1?");
            String choiceOfUser = sc.nextLine();
            if(randomNumber== Integer.parseInt(choiceOfUser)){
                lifeCycles++;
            }else {
                statusOfLife=0;
            }
        }
    }
}
