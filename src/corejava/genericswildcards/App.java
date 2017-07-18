package corejava.genericswildcards;

import java.util.ArrayList;

/**
 * Created by manishgiri on 3/15/17.
 */

class Machine {
    @Override
    public String toString() {
        return "I am a Machine";
    }
}

class Camera extends Machine{

    @Override
    public String toString() {
        return "I am a Camera";
    }
}
public class App {
    private static void showList(ArrayList<? extends Machine> list) {
        //the wildcard '?' ensures that only Machine and it's child types are added to list
        System.out.println("In showlist method");
        for(Machine machine: list) {
            System.out.println(machine);
        }

    }
    public static void main(String[] args) {
        ArrayList<Machine> machines = new ArrayList<>();
        machines.add(new Machine());
        machines.add(new Machine());

        //machines.add(new Camera());

        /*
         for(Machine machine: machines) {
            // System.out.println(machine);
        }*/

        ArrayList<Camera> cameras = new ArrayList<>();
        cameras.add(new Camera());
        cameras.add(new Camera());

        /*
        for(Camera camera: cameras) {
            //System.out.println(camera);
        }
        */

        showList(machines);
        showList(cameras);


    }
}
