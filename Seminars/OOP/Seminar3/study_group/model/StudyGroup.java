package JAVA.Seminars.OOP.Seminar3.study_group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;








public class StudyGroup<Man extends Creatures> implements Iterable<Man> {
    List<Man> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Man man) {
        studentList.add(man);
    }

    @Override
    public Iterator<Man> iterator() {
        // return studentList.iterator(); // создание итератора из List
        return new StudentIterator<>(studentList);
    }

    public void sortByName() {
        studentList.sort(new StudentComparatorByName<>());
    }

    public void sortByAge() {
        // Collections.sort(studentList, new StudentComparatorByAge()); исходный
        studentList.sort(new StudentComparatorByAge<>()); // после Inline Method
    }

}
