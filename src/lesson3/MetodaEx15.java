package homework3;

public class MetodaEx15 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random()*20);
        }
        System.out.println("Ваш начальный массив:");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +" |" );
        }

        for (int start = 0; start <(arr.length)/2 ; start++) {
            int temp;
            temp=arr[start];
            arr[start] = arr[(arr.length-1)-start];
            arr[(arr.length-1)-start]=temp;
        }
        System.out.println("\nЧто я натворил?:");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +" |" );
        }
    }
}
