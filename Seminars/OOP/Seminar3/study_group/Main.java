package JAVA.Seminars.OOP.Seminar3.study_group;

import JAVA.Seminars.OOP.Seminar3.study_group.model.Service;

public class Main {
    public static void main(String[] args) {
        // Student student1 = new Student(0, "Vasiliy", 20);
        // Student student2 = new Student(1, "Vasiliy", 20);
        // StudyGroup studyGroup1 = new StudyGroup();
        // studyGroup1.addStudent(student1);
        // studyGroup1.addStudent(student2);

        Service service = new Service();
        service.addStudent("Маша", 18);
        service.addStudent("Паша", 21);
        service.addStudent("Даша", 19);
        service.addStudent("Вася", 20);

        System.out.println(service.getStudentsInfo());
        service.sortByName();
        System.out.println(service.getStudentsInfo());
        service.sortByAge();
        System.out.println(service.getStudentsInfo());

    }

}
