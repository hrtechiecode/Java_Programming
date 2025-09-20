package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_quest_2 {
    static int[]arr;
    static Scanner sc=new Scanner(System.in);

    static void printarray(){
        System.out.println("print array");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] inputarray(){
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("enter elements of array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    //return array with largest and smallest elements
    public static int[]lar_small(){
        int[]array={10,20,30,24,32};
        Arrays.sort(array);

   int[]ans={arr[0],arr[arr.length-1]};
   return ans;
    }

    //Find the missing number in 1 to n (if one number is missing)
    static  void missing(){
        System.out.println("Find the missing number in 1 to n (if one number is missing)");
        System.out.println("enter range of an array elements");
        int n=sc.nextInt();
        inputarray();
        int sum=0;
        int actual_sum= n* (n+1)/2;
        for(int i=0;i< arr.length;i++){
           sum+=arr[i];
        }
        int x=actual_sum-sum;
        System.out.println("missing"+" "+x);
    }
    //insert element in an array
    static void insert(){
        System.out.println("insert element");
        System.out.println("enter element to insert");
       int element=sc.nextInt();
        System.out.println("enter index");
       int idx=sc.nextInt();
        if (idx < 0 || idx > arr.length) {
            System.out.println("Invalid index.");
            return;
        }
       int[]newarr=new int[arr.length+1];
        for(int i=0;i< idx;i++){
       newarr[i+1]=arr[i];
        }
        newarr[idx]=element;
        for (int i = idx; i < arr.length; i++) {
            newarr[i + 1] = arr[i]; //shifts the element from the original array (arr[i]) one position to the right in the new array (newArr).
        }
        arr = newarr;  // Update original array
        System.out.println("Element inserted successfully!");
        printarray();
    }
    //delete an element
    static void delete(){
        System.out.println("delete element");
        System.out.println("enter index to delete");
        int idx=sc.nextInt();
        int[]newarr=new int[arr.length-1];
        if(idx<0||idx>=arr.length){
            System.out.println("index out of bound");
        return;
        }
        for (int i = 0,j=0; i < arr.length; i++) {
            if (i == idx) continue;  // skip the element at idx
            newarr[j++] = arr[i];// So this line copies valid elements from arr to newArr, moving forward in newArr one step at a time using j.
        }
        arr = newarr;  // update original array
        printarray();

    }
    public static void main(String[] args) {
        inputarray();
        printarray();
        missing();
        insert();
        delete();
       int []ans= lar_small();
        System.out.println("smallest "+ans[0]);
        System.out.println("largest "+ans[1]);
    }
}
