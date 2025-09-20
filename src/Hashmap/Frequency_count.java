package Hashmap;

import java.util.HashMap;

public class Frequency_count {
    public static void main(String[] args) {
        HashMap<Integer,Integer>hash=new HashMap<>();
        int []arr={1,2,3,3,2,1,2};
        for(int i=0;i<arr.length;i++){
            //"Put the value of num as key in the map, and its frequency as value.
            // If the key already exists, increment the value by 1.
            // If it doesn't exist, start with 0 and make it 1."
            int num=arr[i];
            if(!hash.containsKey(num)) {
                hash.put(num, 1);
            }
            else{
                int currfreq=hash.get(num);
                hash.put(num,currfreq+1);
            }
        }
        System.out.println(hash);
        System.out.println();
        String s="hritika";
        HashMap<Character,Integer>hash2=new HashMap<>();
        for(char ch:s.toCharArray()){
           hash2.put(ch,hash2.getOrDefault(ch,0)+1);

        }
        System.out.println(hash2);
    }
}
