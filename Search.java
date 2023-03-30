package tree;


import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Connect> tree;
    ArrayList<String> resultAge = new ArrayList<>();


    public Search(FamilyTree familyTree) {
        tree = familyTree.getTree();
    }


    public ArrayList<String> spend(Human p, Gender re) {
        for (Connect t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> searchAge() {
        System.out.println("Введите ограничение по возрасту: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Люди, младше: " + age + ":");
        in.close();

        for (Connect t : tree) {

            if (t.p1.age <= age && !resultAge.contains(t.p1.fullName)) {
                resultAge.add(t.p1.fullName);
            }
        }
        return resultAge;
    }

}
