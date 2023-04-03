package tree;
public class Viewer {
    Search gTree;
    public Viewer(Search familyTree){
        this.gTree = familyTree;
    }
    public void viewerBrotherSiste(Human person){
        System.out.printf("%s | братья / сестры -> ", person.getFullName());
        System.out.println(this.gTree.getBrotherSister(person));
    }

    public void viewerParent(Human person){
        System.out.printf("%s | родители -> ", person.getFullName());
        System.out.println(this.gTree.getParents(person));
    }

    public void viewerChildren(Human person){
        System.out.printf("%s | дети -> ", person.getFullName());
        System.out.println(this.gTree.getChildren(person));
    }

    public void viewerPartners(Human person){
        System.out.printf("%s | семейное положение -> ", person.getFullName());
        System.out.println(this.gTree.getPartners(person));
    }

    
}
