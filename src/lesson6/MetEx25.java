package lesson6;

public class MetEx25 {
    /*Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.*/
    private int numOf20;
    private int numOf50;
    private int numOf100;

    public MetEx25(int numOf20, int numOf50, int numOf100){
        this.numOf20=numOf20;
        this.numOf50=numOf50;
        this.numOf100=numOf100;
    }

    public void push20(int num){
        numOf20+=num;
    }
    public void push50(int num){
        numOf50+=num;
    }
    public void push100(int num){
        numOf100+=num;
    }

    public boolean getMoney(int money){
        boolean result;
        if(((money%50)%20)==0){
            result=true;
       if(money/100<this.numOf100 && (money%100)/50<this.numOf50 && (money%50)/20<this.numOf20){
           result = true;
           System.out.println("1-q");
           System.out.println("100-к: " + money/100);
           System.out.println("50-к: " + (money%100)/50);
           System.out.println("20-к: " + (money%50)/20);
           this.numOf100-=money/100;
           this.numOf50-=(money%100)/50;
           this.numOf20-=(money%50)/20;
       }else if((money-this.numOf100*100)/50<this.numOf50 &&((money-this.numOf100*100)%50)%20==0
               && ((money-this.numOf100*100)%50)/20<this.numOf20){
           result = true;
           System.out.println("2-q");
           System.out.println("100-к: " + this.numOf100);
           System.out.println("50-к: " + (money-this.numOf100*100)/50);
           System.out.println("20-к: " + ((money-this.numOf100*100)%50)/20);
           this.numOf50=this.numOf50-((money-this.numOf100*100)/50);
           this.numOf20-=((money-this.numOf100*100)%50)/20;
           this.numOf100=0;
       }else if((money-(this.numOf100*100+this.numOf50*50))%20==0 &&
               (money-(this.numOf100*100+this.numOf50*50))/20<this.numOf20){
           result=true;
           System.out.println("3-q");
           System.out.println("100-к: " + this.numOf100);
           System.out.println("50-к: " + this.numOf50);
           System.out.println("20-к: " + (money-(this.numOf100*100+this.numOf50*50))/20);
           this.numOf20-=(money-(this.numOf100*100+this.numOf50*50))/20;
           this.numOf50=0;
           this.numOf100=0;

       }else {
           result=false;
       }
        }else {
            result=false;
        }
        return result;
    }

    @Override
    public String toString() {
        return "MetEx25{" +
                "numOf100=" + numOf100 +
                ", numOf50=" + numOf50 +
                ", numOf20=" + numOf20 +
                '}';
    }
}
