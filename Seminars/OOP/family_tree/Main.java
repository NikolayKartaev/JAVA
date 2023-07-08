package JAVA.Seminars.OOP.family_tree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        

        Human human1 = new Human("Nikolay", "Kartaev", 3011987);
        Human human2 = new Human("Platon", "Kartaev", 22012022);

        human1.addChild(human2);
        
        ArrayList<Human> children = human1.getChildren();

        System.out.println(human1);
        System.out.println(children);
    }   

    
}
