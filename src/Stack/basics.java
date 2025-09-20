package Stack;//LIFO

import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.peek());//top most element
        s.pop();//remove element
        System.out.println(s);
        s.pop();//remove element
        System.out.println(s);
        System.out.println("size is: "+s.size());
        //print first element
        while(s.size()>2){
            s.pop();
        }
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println();
//        //print third element
//        while(s.size()>3){
//            s.pop();
//        }
//        System.out.println(s.peek());
//        System.out.println(s);

    }
}
