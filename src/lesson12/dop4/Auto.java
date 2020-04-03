package lesson12.dop4;

import java.io.Serializable;

public class Auto implements Serializable {

    private String model;
    private int maxSpeed;
    private int value;

    public Auto(String model,int maxSpeed, int value){
        this.model=model;
        this.maxSpeed=maxSpeed;
        this.value=value;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Auto[" +
                "model: '" + model + '\'' +
                ", maxSpeed: " + maxSpeed +
                ", value: " + value +
                ']';
    }
}
