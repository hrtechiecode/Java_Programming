package Collection;

import java.util.*;

public class questions {
    static Scanner sc=new Scanner(System.in);
    static int[]array;
    static void input(){
        System.out.println("enter size of array");
        int n=sc.nextInt();
        array=new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i< array.length;i++){
            array[i]=sc.nextInt();
        }
    }
    static void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");

        }
        System.out.println();
    }

    //find unique element in an array
    static void unique() {
        int count=0;
        HashSet<Integer> h = new HashSet<>();
        System.out.println("unique element ");
        for (int n : array) {  //looping through all elements of the array one by one.
            if (h.add(n)) {
                System.out.print(n + " ");
                count++;
            }
        }
            System.out.println();
        System.out.println(count);
    }
    //sorted array
    static void sort(){
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("ascending order");
        for(int n:array){
       list.add(n);//copy elements of array in a list
        }
        Collections.sort(list);//sort list
        System.out.println(list);  //o/p in form of list
        //o/p in form of array
        for(int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("descending order");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
    static void stringsort(){
        ArrayList<String > names = new ArrayList<>(Arrays.asList("Zara", "Bob", "Anna"));
        Collections.sort(names); // Ascending (A–Z)

        System.out.println("ascending order" +names); // [Anna, Bob, Zara]
        System.out.println("descending order");
        Collections.sort(names, Collections.reverseOrder());
        System.out.println(names);

    }
    public static void main(String[] args) {
input();
print();
unique();
sort();
stringsort();
    }
}
