package tree.human;
import java.util.Comparator;


public class HumanComparatorBirthDate implements Comparator<Human> {


    @Override
    public int compare(Human o1, Human o2){
        return o2.getBirthDate().compareTo(o1.getBirthDate());
    }
    
}
