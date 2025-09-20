package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Valid_Anagram {
    //contains same character but in different order
static HashMap<Character,Integer>freqmap(String str ){
    HashMap<Character,Integer>map=new HashMap<>();
   for(int i=0;i<str.length();i++){
       Character ch=str.charAt(i);
       if(!map.containsKey(ch)){
           map.put(ch,1);
       }
       else{
           int currfreq=map.get(ch);
           map.put(ch,currfreq+1);
       }
   }
   return map;
    }
    public static boolean anagram(String s1,String s2){
      if(s1.length()!=s2.length())return false;
        HashMap<Character,Integer>map1=freqmap(s1);
        HashMap<Character,Integer>map2=freqmap(s2);
        return map1.equals(map2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(anagram(s1,s2));

    }
}
