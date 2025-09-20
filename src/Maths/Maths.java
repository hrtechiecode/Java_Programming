package Maths;

import java.util.Scanner;
public class Maths {
    //find number is prime or not
static boolean prime(int n) {
    if (n == 0 || n == 1) {
        return false;
    }
    for(int i=2;i<n-1;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
//find factors if not found return -1;
    static void factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i+" ");
        }
        System.out.println();
    }
    //alternate way to find factor
    static void factors_2method(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
        System.out.println();
    }
    //gcd
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if (prime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        System.out.println();
        factors(n);
        factors_2method(n);
        System.out.println("enter a and b" );
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
    }
}
