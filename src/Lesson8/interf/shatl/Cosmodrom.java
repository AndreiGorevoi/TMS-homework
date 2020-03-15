package Lesson8.interf.shatl;

public class Cosmodrom {
    public void start(IStart start){
        if(start.prestartCheckSystem()==false){
            System.out.println("prestartCheckSystem is fallen");
        }else {
            start.startMotor();
            System.out.println("10,9,8,7,6,5,4,3,2,1....");
            start.start();
        }
    }
}
