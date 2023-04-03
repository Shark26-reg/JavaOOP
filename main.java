package tree;

public class main {
    public static void main(String[] args) {
        Human irina = new Human("Ирина", Sex.woman, "12.07.1936");
        Human elena = new Human("Елена", Sex.woman, "21.12.1960");
        Human vasya = new Human("Вася", Sex.man, "25.03.1957");
        Human ivan = new Human("Иван", Sex.man, "15.09.1983");
        Human jane = new Human("Женя", Sex.woman, "03.02.1981");
        Human masha = new Human("Маша", Sex.woman, "05.06.1965");
        Human gala = new Human("Галина", Sex.woman, "18.10.2009");
        Human anton = new Human("Антон", Sex.man, "22.05.1986");
        Human ura = new Human("Юра", Sex.man, "19.02.2015");
        
        FamilyTree ft = new FamilyTree();
        ft.addPartner(irina, vasya);
        ft.addPartner(irina, masha);
        ft.addPartner(vasya, elena);
        ft.addPartner(vasya, jane);
        ft.addPartner(elena, jane);
        ft.addPartner(vasya, ivan);
        ft.addPartner(elena, ivan);
        ft.addPartner(vasya, anton);
        ft.addPartner(elena, anton);
        ft.addPartner(ivan, gala);
        ft.addPartner(ivan, ura);
        


        new Viewer(ft).viewerParent(vasya);
        new Viewer(ft).viewerBrotherSister(vasya);
        new Viewer(ft).viewerPartners(vasya);
        new Viewer(ft).viewerChildren(vasya);
        new Viewer(ft).viewerBrotherSister(ivan);
        new Viewer(ft).viewerParent(ivan);
        

    }

}
