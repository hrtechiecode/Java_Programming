package Collection;

import java.util.LinkedList;

public class Linked_list_insertion {
    public static void main(String[] args) {
        LinkedList<Integer>l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(5);
        System.out.println(l);
        //iterate through loop
        for (int val : l) {
            System.out.print(val + " ");
        }

        System.out.println("length  " +l.size());
        l.addLast(20);
        System.out.println("insert at last  "+l);
        l.addFirst(15);
        System.out.println(" insert at first " +l);
        System.out.println( "element is present or not  "+l.contains(20));   // true if element is present
        System.out.println("first index of  " + l.indexOf(5));       // first index of element
        System.out.println("last index "+l.lastIndexOf(5));   // last index of element
        System.out.println("list is empty or not "+l.isEmpty());

        l.remove(2);
        System.out.println("reversed");
        System.out.println(l.reversed());
        int first = l.getFirst();
        System.out.println("Access first element   " +first);
        int last = l.getLast();
        System.out.println("Access last element   " +last);
        int value = l.get(2);
        System.out.println("// Access at index 2  " +value);

        System.out.println("remove an element from idx" +l);
        System.out.println("remove first element");
        System.out.println( l.removeFirst());
        System.out.println("remove last element");
        System.out.println(l.removeLast());
        System.out.println("remove first occurance");
        l.removeFirstOccurrence(1);
        System.out.println(l);
        System.out.println("Removes object with value 10");
        l.remove(Integer.valueOf(4));
        System.out.println(l);


    }
}
