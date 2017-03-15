package corejava.interfaces;

/**
 * Created by manishgiri on 3/14/17.
 */
public class App {

    private static void printInfo(Info info) {
        info.showInfo();
    }
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.start();

        Person person = new Person("Dan Brown");
        person.greet();

        Info info1 = new Machine();
        info1.showInfo();

        Info info2 = person;
        info2.showInfo();

        System.out.println("------");
        printInfo(info1);
        printInfo(info2);
    }
}
