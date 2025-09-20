package LinkedList;

import java.util.Scanner;

public class Delete_from_middle {
    public static class Node {
        int data;
      Node next;

        Node(int data) {

            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertatbeg(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
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
        Node findmiddle() {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
            // Delete the middle node
            Node deletemiddle() {
                Node slow = head;
                Node fast = head;
                if(head.next==null){
                    return null;
                }
                while (fast.next.next!= null && fast.next.next.next != null) {
                    fast = fast.next.next;
                    slow = slow.next;
                }
                slow.next=slow.next.next;
                return head;
            }


    }
    public static void main(String[] args) {
        linkedlist l1=new linkedlist();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of linked list");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            l1.insertatbeg(data);
        }
        l1.print();

       Node find= l1.findmiddle();
        System.out.println("find middle node: " + find.data);
        Node deleted = l1.deletemiddle();
        System.out.print("After deleting middle: ");
        l1.print();
    }
}
