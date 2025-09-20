package Hashmap;

import java.util.HashMap;

//create hashmap using hashmap class to store following pairs(name,age) and display them
public class Basics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
//add or insert elements
        map.put("Rose", 21);
        map.put("Pooja",22);
        map.put("Avni",21);
        map.put("Bob",23);
        map.put("Cherry",25);
        map.put("Rose",21);
        System.out.println(map);
        System.out.println(map.size());
        //get
       System.out.println(map.get("Bob"));
        System.out.println(map.get("Rina"));
        //change and update
        map.put("Bob",24);
        System.out.println(map);

        //remove pair from hashmap
         map.remove("Pooja");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.remove("Dolly")); //null
         //checking if key exist or not
        System.out.println(map.containsKey("Bob"));
        System.out.println(map.containsKey("Pooja"));
        //adding a new entry only if it does not exist
        if(!map.containsKey("Salmaan")){
            map.put("Salmaan",40);
        }
        System.out.println(map);
        map.putIfAbsent("Rose",21);
        System.out.println(map);
      map.putIfAbsent("Joya",23);
        System.out.println(map);
        //get all keys
        System.out.println("keys "+map.keySet());
        //get all values
        System.out.println("values "+map.values());
        //get all entries
        System.out.println("entries "+map.entrySet());
        //traversing all entries
        for(String key:map.keySet()){
            System.out.printf("age of%s is %d ",key,map.get(key));
        }

    }
}
