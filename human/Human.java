package tree.human;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human implements Serializable{
    private int id;
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    private Human father;
    private Human mother;
    private int idMather;
    private int idFather;
    private List<Human> children;

    public Human(int id, String name, LocalDate birthDate, Gender gender, Human father, Human mother){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
       // this.idMather = idMather;
       // this.idFather = idFather;
        children = new ArrayList<>();
    }

    public Human(int id, String name, LocalDate birthDate, Gender gender){
        this(id, name, birthDate, gender, null, null);
    }

    public Human(int id2, String name2, LocalDate birthDate2, Gender gender2, int idMother, int idFather2) {
    }

    public boolean addChil(Human chil){
        if (!children.contains(chil)){
            children.add(chil);
            return true;
        }
        return false;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
        
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    
    public Human getFather(){
        return father;

    }

    public Human getMother(){
        return mother;

    }

    public List<Human> getChildren(){
        return children;
    }

    public Gender getGender(){
        return gender;
    }

    public int getIdMother(){
        return idMather;
    }

    public int getIdFather(){
        return idFather;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }

    
    public void setFather(Human father){
        this.father = father;
    }

    public void setMother(Human mother){
        this.mother = mother;
    }

       

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ");
        sb.append(id);
        sb.append(", ");
        sb.append("Имя: ");
        sb.append(name);
        sb.append(", ");
        sb.append("Дата рождения: ");
        sb.append(birthDate);
        sb.append(", ");
        sb.append("Пол: ");
        sb.append(getGender());
        sb.append(", ");
        sb.append(getMotherInfo());
        sb.append(", ");
        sb.append(getFatherInfo());
        sb.append(", ");
        sb.append(getChildrenInfo());
        return sb.toString();

    }

    public String getBirthDateInfo(){
        String res = "Дата рожденья: ";
        if (birthDate != null){
            res += LocalDate.of(0, 0, 0);
        } else {
            res += "non";
        }
        return res;
    }

    public String getMotherInfo(){
        String res = "Мать: ";
        if (mother != null){
            res += mother.getName();
        } else {
            res += "неизвестна";
        }
        return res;
    }

    public String getFatherInfo(){
        String res = "Отец: ";
        if (father != null){
            res += father.getName();
        } else {
            res += "неизвестен";
        }
        return res;
    }

    public String getChildrenInfo(){
        StringBuilder res = new StringBuilder();
        res.append("Дети: ");
        if (children.size() != 0){
            res.append(children.get(0).getName());
            for (int i = 1; i < children.size(); i++){
                res.append(", ");
                res.append(children.get(i).getName());
            }
        } else {
            res.append("отсутствуют");
        }
        return res.toString();
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Human)){
            return false;
        }
        Human human = (Human) obj;
        return human.getName().equals(getName());
    }


    
}
