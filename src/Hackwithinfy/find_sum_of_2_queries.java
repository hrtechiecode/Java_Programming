package Hackwithinfy;

import java.util.Scanner;

public class find_sum_of_2_queries {
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
        long totalsum = 0;

        // process queries
        while (q-- > 0) {
            System.out.println("Enter query (type l r):");
            int type = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (type == 1) {
                // Type 1: (i-l+1)*A[l]
                int base = arr[l];
                for (int i = l; i <= r; i++) {
                    arr[i] = (int)(((long)(i - l + 1) * base) % MOD);
                }
            } else if (type == 2) {
                // Type 2: sum from l to r
                long sum = 0;
                for (int i = l; i <= r; i++) {
                    sum = (sum + arr[i]) % MOD;
                }
                totalsum = (totalsum + sum) % MOD;
            }
        }
        System.out.println("enter ans");
        System.out.println(totalsum);
    }
}
