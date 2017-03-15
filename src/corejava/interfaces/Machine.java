package corejava.interfaces;

/**
 * Created by manishgiri on 3/14/17.
 */
public class Machine implements Info {
    private int id = 7;
    public void start() {
        System.out.println("Machine started");
    }


    @Override
    public void showInfo() {
        System.out.println("Machine ID is " + id);
    }
}
