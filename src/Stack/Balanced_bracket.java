package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        System.out.println("enter brackets");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }
            if (s.charAt(i) == ')') {
                if (st.size() == 0) {
                    System.out.println("not balanced");
                }
                if (st.peek() == '(') {
                    st.pop();
                }
            }
        }
        if (st.size() == 0) {
            System.out.println("balanced brackets");
        } else {
            System.out.println("not balanced");
        }
    }
}
