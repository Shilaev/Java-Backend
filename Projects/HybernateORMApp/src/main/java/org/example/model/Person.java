package org.example.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

import java.util.LinkedList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @OneToMany(mappedBy = "owner")
    @Cascade({org.hibernate.annotations.CascadeType.PERSIST,
            org.hibernate.annotations.CascadeType.REMOVE})
    private List<Item> items;

    @OneToOne(mappedBy = "owner")
    @Cascade({org.hibernate.annotations.CascadeType.PERSIST,
            org.hibernate.annotations.CascadeType.REMOVE})
    private Passport passport;

    @ManyToMany
    @JoinTable(
            name = "person_goal",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "goal_id")
    )
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    private List<Goal> goals;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addItem(Item item) {
        if (items == null) items = new LinkedList<>();
        if (items.contains(item)) return;

        items.add(item);
        item.setOwner(this);
    }

    public void addPassport(Passport passport) {
        if (this.passport != null) return;

        this.passport = passport;
        passport.setOwner(this);
    }

    public void addGoal(Goal newGoal) {
        if (this.goals == null) this.goals = new LinkedList<>();

        this.goals.add(newGoal);
        newGoal.setPersonList(List.of(this));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", items=" + items +
                ", passport=" + passport +
                ", goals=" + goals +
                '}';
    }
}
