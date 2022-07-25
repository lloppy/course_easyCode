package lesson_18_19_20;

public class Person {
     final String name;
     final String surname;
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
        System.out.println("My name is "  + this.name + ". My secondname is " + this.surname);
    }
}
