package JAVA.family_tree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Nikolay", "Kartaev", January 1, 1970, 00:00:00 GMT);
        Human human2 = new Human("Anastasia", "Kartaeva", 26081986);
        Human human3 = new Human("Platon", "Kartaev", 22012022, -1, human2, human1);


        human1.addChild(human2);

        ArrayList<Human> children = human2.getChildren();

        System.out.println(human2);

        for (Human human : children) {
        System.out.println(human);
        }

        System.out.println(human3.getFather());
        System.out.println(human3.getMother());
        System.out.println(human3.getParents());
    }

}
