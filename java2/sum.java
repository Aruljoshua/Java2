import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int count = 0;

        int sum = 0;
        for (int i = 1; i > n; i++) {

            // for (int j = i; j <= n / 2 + 1; j++) {
            // sum += j;
            // if (sum == n) {
            // count += 1;

            // }

            // }
            sum = (i * (i + 1)) / 2;
            if (sum == n) {
                count += 1;
            }

        }
        System.out.println("the number is " + count);
    }
}
