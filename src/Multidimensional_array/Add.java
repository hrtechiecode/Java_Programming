package Multidimensional_array;

import java.util.Scanner;

public class Add {
    static Scanner sc=new Scanner(System.in);

    static void print(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void input(int r,int c,int a[][]) {
        System.out.println("enter" + r * c + "elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
        static int[][] add(int[][] a, int[][] b, int r1, int c1,int r2, int c2) {
            if (r1 != r2 || c1 != c2) {
                System.out.println("wrong i/p  not possible to add");
                return null;
            }
            int add[][] = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                 add[i][j]=a[i][j]+b[i][j];
                }
            }
            return add;
        }
    public static void main(String[] args) {
        System.out.println("Enter number of rows and column:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        input( r1, c1,a);
        System.out.println("Enter number of columns:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        input(r2, c2,b);

        System.out.println("\nMatrix A:");
        print(a);

        System.out.println("\nMatrix B:");
        print(b);

        int[][] sum= add(a, b, r1, c1, r2, c2);
        if (sum != null) {
            System.out.println("\nSum of matrices:");
            print(sum);
        }
    }
    }
