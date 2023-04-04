package tree.human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private Gender gender;
    private String birthDate;
    private Human father;
    private Human mother;
    private List<Human> children;

    public Human(String name, String birthDate, Gender gender, Human father, Human mother){
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        children = new ArrayList<>();
    }

    public Human(String name, String birthDate, Gender gender){
        this(name, birthDate, gender, null, null);
    }

    public boolean addChil(Human chil){
        if (!children.contains(chil)){
            children.add(chil);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
        
    }

    public String getBirthDate(){
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

    public void setBirthDate(String birthDate){
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
