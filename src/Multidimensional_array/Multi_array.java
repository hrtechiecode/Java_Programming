package Multidimensional_array;

import java.util.Scanner;

public class Multi_array {
    static void printarray(int[][]a) {
        for (int i = 0; i < a.length; i++) { //row
            for (int j = 0; j < a[i].length; j++) {  //column
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //jagged array
        //int[][]arr= new int[5][]
        System.out.println("enter row");
        int r=sc.nextInt();
        System.out.println("enter column");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
      //  int[][]a={{1,2,4},{3,6,8},{7,8,0}};
        //user i/p
        System.out.println("enter "+r*c+"elements");
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
              a[i][j]= sc.nextInt();
            }
        }
        printarray(a);


    }
}
