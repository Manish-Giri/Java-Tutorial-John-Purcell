package corejava.anonymousclass;

/**
 * Created by manishgiri on 7/18/17.
 */
public class App {

    public static void main(String[] args) {

        // use anon class to create a subclass of Machine that overrides the start method
        Machine machine = new Machine() {
            void start() {
                System.out.println("Camera started.");
            }
        };
        machine.start();

        // use anon class to provide an implementation of grow() in Plant interface
        Plant plant = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant is growing.");
            }
        };

        // call grow
        plant.grow();

        // test lambda
        Plant myLambda = () -> System.out.println("Plant growing!");
        myLambda.grow();
    }
}
