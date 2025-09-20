package Array;

import java.util.Arrays;
import java.util.Scanner;
// Declaring array literal
//int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
//int[]arr={1,2,2};
        public class Array_ques {
    static int[]arr;
    static Scanner sc=new Scanner(System.in);
    static void printarray(){
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
    //sum of an array

    static int sum() {
        int sum = 0;
        for (int i = 0; i<arr.length; i++) {
          sum=sum+arr[i];
        }
        return sum;
    }

    //find max and min of an array
    static void max_min() {
        System.out.println("find min and max");
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("maximum" + " "+max);
        System.out.println("minimum" +" " +min);
    }
    //search an element and provide  its index
static void search() {
    System.out.println("enter element");
    int element=sc.nextInt();
    boolean found = false;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == element) {
            System.out.println("Element found at index: " + i);
            found = true;
            break;
        }
    }
    if (found==false) {
        System.out.println("Element not found in array.");
    }

}
//sorting without sort function
    static void sort(){
        System.out.println("sort an array");
        for (int i=0;i< arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
//            //print sorted array
//        for(int k=0;k< arr.length;k++){
//            System.out.print(arr[k]+" ");
//        }
//        System.out.println();
    }
    //marge two array
    static void merge(){
        System.out.println("merge array");
        System.out.println("input first array");
        int []array1=inputarray();
        System.out.println("input second array");
        int []array2=inputarray();
        int[]merged=new int[array1.length+array2.length];
        int k=0;
        for(int i=0;i< array1.length;i++) {
            merged[k++] = array1[i];
        }
            for(int j=0;j< array2.length;j++){
              merged[k++]=array2[j];
            }
        System.out.println("merged" +" "+ Arrays.toString(merged));//	Converts array to readable string
    }
    //make a seperate array for even and odd elements
    static void even_odd(){
        System.out.println("even and odd array");
        int even_array[]=new int[arr.length];
        int odd_array[]=new int[arr.length];
        int k=0;
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
             even_array[k++]=arr[i];
            }
            else{
                odd_array[j++]=arr[i];
            }
        }
        System.out.print("Even array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(even_array[i] + " ");
        }
        System.out.println();

        System.out.print("Odd array: ");
        for (int i = 0; i < j; i++) {
            System.out.print(odd_array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        inputarray();
        printarray();
        System.out.println("sum of an array"+ " "+ sum());
        max_min();
        search();
        sort();
        merge();
        even_odd();
    }
}
