package com.ics.demo.models;

import javassist.tools.reflect.CannotCreateException;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="movies")

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //auto increment
    @Column(name = "id")
    @NotNull(groups = Update.class)
    private Long id;

    @Column(name = "name")
    @NotNull(groups = Create.class)
    private String name;

    @Column(name = "year_released")
    private String yearReleased;

    public Movie(String name, String yearReleased) {
        this.name = name;
        this.yearReleased = yearReleased;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(String yearReleased) {
        this.yearReleased = yearReleased;
    }

    public Movie() {
    }

    public interface Create{};

    public interface Update{};

}
