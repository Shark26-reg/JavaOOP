package tree;

import java.util.ArrayList;

public class FamilyTree {
    private ArrayList<Connect> tree = new ArrayList<>();

    public ArrayList<Connect> getTree() {
        return tree;
    }

    public void appendPerentChild(Human parent, Human children) {
        tree.add(new Connect(parent, Gender.parent, children));
        tree.add(new Connect(children, Gender.children, parent));
    }


    public void appendVifeHusbent(Human vife, Human husbent) {
        tree.add(new Connect(vife, Gender.vife, husbent));
        tree.add(new Connect(husbent, Gender.husbent, vife));

    }
}