package Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        HashSet<String> hash=new HashSet<>();
hash.add("rose");
hash.add("riyan");
hash.add("priya");
hash.add("isha");
hash.add("enny");
        System.out.println(hash);
        System.out.println( hash.contains("rose"));
        System.out.println(hash.size());
        hash.remove("priya");
        System.out.println(hash);
        System.out.println(hash.size());
        for(String s:hash){
            System.out.println(s);
        }
        //return longest consecutive elements seq
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter elemets of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet <Integer>set=new HashSet<>();
        int maxstreak=0;
        for(int nums:arr){
            set.add(nums);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int currnum=num;
                int currstraek=1;
                while(set.contains(currnum+1)){
                    currstraek++;
                    currnum++;
                }
                maxstreak=Math.max(maxstreak,currstraek);
            }
        }

        System.out.println(maxstreak);
    }
}
