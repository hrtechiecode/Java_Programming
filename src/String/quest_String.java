package String;

import java.util.Scanner;
public class quest_String {
    static String s1;
    static void string_input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter full string");
         s1=sc.nextLine();
        System.out.println(s1);
    }
    //with length function
    static void length_string() {
        int x = s1.length();
        System.out.println("Length of a string" + " " + x);
    }
    //without length function
    static void length(){
        int count=0;
        for(char ch:s1.toCharArray()){
           count++;
        }
        System.out.println("length with length function"+" "+count);
    }
    //search a character
    static void search(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character");
        char ch=sc.next().charAt(0);
        int n=s1.length();
        boolean found =false;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)==ch){
                System.out.println("found character"+ch+"at index"+" "+i);
                found=true;
            }

        }
        if(!found){
            System.out.println("character not found");
        }
    }
    //check substrings
    static void substring(){
        String s1="hritika";
        String s2="rit";
        // If rit is found, returns the index of first
        // occurrence of rit. Otherwise, returns -1

        int idx=s1.indexOf(s2);//substring with built in function
        if(idx!=-1) {
            System.out.println("substring" + " "+idx);
        }
        else{
            System.out.println("-1");
        }

    }
    //check substrings using nested loop
    static int substring_2(){
       Scanner sc=new Scanner(System.in);
        System.out.println("enter strings");
    String s=sc.next();
       String s2=sc.next();
       int l1=s.length();
       int l2=s2.length();
       for(int i=0;i<=l1-l2;i++) {
           int j;
           for ( j = 0; j < l2; j++) {
               if (s.charAt(i + j) != s2.charAt(j)) {
                   break;

               }
           }

           if (j == l2) {
               return i;
           }
       }
           return -1;
       }
       //insert a character
    static String insert() {
        StringBuilder x = new StringBuilder();//create mutable string
        Scanner sc = new Scanner(System.in);
        string_input();
        System.out.println("enter idx for new character");
        int idx = sc.nextInt();
        System.out.println("enter character");
        char c = sc.next().charAt(0);
        for(int i=0;i< s1.length();i++ ) {
            if (i == idx)
                x.append(c);
            // Insert the original characters
                x.append(s1.charAt(i));
        }
        // If the given pos is beyond the length,
        // append the character at the end
            if (idx >= s1.length()) {
                x.append(c);
            }
            return x.toString();
    }
    //reverse a string

    public static void main(String[] args) {
      string_input();
      length_string();
      length();
      search();
      substring();
        System.out.println( substring_2());
        System.out.println(insert());
    }
}
