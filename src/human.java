import java.util.ArrayList;

public class human {
    public int id;
    public String firstName;
    public String lastName;
    human dad;
    human mom;
    ArrayList<human> childs = new ArrayList<human>();

    public human(int id, String firstName, String lastName, human dad, human mom) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dad = dad;
        this.mom = mom;
//        dad.childs.add(new human(id, firstName, lastName, dad, mom));
    }

    public human(int id, String firstName, String lastName, human dad){
        this(id, firstName, lastName, dad, null);
//        dad.childs.add(new human(id, firstName, lastName, dad));
    }

    public human(int id, String firstName, String lastName){
        this(id, firstName, lastName, null, null);
    }

    private void addChild(human dad, human child){
        dad.childs.add(child);
    }
}
