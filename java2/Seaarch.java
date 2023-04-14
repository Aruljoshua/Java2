import java.util.Scanner;

public class Seaarch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements to be inserted in the array");
        int n = sc.nextInt();
        System.out.println("enter the elements in the array");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("enter the element to search in an array");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("the element is found");
                break;
            } else {
                if (i == n - 1) {
                    System.out.println("the element is not found");
                }
            }
        }
    }
}
