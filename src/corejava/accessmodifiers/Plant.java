package corejava.accessmodifiers;

/**
 * Created by manishgiri on 3/14/17.
 */
public class Plant {
    protected String name;
    private String type;

    public final static int id = 8;

    public Plant() {
        this.name = "Freddy";
        this.type = "tree";
    }
}
