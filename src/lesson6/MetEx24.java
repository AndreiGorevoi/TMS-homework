package lesson6;

public class MetEx24 {
    /*Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.*/
    private int sec;
    private int min;
    private int hour;

    public MetEx24(int sec){
        this.hour = sec/3600;
        this.min = (sec%3600)/60;
        this.sec = (sec%3600)%60;
    }

    public MetEx24(int sec, int min, int hour){
        this.sec=sec;
        this.min=min;
        this.hour=hour;
    }

    public int getFullSeconds(){
        return (hour*3600+min*60+sec);
    }

    public double getSec() {
        return sec;
    }

    public double getMin() {
        return min;
    }

    public double getHour() {
        return hour;
    }

    public boolean compareObjects(MetEx24 obj2) {
        boolean resultOfCompare;
        if (this.sec == obj2.getSec() && this.min == obj2.getMin() && this.hour == obj2.getHour()) {
            resultOfCompare = true;
        } else {
            resultOfCompare = false;
        }
        return resultOfCompare;
    }

    @Override
    public String toString() {
        return "MetEx24{" +
                "sec=" + sec +
                ", min=" + min +
                ", hour=" + hour +
                '}';
    }
}
