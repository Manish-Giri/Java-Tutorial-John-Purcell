package corejava.polymorphism;

/**
 * Created by manishgiri on 3/15/17.
 */
public class App {
    private static void doGrow(Plant plant) {
        System.out.println("Calling from method");
        plant.grow();
    }
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.grow();

        Tree tree = new Tree();
        tree.grow();
        tree.shed();

        //polymorphism - parent reference to a child object
        Plant plant2 = new Tree();
        //compile time - ensure that grow() exists in Plant, but at runtime the child grow is called
        plant2.grow();
        //error -
        //plant2.shed();

        //polymorphism - using child type instead of parent type
        doGrow(plant1);
        doGrow(plant2);




    }
}
