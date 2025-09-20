package LinkedList;

public class Intersectionoftwolist {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static Node intersection(Node head1, Node head2) {
        // First, calculate lengths
        int len1 = 0, len2 = 0;
        Node temp1 = head1, temp2 = head2;

        while (temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            len2++;
            temp2 = temp2.next;
        }

        // Reset temp1 and temp2 to heads
        temp1 = head1;
        temp2 = head2;

        // Align both lists
        if (len1 > len2) {
            int diff = len1 - len2;
            for (int i = 0; i < diff; i++) {
                temp1 = temp1.next;
            }
        } else {
            int diff = len2 - len1;
            for (int i = 0; i < diff; i++) {
                temp2 = temp2.next;
            }
        }

        // Traverse both together to find intersection
        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null; // No intersection
    }

    public static void main(String[] args) {
        // Create first list: 1 -> 2
        Node head1 = new Node(1);
        head1.next = new Node(2);

        // Create second list: 9 -> 8
        Node head2 = new Node(9);
        head2.next = new Node(8);

        // Common part: 3 -> 4 -> 5
        Node common = new Node(3);
        common.next = new Node(4);
        common.next.next = new Node(5);

        // Attach the common part
        head1.next.next = common;
        head2.next.next = common;

        Node result = intersection(head1, head2);
        if (result != null)
            System.out.println("Intersection at node with value: " + result.data);
        else
            System.out.println("No intersection found.");
    }
}
