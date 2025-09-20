package LinkedList;

public class Insert_Delete_at_any_index {
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

        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void insert_at_end(int val) {

            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insert_at_beg(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insert_at_index(int idx, int val) {
            if (idx < 0 || idx > size()) {
                System.out.println("Index out of bounds");
                return;
            }

            if (idx == 0) {
                insert_at_beg(val);
                return;
            }

            if (idx == size()) {
                insert_at_end(val);
                return;
            }

            Node newnode = new Node(val);
            Node temp = head;

            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            newnode.next = temp.next;
            temp.next = newnode;
        }
        void deleteatindex(int idx) {
            if (idx < 0 || idx >= size()) {
                System.out.println("Index out of bounds");
                return;
            }

            // Case 1: Delete head
            if (idx == 0) {
                head = head.next;
                if (head == null) tail = null; // List became empty
                return;
            }

            // Traverse to (idx - 1)th node
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            // Delete the node
            temp.next = temp.next.next;

            // Case 2: If last node was deleted, update tail
            if (temp.next == null) {
                tail = temp;
            }

    }
        int getAt(int idx){
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        l1.insert_at_beg(1);
        l1.insert_at_beg(2);
        l1.insert_at_beg(3);
        l1.insert_at_beg(4);
        l1.insert_at_beg(5); // List: 5 4 3 2 1

        l1.insert_at_index(5, 10); // inserting at end (index = size)
        l1.display();              // Output: 5 4 3 2 1 10
        System.out.println("Tail: " + l1.tail.data); // Should be 10
        System.out.println("get element "+l1.getAt(3));
        l1.deleteatindex(5);
        l1.display();
        System.out.println("tail "+ l1.tail.data);
    }
}
