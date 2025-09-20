package LinkedList;

import java.util.Scanner;

public class Delete_node_givenasparameter {
   static Scanner sc=new Scanner(System.in);
   public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static linkedlist input(int n){
        linkedlist l1=new linkedlist();
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            l1.insertatbeg(data);
        }
        return l1;
    }
    public static class linkedlist{
       Node head=null;
       Node tail=null;
        void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
            System.out.println();
        }
       void insertatbeg(int val){
           Node temp=new Node(val);
           if(head==null){
               head=tail=temp;
           }
          else{
              temp.next=head;
              head=temp;
           }
       }
      void delete(Node node){
           node.data = node.next.data;
           node.next = node.next.next;
       }
       //helper method
        Node findNodeByValue(int val) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == val) return temp;
                temp = temp.next;
            }
            return null; // not found
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        linkedlist l1 = input(n);

        System.out.println("Original Linked List:");
        l1.print();
        System.out.println("eneter node to delete");
        int val=sc.nextInt();
        Node target = l1.findNodeByValue(val);
        l1.delete(target);

        System.out.println("Linked List After Deletion:");
        l1.print();
    }

    }
