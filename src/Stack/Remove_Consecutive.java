package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Remove_Consecutive {
    public static int[] remove(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (arr[i] == st.peek()) {
                // Only pop if it's the end of group
                if (i == n - 1 || arr[i] != arr[i + 1]) {
                    st.pop(); // remove the duplicate
                }
            }
        }

        // Build result from stack (reverse order)
        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = remove(arr);
        System.out.println("Array after removing consecutive duplicates:");
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
