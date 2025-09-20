package String;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
            //check alphabet small or capital
            boolean flag=true;  //if capital
            char ch=str.charAt(i);
            if(ch==' ')continue;
            int ascii=(int)ch;
if(ascii>=97){
    flag=false;
}
if(flag==true){
    ascii+=32;
    char d=(char)ascii;
    str.setCharAt(i,d);
}
else{
    ascii-=32;
    char d=(char)ascii;
    str.setCharAt(i,d);
}
        }
        System.out.println(str);
    }
}
