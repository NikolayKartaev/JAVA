package JAVA.Seminars.OOP.Seminar3.study_group;

public class Teacher implements Comparable<Teacher>, Creatures {


    int age;
    String name;


    @Override
    public int getAge() {
        return age; 
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int compareTo(Teacher nextTeacher) {
        return name.compareTo(nextTeacher.name);
    }
    
}
