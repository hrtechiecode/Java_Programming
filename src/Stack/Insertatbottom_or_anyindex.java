package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Insertatbottom_or_anyindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        System.out.println("enter number of element ");
        int n = sc.nextInt();
        System.out.println("enter element ");
        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            s.push(x);
        }
        System.out.println(s);
        //insert at any index or at bottom
        int idx=2;
        int element=10;
        Stack<Integer> temp = new Stack<>();
        while(s.size()>idx){
            temp.push(s.pop());
        }
        temp.push(element);
        while(temp.size()>0){
            s.push(temp.pop());
        }
        System.out.println(s);


    }
}