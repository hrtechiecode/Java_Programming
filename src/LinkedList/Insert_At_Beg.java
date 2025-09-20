package LinkedList;

public class Insert_At_Beg {
        public static class Node {
            int data;
           Node next;

            Node(int data) {
                this.data = data;
            }
        }

        public static class linked_list {
            Node head=null;
             Node tail = null;
            int size=0;
            void insert_at_beg(int val) {
               Node temp = new Node(val);
                if (head == null) {
                    head =tail= temp;
                } else {
                    temp.next = head;
                    head=temp;
                }
                size++;
                System.out.println(size);
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
           linked_list l1 = new linked_list();//empty
            l1.insert_at_beg(4);
            l1.display();
            l1.insert_at_beg(1);
            l1.display();
            l1.insert_at_beg(3);
            l1.display();

        }
    }