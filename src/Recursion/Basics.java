package Recursion;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Basics {
    public static void ajay(int n) {
        if(n>10)return;
        System.out.println("priya");
        ajay(n+1);
    }
    public static void natural_number(int n2) {
        if(n2==0)return;
        System.out.print(n2+" ");
        natural_number(n2-1);
    }
static void natural_number2(int n2) {
        if(n2==1) {
            System.out.print("1");
            return;
        }
        natural_number2(n2-1);
        System.out.print(n2+" ");
    }
    public static void change(int x){
        x=20;//local

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            ajay(1);
        System.out.println("print natural number in reverse");
            natural_number(n);
        System.out.println("print natural number ");
        natural_number2(n);
        System.out.println();
        int x=10;//local
        change(x);
        System.out.println(x);
        }


    }