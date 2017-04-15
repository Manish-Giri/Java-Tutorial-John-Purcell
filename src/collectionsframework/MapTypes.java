package collectionsframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by manishgiri on 4/15/17.
 */
public class MapTypes {

    private static void testMap(Map<Integer, String> map) {

        // add items to map
        map.put(3, "three");
        map.put(5, "five");
        map.put(0, "zero");
        map.put(8, "eight");
        map.put(88, "eighty eight");
        map.put(34, "thirty four");
        map.put(1, "one");
        map.put(19, "nineteen");

        // retrieve values from map
        for(Integer key: map.keySet()) {

            //get value for key
            String value = map.get(key);

            System.out.println(key + " : " + value);
        }
    }

    public static void main(String[] args) {

        // hashmap - no ordering
        Map<Integer, String> hashMap = new HashMap<>();

        // linkedhashmap - ordering of insertion is preserved
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // treemap - natural ordering is preserved
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(treeMap);
    }
}
