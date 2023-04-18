package tree.comparator;
import java.util.Comparator;

import tree.human.Human;


public class HumanComporatorByChild implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        if (o2.getChildrenList().size() == o1.getChildrenList().size()) {
            return 0;
        } else if (o1.getChildrenList().size() > o2.getChildrenList().size()) {
            return -1;
        }
        else{
            return 1;}
    }
}