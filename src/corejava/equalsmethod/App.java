package corejava.equalsmethod;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(8, "Sue");
        Person person3 = new Person(5, "Bob");


        System.out.println(person1.equals(person3));
    }

}
