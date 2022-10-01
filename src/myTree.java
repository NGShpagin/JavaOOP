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


        System.out.println();
        StringBuilder sb = new StringBuilder();
        String str = "";
        view v = new view();
        v.ViewReverse(h301, sb, str);
        System.out.println(sb);
        v.ViewForward(h102, " ");
    }
}
