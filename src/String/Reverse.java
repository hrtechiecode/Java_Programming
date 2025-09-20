package String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch!=' '){
                str.append(ch);
            }
            else{
                str.reverse();
                ans=ans+str;
                ans+=" ";
              //  str.delete(0,str.length());
                str=new StringBuilder("");
            }
        }
        // Handle the last word (if any)
        str.reverse();
        ans += str.toString();

        System.out.println("Reversed words: " + ans);
    }
}
