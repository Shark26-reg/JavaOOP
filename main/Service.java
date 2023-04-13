package tree.main;

import java.time.LocalDate;
import tree.human.Human;
import tree.familyTree.FamilyTree;
import tree.human.Gender;

public class Service {
    private int id;
    private FamilyTree familyGroup;

    public Service(FamilyTree familyGroup){
        this.familyGroup = familyGroup;
    }

    public FamilyTree getFamilyGroup(){
        return familyGroup;
    }

    public void add(String name, LocalDate birthDate, Gender gender, Human mather, Human father){
        id++;
        familyGroup.add(new Human(id, name, birthDate, gender, mather.getIdMother(), father.getIdFather()));

    }

    public void sortId(){
        familyGroup.sortId();
    }

    public void sortBirthDate() {
        familyGroup.sortBirthDate();
    }

    public void add(int i, String string,  String string2, LocalDate of, Gender male){
        
    }
    
}
