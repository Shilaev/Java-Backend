package JavaSyntaxis.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class HashExplanationExample {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();

        personSet.add(new Person(1, "Mike"));
        personSet.add(new Person(1, "Mike"));

        System.out.println(personSet);

        //

        Set<String> stringSet = new HashSet<>();

        stringSet.add("MyString");
        stringSet.add("MyString");

        System.out.println(stringSet);
    }
}
