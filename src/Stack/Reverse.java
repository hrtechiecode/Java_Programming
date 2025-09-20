package Stack;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
                Stack<Integer> original = new Stack<>();
                original.push(10);
                original.push(20);
                original.push(30);
                original.push(40);

                System.out.println("Original Stack: " + original);

                Stack<Integer> reversed = new Stack<>();

                // Move all elements to another stack
                while (original.size()>0) {
                  int x=  original.pop();
                    reversed.push(x);

                }

                System.out.println("Reversed Stack: " + reversed);
            }
        }
        