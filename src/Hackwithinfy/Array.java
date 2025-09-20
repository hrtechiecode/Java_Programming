package Hackwithinfy;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MOD = 1000000007;//Modular Arithmetic to handle large values
        System.out.println("size of an array");
        int n = sc.nextInt(); // size of the array
        int[] arr = new int[n];

        // read array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("number of queries");
        int q = sc.nextInt(); // number of queries
        for(int i=0;i<q;i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = l; j <= r; j++) {
                arr[j] = (int) (((long) x + (long) (j - l) * y) % MOD);
            }
        }
         long sum = 0;
         for (int num : arr) {
             sum += num;
         }
        System.out.println(sum);

    }
        }
