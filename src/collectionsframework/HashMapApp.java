package collectionsframework;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manishgiri on 4/15/17.
 */
public class HashMapApp {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        //add items
        map.put(1, "one");
        map.put(2,"two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        // retrieve items
        String text = map.get(4);
        //System.out.println(text);

        //iterate
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("Key = %d, Value = %s\n", key, value);
        }

    }
}
