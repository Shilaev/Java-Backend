package ru.shilaev.springrestapi.db.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

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

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_who")
    @NotEmpty
    private String createdWho;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
