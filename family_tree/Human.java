package JAVA.family_tree;

import java.sql.Date;
import java.util.ArrayList;

/** */
public class Human {
    private String name;
    private String surname;
    private Date dateOfBirth ;
    private Date dateOfDeath;
    private Gender gender;
    private Human mother;
    private Human father;
    private ArrayList<Human> children;

    public Human(String name, String surname, Date dateOfBirth, Date dateOfDeath, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();

    }

    public Human(String name, String surname, Date dateOfBirth, Human mother, Human father) {
        this(name, surname, dateOfBirth, null, mother, father);
    }

    public Human(String name, String surname, Date dateOfBirth) {
        this(name, surname, dateOfBirth, null, null, null);
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void addChild(Human child) {
        child.mother = this;
        children.add(child);
    }

    @Override
    public String toString() {
        return String.format("Имя, фамилия: %s %s\nДата рождения: %d\n", name, surname, dateOfBirth);
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    ArrayList<Human> parents;

    public ArrayList<Human> getParents() {
        parents = new ArrayList<>();
        parents.add(this.mother);
        parents.add(this.father);
        return parents;
    }
}
