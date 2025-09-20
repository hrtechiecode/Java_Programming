package String;

import java.util.Scanner;

public class StringGFG {
    static Scanner sc = new Scanner(System.in);
    // Method to take input
    static String inputString() {
        System.out.println("Input string:");
        return sc.nextLine();
    }
    //Check if two strings are same or not
    public static void samestring(String s1,String s2) {
        if (s1.equals(s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
   // without using in-built function
   public static boolean samestringornot(String s1,String s2) {
       if(s1.length()!=s2.length()){
           return false;
       }
      for(int i=0;i<s1.length();i++){
          if(s1.charAt(i)!=s2.charAt(i)){
              return  false;
          }
      }
      return true;
   }
    public static void main(String[] args) {
        String s1 = inputString();
        String s2 = inputString();
        System.out.println("same string or not with inbuilt function");
       samestring(s1,s2);
        System.out.println("same string or not without inbuilt function");
        System.out.println( samestringornot(s1,s2));
    }
}
