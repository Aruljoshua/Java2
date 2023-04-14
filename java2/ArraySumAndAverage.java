import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

        }
        avg = sum / n;
        System.out.println("the sum is " + sum);
        System.out.println("the average is " + avg);
    }
}
