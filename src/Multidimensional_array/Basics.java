package Multidimensional_array;

import java.util.Scanner;


public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
        System.out.println("enter elements");
        System.out.println("number of row:- " + arr.length + "  number of columns:- " + arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //to find sum of all elements in a grid
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("sum " + sum);
        System.out.println();
        //to find max sum of  elements of a row in a grid
        int max = Integer.MIN_VALUE;
        int row=-1;
        for (int i = 0; i < arr.length; i++) {
            int sumrow=0;
            for (int j = 0; j < arr[0].length; j++) {
                sumrow += arr[i][j];
            }
            if(max<sumrow){
               max=sumrow;
               row=i;
            }

        }

        System.out.println("max sum at row " +max );
        System.out.println("max sum at row" +row);
    }
}
