package Binary_Search;

import java.util.Scanner;

public class Square_root {
    public static int squareroot(int x){
        int start=0;
        int end=x;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int val=mid*mid; //use long
            if(val==x){
                return mid;
            }
            else if(val<x){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("square root of");
        int x= sc.nextInt();
        System.out.println(squareroot(x));

    }
}
