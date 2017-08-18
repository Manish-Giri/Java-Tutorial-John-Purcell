package corejava.trywithresources;

import java.io.*;

public class App {

    public static void main(String[] args) {
        String fileName = "/Users/manishgiri/Dropbox/Development/Java/Udemy/Java-Tutorial-JohnPurcell/src/corejava/scanner/file.txt";
        File file = new File(fileName);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
