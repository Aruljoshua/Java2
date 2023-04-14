import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the matrix size: ");
            int n = sc.nextInt();
            int arr[][] = new int[n][n];
            System.out.println("enter the element inn the matrix:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();

                }
            }
            System.out.println("the elemnt in the arry are:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]);

                }
                System.out.println();
            }
        }

    }

}
