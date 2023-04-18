package tree.family;


import tree.human.Human;

import java.io.Serializable;
import java.util.Scanner;
import java.io.*;
public class Main implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FamilyTree<Human> familyTolstoy = new FamilyTree<>();
        Scanner scn = new Scanner(System.in);
        Writable writable = new FileHandler();
        int key = 0;
        String nameFather;
        String nameMather;
        String nameTemp;
        

        while (key != 5) {
            System.out.println(
                    " Введите:\n 0 - Вывести список членов семьи\n 1 - Добавить члена семьи\n 2 - Загрузить семью из файла\n 3 - Вывести детей члена семьи\n 4 - Найти члена семьи по имени \n 5 - Выйти");
            key = scn.nextInt();
            switch (key) {
                case 0:
                    System.out.println(familyTolstoy.getInfo());
                    break;
                case 1:

                    System.out.println("Введите имя:");
                    nameTemp=scn.next();
                    System.out.println("Введите имя отца:");
                    nameFather = scn.next();
                    System.out.println("Введите имя матери:");
                    nameMather = scn.next();
                    familyTolstoy.addMember(new Human(nameTemp,familyTolstoy.getByName(nameFather),familyTolstoy.getByName(nameMather)));

                    System.out.println(familyTolstoy);
                    break;

                case 2:

                    familyTolstoy = (FamilyTree) writable.load("family.txt");
                    System.out.println(familyTolstoy);
                    break;

                case 3:
                    System.out.println("Введите имя Отца:");
                    nameFather = scn.next();
                    boolean found = false;
                    for (Human human : familyTolstoy) {
                        if (human.getName().equals(nameFather)) {
                            System.out.println("Дети отца " + nameFather + " :" + human.getChildrenInfo());
                            found = true;
                            break;
                        }
                        if (!(found)) {
                            System.out.println("Отец не найден");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Введите искомое имя");
                    familyTolstoy.find(scn.next());
                    break;
                case 5:
                    writable.save(familyTolstoy,"family.txt");
                    scn.close();
                    break;
                default:
                    break;
            }

            familyTolstoy.sortByName();
            System.out.println("по имени:"+familyTolstoy);
            familyTolstoy.sortByChild();
            System.out.println("по количеству детей:"+familyTolstoy);

        }

    }
}