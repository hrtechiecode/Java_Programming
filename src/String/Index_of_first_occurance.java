package String;

import java.util.Scanner;

public class Index_of_first_occurance {
    static void indexoffirstoccurance(String s,char x){
        int index=-1;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == x) {
                index = i;
                break;//stop at first occurance
            }
        }
            if(index!=-1){
                System.out.println("character is found " +index);
            }
            else{
                System.out.println("character not found " );
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        System.out.println(s);
        System.out.println("enter character");
        char x=sc.next().charAt(0);  // read only the first character
        indexoffirstoccurance(s,x);
    }
}
