package homework3;

public class MetodaEx13 {
    /* Создать последовательность случайных чисел, найти и вывести наибольшее
из них.*/
    public static void main(String[] args) {
        int[] arr = new int[10];
        int maxElement;
        //заполнение массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random()*10);
        }
        maxElement=arr[0];

        //Сортировка массива по возростанию (СТАРЫЙ МЕДОТ!)
        /*for (int start= 0; start <arr.length-1 ; start++) {
            for (int index = 0; index <arr.length-1 ; index++) {
                if(arr[index]>arr[index+1]){
                    int temp;
                    temp=arr[index];
                    arr[index]=arr[index+1];
                    arr[index+1]=temp;
                }
            }
        }*/

        //Без сортировки массива
        for (int j = 1; j <arr.length ; j++) {
            if(maxElement<arr[j]){
                maxElement=arr[j];
            }
        }
        //вывод массива в консоль
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ "| ");
        };
        System.out.println("\nНаибольшее число в вашем массиве:"+maxElement);
    }
}
