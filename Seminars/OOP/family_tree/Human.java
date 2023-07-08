package JAVA.Seminars.OOP.family_tree;

import java.util.ArrayList;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int dateOfDeath;
    private Gender gender;
    private Human mother;
    private Human father;
    private ArrayList<Human> children;

    public Human(String name, String surname, int dateOfBirth, int dateOfDeath) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.children = new ArrayList<>();
        
    }

    public Human(String name, String surname, int dateOfBirth) {
        this(name, surname, dateOfBirth, 0);
        this.children = new ArrayList<>();

    }

    public void setDateOfDeath(int dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void addChild(Human child) {
        mother.children.add(child);
        father.children.add(child);

    }
    
}
