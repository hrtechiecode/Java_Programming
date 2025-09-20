package Binary_Search;

import java.util.Scanner;

//find first occurance of a given element if array is sorted and if there is no occurance return -1
public class First_occurance {
   static Scanner sc=new Scanner(System.in);
    static void input(int[]arr){
        for(int i=0;i< arr.length;i++){
          arr[i]=sc.nextInt();
        }
    }
    static void print(int[]arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int first_occurance(int[] nums, int target) {
        int index = -1;
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index=mid;
                end = mid - 1;
            } else if(target<nums[mid]){
                end = mid - 1;
            }

           else {

                start=mid+1;

            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println("enter size of an array");
        int  n=sc.nextInt();
        System.out.println("enter elements");
        int[]arr=new int[n];
        input(arr);
      print(arr);
        System.out.println("enter target");
      int target= sc.nextInt();
        System.out.println(first_occurance(arr,target));
    }
}
