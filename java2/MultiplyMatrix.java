import java.util.*;

public class MultiplyMatrix {
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

            int arr1[][] = new int[n][n];
            System.out.println("enter the element inn the matrix 2:");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr1[i][j] = sc.nextInt();

                }
            }
            int c[][] = new int[n][n]; // 3 rows and 3 columns
            System.out.println("the resultant matrix is : ");

            // multiplying and printing multiplication of 2 matrices
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < 3; k++) {
                        c[i][j] += arr[i][k] * arr1[k][j];
                    }
                    System.out.print(c[i][j] + " "); // printing matrix element
                } // end of j loop
                System.out.println();// new line
            }

        }
    }
}
