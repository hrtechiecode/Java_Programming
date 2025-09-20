import java.util.Scanner;

public class Pattern {
    public static void line(int r) {
        for (int i = 1; i <=r; i++) {
            System.out.print("*");
        }
    }
    public static void rec(int r,int c) {
        for (int i = 1; i <= r; i++) {
            for (int j= 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowrec(int r,int c) {
        for (int i = 1; i <= r; i++) {
            for (int j= 1; j <=c; j++) {
                if (i == 1||i==r||j==1||j==c) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void triangle(int r) {
        for (int i = 1; i <=r; i++) {
            for (int j= 1; j <=i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void revtriangle(int r) {
        for (int i =r; i >= 1; i--) {
            for (int j= 1; j <=i; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void arrow(int r) {
        for (int i = 1; i <=r; i++) {
            for (int j= 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =r-1; i >= 1; i--) {
            for (int j= 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void pyramid(int r) {
    for (int i = 1; i <= r; i++) {
        for (int j = 1; j <= r-i; j++) {
            System.out.print(" ");
        }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
    }
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("i/p no. of rows");
        int r= sc.nextInt();
        System.out.println("i/p no. of columns");
        int c= sc.nextInt();
        System.out.println("line ");
        line(r);
        System.out.println();
        System.out.println("rectangle ");
        rec(r,c);
        System.out.println("hollow");
hollowrec(r,c);
        System.out.println("triangle");
        triangle(r);
        System.out.println("reverse triangle");
        revtriangle(r);
        System.out.println("arrow");
        arrow(r);
        System.out.println("pyramid");
        pyramid(r);

    }
}
