import java.lang.reflect.Array;
import java.util.ArrayList;

public class myTree {
    public static void main(String[] args) {
        // дед
        human h301 = new human(301, "Adam", "Adamov");

        // дядя (сын дедв (h301))
        human h211 = new human(211, "Ruslan", "Ivanov", h301);

        // отец (сын дедв (h301))
        human h201 = new human(201, "Ivan", "Petrov", h301);

        // мать
        human h202 = new human(202, "Elena", "Petrova");

        // ребенок 1 (сын отца (h201) и мамы (h202))
        human h101 = new human(101, "Vasya", "Petrov", h201, h202);

        // ребенок 2 (сын отца (h201) и мамы (h202))
        human h102 = new human(102, "Nika", "Nikonova", h201, h202);

//         Дети
        h201.childs.add(h101); h201.childs.add(h102); // дети отца
        h202.childs.add(h101); h202.childs.add(h102); // дети мамы
        h301.childs.add(h201); h301.childs.add(h211); // дети деда

        System.out.println();
        StringBuilder sb = new StringBuilder();
        String str = "";
        iterr.ViewReverse(h301, sb, str);
        System.out.println(sb);
        iterr.ViewForward(h102, " ");
    }
}


class iterr {
    /**
     * Создание дереве от младшего к старшему
     * @param n самый младший
     * @param space space
     */
    static void ViewForward(human n, String space) {
        if (n != null) {
            System.out.printf("%s%s %s %s\n", space, n.id, n.firstName, n.lastName);
            if (n.dad != null) ViewForward(n.dad, space + "  ");
            if (n.mom != null) ViewForward(n.mom, space + "  ");
        }
    }

    /**
     * Создание дерева от старшего к младушему
     * @param n самый старший
     * @param sb StringBuider для создаия отступов
     * @param str Strint str = ""
     */
    static void ViewReverse(human n, StringBuilder sb, String str) {
        if (n != null) {
            sb.append(String.format("%sid: %d, name: %s, surname: %s\n", str, n.id, n.firstName, n.lastName));
            if (!n.childs.isEmpty()) {
                str += "  ";
                for (human child : n.childs) {
                    ViewReverse(child, sb, str);
                }
            }
        }
    }
}
