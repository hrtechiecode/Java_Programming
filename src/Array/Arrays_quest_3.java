package Array;

import java.util.Scanner;

public class Arrays_quest_3 {
    //alternative number
    static void alternative_number(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    //whether an array is sorted or not
    static boolean array_sorted_or_not(int[]arr){
        for (int i = 1; i < arr.length; i++) {
                if(arr[i-1]>arr[i]){
                    return false;
            }


    }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("enter size of an array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("print array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        alternative_number(arr);
        array_sorted_or_not(arr);
        // Call and print result
        if (array_sorted_or_not(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is NOT sorted.");
        }
    }
}