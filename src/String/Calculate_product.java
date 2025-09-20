package String;

import java.util.Scanner;

public class Calculate_product {
    public static void main(String[] args) {
        //Given two numbers as strings s1 and s2, calculate their product.
        //Note: The numbers can be negative. There can be zeros in the beginning of the numbers.
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        int n1=s1.length();
        int n2=s2.length();
        int result[]=new int[n1+n2];
        if(n1==0||n2==0){
        System.out.println("0");
       }
        for(int i=n1-1;i>=0;i--){
        for(int j=n2-1;j>=0;j--) {
         int mul = (s1.charAt(i)) * (s2.charAt(j));
         
        }
        }
    }
}
