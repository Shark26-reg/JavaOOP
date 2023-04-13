package tree.main;


import java.io.IOException;
import java.time.LocalDate;

import tree.familyTree.FamilyTree;
import tree.handler.SaveRead;
import tree.human.Human;
import tree.human.Gender;




public class Main {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SaveRead saveread = new SaveRead();
        FamilyTree tree = new FamilyTree();
        Service service = new Service(tree);

        tree.add(new Human(1, "Василий", LocalDate.of(1965, 07, 21), Gender.Male, null, null));
        tree.add(new Human(2, "Ирина", LocalDate.of(1970, 03, 13), Gender.Female, null, null));
        tree.add(new Human(4, "Саша", LocalDate.of(1989, 02, 05), Gender.Male, tree.getByName("Василий"), tree.getByName("Ирина")));
        tree.add(new Human(3, "Мария", LocalDate.of(1991, 11, 19), Gender.Female, tree.getByName("Василий"), tree.getByName("Ирина")));
        System.out.println(tree.getInfo());
        System.out.println();

        service.sortBirthDate();
        System.out.println("Отсортерованный список по дате рожденья: ");
        for (Human item : tree){
            System.out.println(item.getInfo());

        }
        System.out.println();
        service.sortId();
        System.out.println("Отсортированный список по ID: ");
        for (Human item : tree){
            System.out.println(item.getInfo());
        }



        saveread.save(tree, "fileTree.txt");
        saveread.read("fileTree.txt");

    }


        


    
}
