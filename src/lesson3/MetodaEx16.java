package homework3;

public class MetodaEx16 {
    /*Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями.*/
    public static void main(String[] args) {
        int[] arr = new int[10];
        int min=0;
        int max=0;
        int indexMin=0;
        int indexMax=0;
        int sum=0;


        //заполнение массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random()*20);
        }
        min=arr[0];
        max=arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
                indexMin=i;
            }
            if (arr[i]>max){
                max=arr[i];
                indexMax=i;
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"| ");
        }

        if(indexMin<indexMax){
            for (int i =indexMin+1; i <indexMax ; i++) {
                sum+=arr[i];
            }
        }else {
            for (int i =indexMax+1; i <indexMin ; i++) {
                sum+=arr[i];
            }
        }
        System.out.println("\nВаш минимальный элемент:"+min + " |его индекс в массиве:"+ indexMin);
        System.out.println("Ваш максимальный элемент:"+max + " |eго индекс в массиве:"+ indexMax);
        System.out.println("Сумма между минимальным и максимальным элементом:" + sum);
    }
}
