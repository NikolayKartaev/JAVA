public class Worker {
    int id;
    int salary;
    String name;
    String surname;

    @Override
    public String toString() {
        return String.format("%d %d %s %s", id, salary, name, surname);
    }
}
