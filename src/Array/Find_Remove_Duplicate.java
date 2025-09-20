package Array;

import java.util.Scanner;

public class Find_Remove_Duplicate {
    static int[]arr;
    static Scanner sc=new Scanner(System.in);
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
    static void find() {
        for (int i=0 ; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print("duplicate" + " " + arr[i]);
                    break;
                }
            }
        }
    }
//remove duplicates
static void remove() {
        int n= arr.length;
        int ans[]=new int[n];
        int k=0;
    for (int i=0 ; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
              ans[k++]=arr[i];
            }
        }
    }
    System.out.println(ans);
}
    public static void main(String[] args) {
        inputarray();
        find();
        remove();


    }
}
