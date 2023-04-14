import java.util.Scanner;

public class Determinant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the matrix size: ");
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        System.out.println("enter the element inn the matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        int determinant, x, y, z;
        if (n == 3) {

            x = (matrix[0][0] * (matrix[1][1] * matrix[2][2]
                    - matrix[1][2] * matrix[2][1]));
            y = (matrix[0][1] * (matrix[1][0] * matrix[2][2]
                    - matrix[1][2] * matrix[2][0]));
            z = (matrix[0][2] * (matrix[1][0] * matrix[2][1]
                    - matrix[1][1] * matrix[2][0]));
            determinant = x - y + z;
            System.out.println("The determinent of 3 * 3 matrix is " + determinant);

        } else if (n == 2) {
            determinant = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);

            System.out.println("The Determinant of 2 * 2 Matrix = " + determinant);

        } else {
            System.out.println("the determinant is not possible ");
        }
    }
}
