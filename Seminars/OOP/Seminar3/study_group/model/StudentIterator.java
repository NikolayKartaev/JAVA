package JAVA.Seminars.OOP.Seminar3.study_group;
import java.util.Iterator;
import java.util.List;



public class StudentIterator<Member extends Creatures> implements Iterator<Member> {
    private int index;
    private List<Member> studentList;

    
    public StudentIterator(List<Member> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return studentList.size() > index;
    }

    @Override
    public Member next() {
        return studentList.get(index++);
    }

}
