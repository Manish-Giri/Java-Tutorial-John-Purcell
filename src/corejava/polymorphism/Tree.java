package corejava.polymorphism;

/**
 * Created by manishgiri on 3/15/17.
 */
public class Tree extends Plant {

    @Override
    public void grow() {
        System.out.println("Tree growing");
    }

    public void shed() {
        System.out.println("Leaves shedding");
    }
}
