package Array;
//For a given array arr[], create a new array ans[] such that each element
// at index i of ans[] is the product of all the elements in arr[] except arr[i].
public class Array_multiply {
    public static void main(String[] args) {
                int[] arr = {1, 2, 3, 4};
                int n = arr.length;
                int[] ans = new int[n];

                for (int i = 0; i < n; i++) {
                    int product = 1;
                    for (int j = 0; j < n; j++) {
                        if (i != j) {
                            product *= arr[j];
                        }
                    }
                    ans[i] = product;
                }

                for (int x : ans) {
                    System.out.print(x + " ");
                }
            }
        }
        //use prefix and suffix for optimize approach