package Stack;

public class Linkedlist_stack {

    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack implementation using linked list
    static class StackLinked {
        Node head = null;
        int size = 0;

        // Push element onto stack
        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        // Pop element from stack
        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;  // ✅ Decrement size
            return x;
        }

        // Get size of stack
        int size() {
            return size;
        }

        // Peek top element
        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        // Display stack contents
        void display() {
            Node temp = head;
            System.out.print("Stack: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Check if stack is empty
        boolean isEmpty() {
            return size == 0;
        }

        // For linked list stack, it's never full
        boolean isFull() {
            return false;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        StackLinked st = new StackLinked();
        st.push(55);
        st.push(50);
        st.push(45);
        st.push(35);
        st.push(25);

        st.display();                       // Display all elements
        st.pop();                           // Pop top element
        st.display();                       // Display after pop
        System.out.println("Top: " + st.peek()); // Peek
        System.out.println("Is empty? " + st.isEmpty()); // Check if empty
        System.out.println("Size: " + st.size());        // Size
        System.out.println("Is full? " + st.isFull());   // Always false
    }
}
