package tree.familyTree;


import tree.human.Human;
import tree.human.HumanComparatorBirthDate;
import tree.human.HumanComporatorId;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class FamilyTree implements Serializable, Iterable<Human> {
    private final List<Human> humanList;

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

    @Override
    public String toString() {
        return getInfo();
    }

    @Override
    public Iterator<Human> iterator(){
        return new HumanIterator(humanList);
    }

    public void sortId() {
        humanList.sort(new HumanComporatorId());
    }

    public void sortBirthDate() {
        humanList.sort(new HumanComparatorBirthDate());
    }

   


}
