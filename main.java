package tree;


import java.io.IOException;

import tree.familyTree.FamilyTree;
import tree.familyTree.SaveRead;
import tree.human.Human;
import tree.human.Gender;




public class Main {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SaveRead saveread = new SaveRead();
        FamilyTree tree = new FamilyTree();

        tree.add(new Human("Василий", "21.07.1965", Gender.Male, null, null));
        tree.add(new Human("Ирина", "13.03.1970", Gender.Female, null, null));
        tree.add(new Human("Саша","05.02.1989", Gender.Male, tree.getByName("Василий"), tree.getByName("Ирина")));
        tree.add(new Human("Мария", "19.11.1991", Gender.Female, tree.getByName("Василий"), tree.getByName("Ирина")));
        System.out.println(tree.getInfo());

        saveread.save(tree, "fileTree.txt");
        saveread.read("fileTree.txt");

    }


        


    
}
