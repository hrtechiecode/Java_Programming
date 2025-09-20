package Array;

import java.util.Arrays;
import java.util.Scanner;
public class Second_largest {

static int[]arr; // Declare arr as class-level variable
    static void printarray() {
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void  inputarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        int n = sc.nextInt();
     arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }
       return max;

    }
    static void second_max() {
        Arrays.sort(arr);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[arr.length - 1]) {
                System.out.println("second max" + " " + arr[i]);
                return;
            }

        }
    }
        static void second_max2() {
            int max2 = max();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max2) {
                    arr[i] = Integer.MIN_VALUE;
                }
            }
            int smax = max();
//            if (smax == Integer.MIN_VALUE) {
//                System.out.println("No second largest element found (method 2)");
//            } else {
                System.out.println( smax);
         //   }

        }

    public static void main(String[] args) {
        inputarray();
        System.out.println("original array");
        printarray();
        System.out.println("max element");
        System.out.println(max());
        second_max();
        second_max2();
    }
}
