package tree;


import java.util.ArrayList;

public interface Search {
    ArrayList<String> getParents(Human person);
    ArrayList<String> getChildren(Human person);
    ArrayList<String> getBrotherSister(Human person);
    ArrayList<String> getPartners(Human person);
    ArrayList<String> spend(Human person, Gender rel);
}
