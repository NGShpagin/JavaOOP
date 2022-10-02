import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyTree {
    public static void main(String[] args) {
        // дед
        Human h301 = new Human(301, "Adam", "Adamov", Human.Sex.male);

        // дядя (сын деда (h301))
        Human h211 = new Human(211, "Ruslan", "Ivanov", Human.Sex.male, h301);

        // отец (сын деда (h301))
        Human h221 = new Human(221, "Maria", "Alekseeva", Human.Sex.female, h301);

        // отец (сын деда (h301))
        Human h201 = new Human(201, "Ivan", "Petrov", Human.Sex.male, h301);

        // мать
        Human h202 = new Human(202, "Elena", "Petrova", Human.Sex.female);

        // ребенок 1 (сын отца (h201) и мамы (h202))
        Human h101 = new Human(101, "Vasya", "Petrov", Human.Sex.male, h201, h202);

        // ребенок 2 (сын отца (h201) и мамы (h202))
        Human h102 = new Human(102, "Nika", "Nikonova", Human.Sex.female, h201, h202);

        System.out.println(h201.getInfo());
        System.out.println(h102.getInfo());

        System.out.println();
        StringBuilder sb = new StringBuilder();
        String str = "";
        View v = new View();
        v.ViewReverse(h301, sb, str);
        System.out.println(sb);
        v.ViewForward(h102, " ");
    }
}
