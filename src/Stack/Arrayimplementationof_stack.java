package Stack;

public class Arrayimplementationof_stack {
    static class Stack {
        int[] arr = new int[10];
        int idx = 0;
        void push(int x) {
            if (idx == arr.length) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[idx] = x;
            idx++;
        }
   int  pop() {
       if(idx==0){
           System.out.println("stack is empty");
           return -1;
       }
                int top = arr[idx - 1];
                arr[idx - 1] = 0;
                idx--;
       return top;
            }
        int peek(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int size(){
            return idx-1;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(size()==0){
                return true;
            }
            return false;
        }
        boolean isFull(){
            if(idx== arr.length){
                return true;
            }
            return false;
        }


    }
        public static void main(String[] args) {
            Stack st = new Stack();
            st.push(55);
            st.push(50);
            st.push(45);
            st.push(35);
            st.push(25);

            st.display();
            st.pop();
            st.display();
            System.out.println(st.peek());
            System.out.println(st.isEmpty());
            System.out.println(st.size());
            System.out.println(st.isFull());
        }
    }
