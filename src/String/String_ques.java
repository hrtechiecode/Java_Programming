package String;

import java.util.Scanner;

//i/p-->str-aaabbccc
//o/p-->str-a3b2c3
public class String_ques {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input string");
        String s=sc.nextLine();
        String ans="";
        int count=1;
        for(int i=1;i<s.length();i++){
            char p=s.charAt(i-1);
            char c=s.charAt(i);
            if(p==c){
                count++;
            }
            else{
                ans+=p;
                ans+=count;
                count=1;
            }
        }
        // Add the last group
        ans += s.charAt(s.length() - 1);
        ans += count;

        System.out.println(ans);


    }
}
