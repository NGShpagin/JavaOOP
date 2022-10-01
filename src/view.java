
public class view {
    /**
     * Создание дереве от младшего к старшему
     * @param n самый младший
     * @param space space
     */
    void ViewForward(human n, String space) {
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
    void ViewReverse(human n, StringBuilder sb, String str) {
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

