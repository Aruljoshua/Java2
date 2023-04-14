// import java.util.Scanner;

// public class UnionIntersectionArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number of elements in an 1st arr: ");
//         int n = sc.nextInt();
//         System.out.println("enter the number of elements for 2nd array:");
//         int m = sc.nextInt();
//         int[] arr = new int[n];
//         int[] arr1 = new int[m];
//         System.out.println("enter the elements of first array: ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("enter the elements of second array: ");
//         for (int i = 0; i < arr1.length; i++) {
//             arr1[i] = sc.nextInt();
//         }

//         int[] arr2 = new int[m + n];
//         for (int i = 0; i < arr1.length; i++) {
//             arr2[i] = arr1[i];
//         }
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr1.length; j++) {
//                 if ((arr[i] != arr2[j]) && (arr1[i] != arr2[j])) {
//                     arr2[arr1.length + i] = arr[i];
//                 }
//             }
//         }
//         System.out.println("the union elements are: ");
//         for (int i = 0; i < arr2.length; i++) {
//             System.out.println(arr2[i]);
//         }
//         int[] a = new int[n + m];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr1.length; j++) {
//                 if (arr[i] == arr1[j]) {
//                     a[i] = arr[i];
//                 }
//             }
//         }
//         System.out.println("the intersection of a number is : ");
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] != 0) {
//                 System.out.println(a[i]);
//             }
//         }
//     }
// }
// Java Program to Find the Union and Intersection of 2 Arrays.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    // Function to find and display the union and intersection
    static void displayUnionAndIntersection(int[] arrayOne, int[] arrayTwo) {
        Set<Integer> obj = new HashSet<>();
        int i, j;
        for (i = 0; i < arrayOne.length; i++) {
            obj.add(arrayOne[i]);
        }
        for (j = 0; j < arrayTwo.length; j++) {
            obj.add(arrayTwo[j]);
        }
        System.out.println("The union of both the arrays is");
        for (Integer I : obj) {
            System.out.print(I + " ");
        }
        System.out.println();
        obj.clear();
        System.out.println("The intersection of both the arrays is");
        for (i = 0; i < arrayOne.length; i++) {
            obj.add(arrayOne[i]);
        }
        for (j = 0; j < arrayTwo.length; j++) {
            if (obj.contains(arrayTwo[j]))
                System.out.print(arrayTwo[j] + " ");
        }
    }

    // Function to read the input
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m, n;
        System.out.println("Enter the size of the two arrays");
        try {
            n = Integer.parseInt(br.readLine());
            m = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Invalid input");
            return;
        }
        int[] arrayOne = new int[n];
        int[] arrayTwo = new int[m];
        System.out.println("Enter the first array elements");
        int i, j;
        for (i = 0; i < arrayOne.length; i++) {
            try {
                arrayOne[i] = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                System.out.println("Invalid array element. Enter it again");
                i--;
            }
        }
        System.out.println("Enter the second array elements");
        for (i = 0; i < arrayTwo.length; i++) {
            try {
                arrayTwo[i] = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                System.out.println("Invalid array element. Enter it again");
                i--;
            }
        }
        displayUnionAndIntersection(arrayOne, arrayTwo);
    }
}