package collectionsframework;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by manishgiri on 4/8/17.
 */
public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //add
        numbers.add(10);
        numbers.add(30);
        numbers.add(100);
        //retrieve
        for(int value: numbers) {
            System.out.println(value);
        }

        //removing items at the end is fast, but beginning or middle is slow
        ArrayList<Integer> numbers1 = new ArrayList<>(100);
        Random random = new Random();
        for(int i = 0; i < 100; i++) {
            int num = random.nextInt((100-1)+1) + 1;
            numbers1.add(num);
        }

        //display list
        for(int n: numbers1) {
            System.out.print(n);
        }
        System.out.println();

        //delete last element, note time diff
        long currentTimeMS = System.currentTimeMillis();
        System.out.println(currentTimeMS);
        //numbers1.remove(numbers1.size() -1);
        numbers1.remove(10);
        long endTimeMS = System.currentTimeMillis();
        System.out.println(endTimeMS);
        long diff = endTimeMS - currentTimeMS;

        System.out.println("Deletion time from end = " + diff);

    }
}
