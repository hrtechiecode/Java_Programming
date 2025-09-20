package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        //A HashMap<K, V> in Java stores data in (key, value) pairs and allows:
        //Store, search, and update data in O(1) average time
        //Avoid duplicates (keys are unique).
        Map<Integer,Integer> hash=new HashMap<>();
        hash.put(1,2);// key: 1, value: 2
        hash.put(2,3);
        hash.put(3,3);
        hash.put(4,1);
        hash.put(5,5);
        System.out.println(hash);
       int x =hash.get(3);
        System.out.println(x);
    boolean y=hash.containsKey(2);
        System.out.println(y);
        System.out.println(hash.size());

        System.out.println(hash.remove(2));
        System.out.println(hash);
    }
}
