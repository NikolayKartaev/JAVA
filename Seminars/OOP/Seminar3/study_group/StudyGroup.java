package JAVA.Seminars.OOP.Seminar3.study_group;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        // return studentList.iterator(); // создание итератора из List
        return new StudentIterator(studentList);
    }

    public void sortByName() {
        Collections.sort(studentList);
    }

    public void sortByAge() {
        // Collections.sort(studentList, new StudentComparatorByAge()); исходный
        studentList.sort(new StudentComparatorByAge()); // после Inline Method
    }

}
