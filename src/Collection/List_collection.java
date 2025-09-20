package Collection;

import java.util.*;

public class List_collection {
    static void arraylist(){
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        System.out.println(l1);
        System.out.println("add element at a given index");
        l1.add(3,5);
        System.out.println(l1);
        System.out.println("to get element");
        System.out.println(l1.get(0));
        System.out.println("to set element");
        l1.set(3,2);
        System.out.println(l1);
        System.out.println("array contain element or not");
        System.out.println(l1.contains(2));
    }
    static void stack(){

        Stack<Integer>s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("push elements");
        System.out.println(s);
        System.out.println("pop element");
        s.pop();
        System.out.println(s);
        System.out.println("stack is empty or not");
        System.out.println(s.empty());
        System.out.println("peek of stack");
        System.out.println(s.peek());
        System.out.println(s.search(5));
    }
static void linkedlist(){
            LinkedList<String> fruits = new LinkedList<>();

            fruits.add("Apple");
            fruits.add("Banana");
            fruits.addFirst("Mango");
            fruits.addLast("Cherry");

            System.out.println("LinkedList: " + fruits);

            fruits.remove("Banana");
            System.out.println("After removing Banana: " + fruits);

            System.out.println("First Element: " + fruits.getFirst());
            System.out.println("Last Element: " + fruits.getLast());

            System.out.println("All elements:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }

    public static void main(String[] args) {
arraylist();
stack();
linkedlist();
    }
}
