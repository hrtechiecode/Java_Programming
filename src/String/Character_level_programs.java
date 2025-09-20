package String;

import java.util.Scanner;

import static java.lang.Character.*;

public class Character_level_programs {
    static Scanner sc = new Scanner(System.in);
    // Method to take input
    static String inputString() {
        System.out.println("Input string:");
        return sc.nextLine();
    }
    static void string_traversal(String s){
        //string traversal
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); //read character
            System.out.println("char"+c + " ");//to print each elememt in a seperate line
            //typecasting
            System.out.println("ascii"+c + " " + (int) c); //to print ascii value of characters
//to print characters in uppercase and lowercase
            System.out.println("uppercase" + isUpperCase(c));//boolean
            System.out.println("lowercase" + isLowerCase(c));
        }
    }
static void uppercase_lowercase(String s) {
    System.out.println("uppercase and lowercase");
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i); //read character
        if (isUpperCase(c)) {
            System.out.println("uppercase" + " " + c);
        } else {
            System.out.println("lowercase" + " " + c);
        }
    }
}
static int count(String s){
    System.out.println("count uppercase");
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isUpperCase(c)){;
            count++;
            }
        }
        return count;
}
//NEW STRING FOR UPPERCASE
    static void newstring(String s) {
        System.out.println("new string for uppercase");
        String s2 = " ";//empty string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isUpperCase(c)) {
                s2 += c;
            }

        }
        System.out.println(s2);
    }
    //new string with number first and character in second
    static void stringdigitchar(String s) {
        System.out.println("stringdigitchar");
        String s2 = " ",s3=" ";//empty string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isDigit(c)) {
                s2 += c;
            }
            else{
                s3+=c;
            }

        }
        String s4=s2+s3;
        System.out.println(s4);
    }
    static void whitespace(String s) {
        System.out.println("not include whitespace");
        String s2 = " ";//empty string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isWhitespace(c)) {
                s2 += c;
            }

        }
        System.out.println(s2);
    }
    static void reversecase(String s) {
        System.out.println("reverse case");
        String s2 = " ";//empty string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c))//boolean
                s2 +=Character.toLowerCase(c); // character
            else
                s2 +=Character.toUpperCase(c);

        }
        System.out.println(s2);
    }
    static void reverse(String s) {
        System.out.println("reverse string");
        String rev = "";//empty string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            rev = c + rev;
        }
        System.out.println(rev);
    }
//palindrome
static void palindrome(String s) {
    System.out.println("palindrome string");
    String rev = " ";//empty string
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        rev = c + rev;
    }
        if(s.equalsIgnoreCase(rev)){
            System.out.println("yes it is");
        }
        else{
            System.out.println( "NO");
        }
    }


    public static void main (String[]args){
      String s=inputString();
      string_traversal(s);
      uppercase_lowercase(s);
      System.out.println(count(s));
      newstring(s);
      stringdigitchar(s);
      whitespace(s);
      reversecase(s);
      reverse(s);
      palindrome(s);
    }
}