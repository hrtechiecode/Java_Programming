package LinkedList;

import java.util.Scanner;

public class Remove_Nth_node_fromend {
    public static class Node {
        int data;
      Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head=null;
        Node tail=null;
void insertatbeg(int val){
    Node temp = new Node(val);
    if(head==null){
        head=tail=temp;
    }
    else{
        temp.next=head;
        head=temp;
    }
}
void print(){
Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}
void  removefromend(int n){
    Node fast=head;
    Node slow=head;

    // Move fast pointer n steps ahead
    for(int i=0;i<n;i++) {
        if (fast == null) {
            System.out.println("List is shorter than " + n + " nodes.");
            return;
        }
        fast = fast.next;

        // Special case: if fast becomes null, we're removing the head
        if (fast == null) {
            head = head.next;
            return;

        }
    }
        // Move both fast and slow until fast reaches last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Remove the nth node from end
        slow.next=slow.next.next;

}

    }
    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of linked list");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            l1.insertatbeg(data);
        }
        l1.print();
        System.out.println();
        System.out.print("Enter position (n) from end to remove: ");
        int pos = sc.nextInt();

        l1.removefromend(pos);

        System.out.println("After removing " + pos + "th node from end:");
        l1.print();
    }
}
