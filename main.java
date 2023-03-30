package tree;

public class main {
    public static void main(String[] args) {
        Human irina = new Human("Ирина", 56);
        Human igor = new Human("Игорь", 60);
        Human vasya = new Human("Вася", 30);
        Human ivan = new Human("Иван", 8);
        Human jane = new Human("Женя", 10);
        Human masha = new Human("Маша", 27);
        Human sasha = new Human("Саша", 9);
        Human sasha10 = new Human("Саша", 10);
        Human sasha11 = new Human("Саша", 11);
        Human sasha3 = new Human("Саша", 3);
        FamilyTree ft = new FamilyTree();
        ft.appendPerentChild(irina, vasya);
        ft.appendPerentChild(irina, masha);
        ft.appendPerentChild(vasya, jane);
        ft.appendPerentChild(vasya, ivan);
        ft.appendPerentChild(irina, igor);
        ft.appendPerentChild(igor, vasya);
        ft.appendPerentChild(igor, masha);
        ft.appendPerentChild(igor, sasha);
        ft.appendPerentChild(igor, sasha10);
        ft.appendPerentChild(igor, sasha11);
        ft.appendPerentChild(igor, sasha3);


        System.out.println("Дети Ирины");
        System.out.println(new Search(ft).spend(irina, Gender.parent));

        System.out.println("Дети Игоря");
        System.out.println(new Search(ft).spend(igor, Gender.parent));

        System.out.println("Муж Ирины");
        System.out.println(new Search(ft).spend(irina, Gender.vife));

        System.out.println("Поиск людей младше заданного возраста");
        System.out.println(new Search(ft).searchAge());
    }

}
