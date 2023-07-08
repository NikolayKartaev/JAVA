// package JAVA.Seminars.OOP.family_tree;

// import java.util.ArrayList;
// import java.util.List;

// public class GenealogyApp {

//     class Person {
//         private String name;
//         private List<Person> children;

//         public Person(String name) {
//             this.name = name;
//             this.children = new ArrayList<>();
//         }

//         public String getName() {
//             return name;
//         }

//         public void addChild(Person child) {
//             children.add(child);
//         }

//         public List<Person> getChildren() {
//             return children;
//         }
//     }

//     class FamilyTree {
//         private Person root;

//         public FamilyTree(Person root) {
//             this.root = root;
//         }

//         public Person getRoot() {
//             return root;
//         }
//     }

//     public static void main(String[] args) {
//         // Создание персон и построение генеалогического древа
//         Person person1 = new Person("John");
//         Person person2 = new Person("Mary");
//         Person person3 = new Person("Peter");
//         Person person4 = new Person("Alice");

//         person1.addChild(person2);
//         person1.addChild(person3);
//         person2.addChild(person4);

//         FamilyTree familyTree = new FamilyTree(person1);

//         // Получение детей выбранного человека
//         Person selectedPerson = person1;
//         List<Person> children = selectedPerson.getChildren();

//         System.out.println("Children of " + selectedPerson.getName() + ":");
//         for (Person child : children) {
//             System.out.println(child.getName());
//         }
//     }
// }