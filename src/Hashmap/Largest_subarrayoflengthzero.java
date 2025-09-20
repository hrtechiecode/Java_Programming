package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Largest_subarrayoflengthzero {
    public static int largestsubarray(int[]arr,int n){
        HashMap<Integer,Integer>map=new HashMap<>();
        int maxlength=0;
        int prefsum=0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            prefsum+=arr[i];
            if(map.containsKey(prefsum)){
               maxlength= Math.max(maxlength,i- map.get(prefsum));
            }
            else{
                map.put(prefsum,i);
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter elemets of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(largestsubarray(arr,n));
    }
}
