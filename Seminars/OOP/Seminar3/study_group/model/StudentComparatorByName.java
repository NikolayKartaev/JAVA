package JAVA.Seminars.OOP.Seminar3.study_group;

import java.util.Comparator;

public class StudentComparatorByName<Member extends Creatures> implements Comparator<Member>{

    @Override
    public int compare(Member o1, Member o2) {
        return (o1.getName().compareTo(o2.getName()));
    }

}
