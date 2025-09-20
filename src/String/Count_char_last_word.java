package String;

import java.util.Scanner;

public class Count_char_last_word {
    static String input(){
        System.out.println("enter string");
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
        }
        //count character in last word of a string with words and extra spaces
static int characterinlastword(String s){
        s=s.trim();//remove extra space
        int count=0;
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i)!=' ') {
                count++;
            }
            else{// if we already started counting and then hit a space, break
                break;
            }
        }
        return count;

}
     public static void main(String[] args) {
     String s=input();
         System.out.println(characterinlastword(s));

    }
}
