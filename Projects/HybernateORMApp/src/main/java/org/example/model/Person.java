package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    public Integer getId() {
        return id;
    }
}
