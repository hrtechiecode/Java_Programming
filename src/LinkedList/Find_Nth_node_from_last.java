package LinkedList;
import java.util.Scanner;

public class Find_Nth_node_from_last {
    static Scanner sc = new Scanner(System.in);

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Main logic to find nth node from end
        void findNthFromEnd(int n) {
            Node fast = head;
            Node slow = head;

            // Move fast n steps ahead
            for (int i = 0; i < n; i++) {
                if (fast == null) {
                    System.out.println("List has fewer than " + n + " nodes.");
                    return;
                }
                fast = fast.next;
            }

            // Move both pointers till fast reaches end
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            // slow is now at nth node from end
            System.out.println("Nth node from end is: " + slow.data);
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            ll.insertAtEnd(sc.nextInt());
        }

        System.out.print("Enter the value of n to find nth node from end: ");
        int k = sc.nextInt();

        ll.print();
        ll.findNthFromEnd(k);
    }
}
