package homework3;

public class MetodaEx17 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; (j <arr[i].length-i); j++) {
                arr[i][j]=1;
            }
        }
        for (int i = 3; i <arr.length ; i++) {
            for (int j =i ; j>=(arr[i].length-i)-1; j--) {
                arr[i][j]=1;
            }

        }

        //вывод массива в консоль
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " |");
            }
            System.out.println();
        }
    }
}
