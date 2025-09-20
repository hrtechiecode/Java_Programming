package Multidimensional_array;

import java.util.ArrayList;

public class ArrayList_2darray {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(10);a.add(20);a.add(30);a.add(40);a.add(50);
        ArrayList<Integer>b=new ArrayList<>();
        b.add(11);b.add(21);b.add(31);b.add(41);b.add(51);
        ArrayList<Integer>c=new ArrayList<>();
        c.add(21);c.add(22);c.add(23);c.add(24);c.add(25);
        ArrayList <ArrayList<Integer>>array=new ArrayList<>();
        array.add(a);  array.add(b);  array.add(c);
        System.out.println(array);
        for(int i=0;i< array.size();i++){
            for(int j=0;j< array.get(i).size();j++){
                System.out.print(array.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
