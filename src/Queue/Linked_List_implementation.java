package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Linked_List_implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        }
        public static class queue{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int data){
            Node temp=new Node(data);
            if(size==0){
          head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
            public int remove(){
                if(size==0){
                    System.out.println("queue is empty");
                    return -1;
                }
                int x=head.data;
                head=head.next;
                size--;
                return x;
            }
            public void display(){
                if(size==0){
                    System.out.println("queue is empty");
                }
                Node temp=head;
                while(temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
                }
                System.out.println();
            }

        }
    public static void main(String[] args) {
        queue q=new queue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(2);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());


    }
}
