package javaprogrammeweek9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMapObject {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John" , 1);
        map.put("David" , 3);
        map.put("Raj" , 5);
        map.put("Paul" , 7);
        map.put("Sam" , 9);


        for ( Map.Entry <String , Integer> people :map.entrySet()) {
            System.out.println(people.getKey()+ " " + people.getValue());
        }
        //Iterate by Iterator
        Iterator<Map.Entry<String , Integer>> peopleList = map.entrySet().iterator();
        while (peopleList.hasNext());
        System.out.println(peopleList.next());
    }
}
