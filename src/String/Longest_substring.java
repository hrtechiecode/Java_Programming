package String;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Longest_substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        int start=0;
        int end=0;
        int maxlength=0;
        List<Character>l=new ArrayList<>();
        while(end<s.length()){
            if(!l.contains(s.charAt(end))){
                l.add(s.charAt(end));
                end++;
                maxlength=Math.max(maxlength,l.size());
            }
            else {
                l.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        System.out.println("Length of longest substring without repeating characters: " + maxlength);

    }
}
