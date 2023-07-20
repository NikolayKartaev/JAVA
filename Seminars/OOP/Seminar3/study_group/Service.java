package JAVA.Seminars.OOP.Seminar3.study_group;





public class Service {
    private long id;
    private StudyGroup<Creatures> studyGroup;

    public Service() {
        studyGroup = new StudyGroup<>();
    }

    public void addStudent(String name, int age) {
        Student student = new Student(id++, name, age);
        studyGroup.addStudent(student);
    }

    public String getStudentsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Студенты:\n");

        // Iterator<Student> iterator = studyGroup.iterator();
        // while (iterator.hasNext()) {
        //     Student student = iterator.next();
        //     stringBuilder.append(student);
        //     stringBuilder.append("\n");
        // }                                    ------ это цикл FOREACH

        for (Creatures student : studyGroup) {
            stringBuilder.append(student);
            stringBuilder.append("\n");

        }
        return stringBuilder.toString();
    }


    public void sortByName () {
        studyGroup.sortByName();
    }

    public void sortByAge () {
        studyGroup.sortByAge();
    }
}
