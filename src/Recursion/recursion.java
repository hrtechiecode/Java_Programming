package Recursion;

import java.util.Scanner;

public class recursion {
    //print 1 to n recursively  // 1 2 3 4 5
    static void increasing(int n){  //p.I(5)--->p=PI(4)  5;
        //BASE CASE
        if(n==1){
            System.out.println(1);
            return;
        }
        //recursively
        increasing(n-1);
     //self
        System.out.println(n);
    }
    //print 1 to n reverse  //  5 4 3 2 1
    static void decreasing(int n){  //p.I(5)--->p=PI(4)  5;
        //BASE CASE
        if(n==1){
            System.out.println(1);
            return;
        }
        //self
        System.out.println(n);
        //recursively
        decreasing(n-1);
    }
    //factorial
    static int fact(int n){  //p.I(5)--->p=PI(4)  5;
        //BASE CASE
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
//fibonacci series
    public static int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
       int fib=fibonacci(n-2) +fibonacci(n-1);
        return fib;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numbar");
        int n = sc.nextInt();
        System.out.println("print n natural numbers");
        increasing(n);
        System.out.println("print numbers in reverse");
        decreasing(n);
        System.out.println("factorial " + fact(n));
        System.out.println("fibonacci "+fibonacci(n));
    }
}
