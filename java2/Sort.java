import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nuymber of elements inn an array");
        int n = sc.nextInt();
        System.out.println("enter the elements in an array");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        /*
         * for (int i = 0; i < arr.length ; i++) {
         * for (int j = 0; j < arr.length - 1; j++) {
         * if (arr[i] > arr[j ) {
         * temp = arr[i];
         * arr[i] = arr[j ];
         * arr[j ] = temp;
         * }
         * }
         * }
         */
        System.out.println("the sorted elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
