package lesson15.port;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Port {
    private int maxValueOfBoxes;
    private List<Box> stock;

    Lock reentrantLock =new ReentrantLock();

    public Port(int maxValueOfBoxes) {
        this.maxValueOfBoxes = maxValueOfBoxes;
        stock=new ArrayList<>(maxValueOfBoxes);
    }

    public int getMaxValueOfBoxes() {
        return maxValueOfBoxes;
    }

    public List<Box> getStock() {
        return stock;
    }

    public void setStock(List<Box> stock) {
        this.stock = stock;
    }

    void lockPort(){
        reentrantLock.lock();
    }
    void unLockPort(){
        reentrantLock.unlock();
    }
}
