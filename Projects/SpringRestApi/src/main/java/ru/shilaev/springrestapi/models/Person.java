package ru.shilaev.springrestapi.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Person")
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    @NotEmpty(message = "Name should not be empty")
    @Size(max = 180, message = "name should be less then 180 chars")
    String name;

    @Column(name = "age")
    @NotNull(message = "Age should not be empty")
    @Min(value = 0, message = "Age should be bigger then 0")
    @Max(value = 150, message = "age should be less then 150")
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
