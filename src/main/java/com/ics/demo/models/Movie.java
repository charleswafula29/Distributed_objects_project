package com.ics.demo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @NotNull(groups = Update.class)
    private Long id;

    @Column(name = "name")
    @NotNull(groups = Create.class)
    private String name;

    @Column(name = "year_released")
    private String yearReleased;

    @OneToMany(mappedBy = "movie")
    private List<Actor> actor;

    @ManyToMany(mappedBy = "movies")
    private Set<Categories> categories = new HashSet<>();

    public Movie(String name, String year) {
        this.name = name;
        this.yearReleased = year;
    }

    private Movie(){

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

    public List<Actor> getActor() {
        return actor;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    public Set<Categories> getCategories() {
        return categories;
    }

    public void setCategories(Set<Categories> categories) {
        this.categories = categories;
    }


    public interface Create{}

    public interface Update{}

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearReleased='" + yearReleased + '\'' +
                ", actor=" + actor +
                ", categories=" + categories +
                '}';
    }
}
