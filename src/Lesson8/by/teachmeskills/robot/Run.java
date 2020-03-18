package Lesson8.by.teachmeskills.robot;

import Lesson8.by.teachmeskills.robot.hands.SonyHand;
import Lesson8.by.teachmeskills.robot.hands.ToshibaHand;
import Lesson8.by.teachmeskills.robot.heads.SonyHead;
import Lesson8.by.teachmeskills.robot.legs.SamsungLeg;
import Lesson8.by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
    Robot robot1 = new Robot(new SonyHead(1300),new ToshibaHand(500), new SamsungLeg(800));
    Robot robot2 = new Robot(new SonyHead(1300),new SonyHand(800), new ToshibaLeg(300));
    Robot robot3 = new Robot(new SonyHead(2300),new SonyHand(1500), new SamsungLeg(800));
    robot1.action();
    robot2.action();
    robot3.action();

    Robot[] arr = new Robot[]{robot1,robot2,robot3};
        int maxValue=0;
        int maxValueRobot=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].getPrice()>maxValue){
                maxValue=arr[i].getPrice();
                maxValueRobot=i+1;
            }
        }

        System.out.println("Самый ценный робот: " + maxValueRobot + ". Его стоимость: "+ maxValue);


    }
}
