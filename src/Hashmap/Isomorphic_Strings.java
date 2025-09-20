package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic_Strings {
    public static boolean isomorphic(String s1,String s2) {
        HashMap<Character, Character> map = new HashMap<>();
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            Character ch1 = s1.charAt(i);
            Character ch2 = s2.charAt(i);
            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2) {
                    return false;
                } else if (map.containsValue(ch2)) {
                    return false;
                } else {
                    map.put(ch1, ch2);
                }
            }
        }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter second string:");
        String s2 = sc.nextLine();
        System.out.println("Are the strings isomorphic? " + isomorphic(s1, s2));
    }
}
