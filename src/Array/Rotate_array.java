package Array;

import java.util.Scanner;

public class Rotate_array {
    static int[] arr;
    static Scanner sc = new Scanner(System.in);
    static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int[] inputarray() {
        System.out.println("enter size of an array");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int[] rotate(int[]arr,int k) {
        int n = arr.length;
        k=k%n;
       int[] ans = new int[n];
            int j=0;
        for (int i = n-k; i <n; i++) {
            ans[j++]=arr[i];
        }
        for (int i = 0; i <n-k; i++) {
            ans[j++]=arr[i];
        }
        return ans;
    }


    public static void main(String[] args) {
        inputarray();
        printarray(arr);
        System.out.println("enter value k");
        int k=sc.nextInt();
        int[]ans=rotate(arr,k);
        System.out.println("array after rotation");
        printarray(ans);
    }
}
