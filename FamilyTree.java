package tree;

import java.util.ArrayList;
import java.util.HashSet;

public class FamilyTree {
    private ArrayList<Connect> tree = new ArrayList<>();

    public ArrayList<Connect> getTree() {
        return tree;
    }

    public void append(Human parent, Human children) {
        tree.add(new Connect(parent, Gender.parent, children));
        tree.add(new Connect(children, Gender.children, parent));
    }

}