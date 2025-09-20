package Multidimensional_array;

import java.util.Scanner;
public class Multiply {
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
    static int[][]multiply(int[][]arr1,int[][]arr2,int r1,int c1,int r2,int c2){
        if(c1 != r2){
            System.out.println("no multiplication is possible");
            return null;
        }
        int mul[][] = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j< c2;j++){
                for(int k=0;k<c1;k++){
                  mul[i][j]+=(arr1[i][k]*arr2[k][j]);
                }
            }
        }
return mul;
    }

    public static void main(String[] args) {
        System.out.println("enter row");
         int r1=sc.nextInt();
        System.out.println("enter column");
        int c1=sc.nextInt();
        int[][]arr1=new int[r1][c1];
        input(arr1,r1,c1);
        print(arr1);
        System.out.println("enter row");
        int r2=sc.nextInt();
        System.out.println("enter column");
        int c2=sc.nextInt();
        int[][]arr2=new int[r2][c2];
        input(arr2,r2,c2);
        print(arr2);
       int multi[][]=multiply(arr1,arr2,r1,c1,r2,c2);
        if (multi != null) {
            System.out.println("Resultant Matrix:");
            print(multi);
        }

    }
}
