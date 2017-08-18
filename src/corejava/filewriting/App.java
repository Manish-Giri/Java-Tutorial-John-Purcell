package corejava.filewriting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        File file = new File("/Users/manishgiri/Dropbox/Development/Java/Udemy/Java-Tutorial-JohnPurcell/src/corejava/filewriting/notes.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("Hello");
            bufferedWriter.newLine();
            bufferedWriter.write("World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
