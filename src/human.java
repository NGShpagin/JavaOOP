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
        if (dad != null) dad.childs.add(this);
    }

    /**
     * Создание человека с указанием отца
     * @param id id
     * @param firstName Имя
     * @param lastName Фамилия
     * @param dad Отец
     */
    public human(int id, String firstName, String lastName, human dad){
        this(id, firstName, lastName, dad, null);
    }

    /**
     * Создание человека без указания отца и мамы
     * @param id id
     * @param firstName Имя
     * @param lastName Фамилия
     */
    public human(int id, String firstName, String lastName){
        this(id, firstName, lastName, null, null);
    }

    private void addChild(human dad, human child){
        dad.childs.add(child);
    }
}
