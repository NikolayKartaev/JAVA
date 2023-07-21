package JAVA.Seminars.OOP.Seminar3.study_group;


public class Student implements Comparable<Student>, Creatures {
    private long id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student nextStudent) {
        return name.compareTo(nextStudent.name);
    }

















    // #region не используется
    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age; 
    }

    public void setAge(int age) {
        this.age = age;
    }

}
