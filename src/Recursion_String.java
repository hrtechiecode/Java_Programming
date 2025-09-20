import java.util.Scanner;

public class Recursion_String {
    //remove occurance of
    public static String remove(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='a'){
                ans+=str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
                String str=sc.nextLine();
                System.out.println(str);
                char ch=str.charAt(0);
                System.out.println(ch);
                for(int i=0;i<str.length();i++){
                    System.out.println(str.charAt(i));
                }
        System.out.println(str.substring(0,3));
        System.out.println(remove(str));
            }
        }
