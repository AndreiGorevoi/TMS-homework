package Lesson8.DopAbstract;

public abstract class Transport {
    private int power, maxSpeed, weight; // Лош. силы, км/ч, кг.
    private String model; // (Ауди,БМВ и т.д.)


    double powerCalc(){
        double power = (double)this.power*0.74;
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }
}
