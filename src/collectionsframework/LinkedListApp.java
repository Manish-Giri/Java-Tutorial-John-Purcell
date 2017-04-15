package collectionsframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by manishgiri on 4/14/17.
 */
public class LinkedListApp {

    private static void measureTimes(String type, List<Integer> list) {
        for(int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        //add items to end of list
        //result - 11ms in ArrayList, 7ms in LinkedList
        /*for(int i = 0; i < 1E5; i++) {
            list.add(i);
        }*/

        //add items at beginning of list
        // Result - 3883 ms in ArrayList, 9ms in LinkedList

        for(int i = 0; i < 1E5; i++) {
            list.add(0,i);
        }
        
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        measureTimes("Array List", arrayList);
        measureTimes("Linked List", linkedList);
    }
}
