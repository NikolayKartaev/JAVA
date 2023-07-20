package JAVA.Seminars.OOP.Seminar3.study_group;
import java.util.Comparator;

public class StudentComparatorByAge<Member extends Creatures> implements Comparator<Member> {

    @Override
    public int compare(Member o1, Member o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
    
}
