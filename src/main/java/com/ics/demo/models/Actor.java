package com.ics.demo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="movies")

public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //auto increment
    @Column(name = "id")
    @NotNull(groups = Actor.update.class)
    private Long id;

    @Column(name = "name")
    @NotNull(groups = Actor.create.class)
    private String name;

    public Actor(@NotNull(groups = Actor.create.class) String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Actor() {
    }

    public interface create{};

    public interface update{};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
