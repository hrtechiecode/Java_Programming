package Greedy_algorithm;

import java.util.Scanner;

public class Remove_duplicates {

    public static int removeDuplicates(int[] arr) {
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[start]) {
                i++;
            } else {
                start++;
                arr[start] = arr[i];
            }
        }
        return start + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Take array elements input
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int newLength = removeDuplicates(arr);

        System.out.println("New length: " + newLength);
        System.out.print("Unique elements: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}