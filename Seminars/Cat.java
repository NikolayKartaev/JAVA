package JAVA.Seminars;

import java.util.ArrayList;

public class Cat {
    private String name;
    private Integer age;
    private boolean healthy;
    ArrayList<String> diseases = new ArrayList<>();

    public Cat(String name, Integer age, boolean healthy) {
        this.age = age;
        this.name = name;
        this.healthy = healthy;
    }

    public Cat(String name, Integer age) {
        this.age = age;
        this.name = name;
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s Возраст: %d",name, age);
    }


    public String Myau(int n) {
        String phrase = String.format("Кот %s мяукнул %d раз", this.name, n);
        return phrase;
    }

    public void Vaccine() {
        if (healthy) {
            System.out.println(String.format("Кот %s привит", this.name));
        } else {
            healthy = true;
            System.out.println(String.format("Мы привили кота %s!", this.name));

        }
    }

    public void isIll() {
        System.out.println(this.diseases);
    }

    public void addIllness(String illness) {
        this.diseases.add(illness);
        System.out.println(this.diseases);
    }
}
