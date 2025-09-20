package Hashmap;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Hashmap_Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        int n = sc.nextInt();
        System.out.println("enter elements of an array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            if (!freq.containsKey(i)) {
                freq.put(i, 1);
            }
            else{
                freq.put(i, freq.get(i)+1);
            }
        }
        System.out.println(freq);
int maxfreq=0;
int anskey=-1;
for(var e:freq.entrySet()){
    if(e.getValue()>maxfreq){
        maxfreq=e.getValue();
        anskey=e.getKey();
    }
}
        System.out.println(anskey);
    }
}
