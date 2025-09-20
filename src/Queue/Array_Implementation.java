package Queue;

import java.util.Scanner;

public class Array_Implementation {
    public static class queue{
        int front=-1;
        int rear=-1;
        int size=0;
        int arr[]=new int[5];
        //add
        public void add(int val){
            if(rear==arr.length-1){
                System.out.println("queue is full ");
                return;
            }
         if(front==-1)
         {
             front=rear=0;
             arr[0]=val;
         }
         else{
             arr[++rear]=val;
         }
         size++;
        }
        //remove
        public int remove(){
            if(front==-1){
                System.out.println("queue is empty ");
            }
                front++;
            size--;
                return arr[front-1];
            }
public int peek(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
}
    public  void display() {
        if (size == 0){
            System.out.println("queue is empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }   }
    public static void main(String[] args) {
        queue a=new queue();
        a.display();
        a.add(1);
        a.add(2);
        a.add(3);
        a.display();
        System.out.println(a.remove());
        a.display();
        System.out.println(a.peek());
        System.out.println(a.size);

    }
}
