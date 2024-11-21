package oo;

import java.util.Objects;

public class Person {

    private final int id;
    private final String name;
    private final int age;
    private final String role;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = "";
    }

    public Person(int id, String name, int age, String role){
        this.id = id;
        this.name = name;
        this.age = age ;
        this.role = role;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
