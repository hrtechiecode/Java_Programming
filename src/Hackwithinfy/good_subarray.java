package Hackwithinfy;

import java.util.*;

 class good_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // array size
        int k = sc.nextInt(); // max distinct allowed
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int maxSum = 0;

        // Try all subarrays
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            int sum = 0;

            for (int j = i; j < n; j++) {
                set.add(arr[j]);
                sum += arr[j];

                if (set.size() > k)
                    break; // no need to continue if too many distinct

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}
