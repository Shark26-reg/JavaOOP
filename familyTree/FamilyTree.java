package tree.familyTree;


import tree.human.Human;

import java.util.ArrayList;
import java.util.List;


public class FamilyTree {
    private List<Human> humanList;

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public FamilyTree(List<Human> humanList) {
        this.humanList = humanList;

    }

    public boolean add(Human human) {
        if (human == null) {
            return false;
        }
        if (!humanList.contains(human)) {
            humanList.add(human);
            if (human.getFather() != null) {
                human.getFather().addChil(human);
            }
            if (human.getMother() != null) {
                human.getMother().addChil(human);
            }
            return true;
        }
        return false;
    }

    public Human getByName(String name) {
        for (Human human : humanList) {
            if (human.getName().equals(name)) {
                return human;
            }
        }
        return null;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("В дереве ");
        sb.append(humanList.size());
        sb.append(" Объекта: \n");
        for (Human human : humanList) {
            sb.append(human.getInfo());
            sb.append("\n");
        }
        return sb.toString();
    }


}
