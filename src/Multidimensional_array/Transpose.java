package Multidimensional_array;

import java.util.Scanner;

public class Transpose {
    static Scanner sc=new Scanner(System.in);
    static void print(int[][]arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void input(int[][]arr,int r,int c){
        System.out.println("enter"+r*c+"elements");
        for(int i=0;i<r;i++){
            for(int j=0;j< c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }
    static int[][] transpose(int[][]arr,int r,int c) {
        int[][] transposed = new int[c][r];  // Transposed matrix has c rows and r columns
        for (int i = 0; i <c ;i++) {
            for (int j = 0; j < r; j++) {
                transposed[i][j] = arr[j][i];
            }
        }
        return transposed;
    }
    //inplace transpose
    static void inplace_transpose(int[][]arr,int r,int c) {
        if (r != c) {
            System.out.println("In-place transpose is only possible for square matrices.");
            return;
        }
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    //reverse array
    static void reverse(int[]arr){
        int i=0;int j=arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    //rotation
    static void rotation(int[][]arr,int n){
        //transpose
        inplace_transpose(arr,n,n);
        //reverse row
        for (int i = 0; i < n; i++) {
          reverse(arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("enter row");
        int r=sc.nextInt();
        System.out.println("enter column");
        int c=sc.nextInt();
        int[][]arr=new int[r][c];
        input(arr,r,c);
        print(arr);
        System.out.println("transpose matrix");
        int[][] transposedArr = transpose(arr, r, c);
        print(transposedArr);
        System.out.println("transpose in place");
        inplace_transpose(arr,r,c);
        print(arr);
        System.out.println("rotation");
        System.out.println("Matrix Rotation by 90 degrees (clockwise, only if square):");
        if (r != c) {
            System.out.println("Rotation is only possible for square matrices.");
        } else {
            rotation(arr, r);
            print(arr);
        }
    }
}
