package corejava.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by manishgiri on 7/18/17.
 */
public class App {

    public static void main(String[] args) {
        // file not in project root - direct path
        // String fileName = "/Users/manishgiri/Dropbox/Development/Java/Udemy/Java-Tutorial-JohnPurcell/src/corejava/scanner/file.txt";
        // file in project root - relative path
        String fileName = "resources/example.txt";
        Scanner scanner = null;
        try {
            File textFile = new File(fileName);
            scanner = new Scanner(textFile);
            int value = scanner.nextInt();
            System.out.println("Read = " + value);
            int count = 2;
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(count + " : " + line);
                count++;
            }

        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        finally {
            scanner.close();
        }
    }
}
